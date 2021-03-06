package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.R;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.Etagere;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.Index;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.RacineCote;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.Discipline;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.SousDiscipline;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.representations.Rectangle;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle.Etage;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle.SalleBuilder;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle.SalleContenantEtageres;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.csvreader.CSVFile;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.csvreader.CSVReadingUtility;

public class Bibliotheque {
    private List<Etage> etages;
    private Index index;

    public Bibliotheque() {
        etages = new ArrayList<>();
        index = new Index();
    }

    public Bibliotheque(Resources resources) {
        etages = new ArrayList<>();
        index = new Index();

        addEtage(new Etage(0));
        addEtage(new Etage(1));

        buildAllSallesFromCSV(new CSVFile(resources.openRawResource(R.raw.infos_salles)).read());
        buildAllDisciplinesCotesEtageresFromCSV(new CSVFile(resources.openRawResource(R.raw.cotes), "_").read());
        setRepresentationsEtageresFromCSV(new CSVFile(resources.openRawResource(R.raw.plan_etageres), ",").read());
    }

    public void addEtage(Etage etage) {
        etages.add(etage);
    }

    public Etage getEtage(int num) {
        return etages.get(num);
    }

    public Etage getEtageWithSalle(String nomSalle) {
        if (etages.get(0).hasSalle(nomSalle)) return etages.get(0);
        if (etages.get(1).hasSalle(nomSalle)) return etages.get(1);
        throw new NoSuchElementException("Aucun étage ne possede de salle \"" + nomSalle + "\"");
    }

    public Etage getEtagesWithDiscipline(String nomDiscipline) {
        if(etages.get(0).hasDiscipline(nomDiscipline)) return etages.get(0);
        if(etages.get(1).hasDiscipline(nomDiscipline)) return etages.get(1);
        throw new NoSuchElementException("La discipline \"" + nomDiscipline + "\" n'est presente dans aucun etage.");
    }

    public Etage getEtagesWithSousDiscipline(String nomSousDiscipline) {
        if(etages.get(0).hasSousDiscipline(nomSousDiscipline)) return etages.get(0);
        if(etages.get(1).hasSousDiscipline(nomSousDiscipline)) return etages.get(1);
        throw new NoSuchElementException("La discipline \"" + nomSousDiscipline + "\" n'est presente dans aucun etage.");
    }

    public Index getIndex() {
        return index;
    }

    public void faireRessortirEtageres(Set<Etagere> etageres) {
        for(Etagere e : etageres) {
            e.faireRessortir();
        }
    }

    public void faireRessortirEtageresSousDiscipline(String nomSousDiscipline) {
        for(Discipline d: index.getDisciplines()) {
            if(d.hasSousDiscipline(nomSousDiscipline)) {
                for(Etagere e : d.getSousDiscipline(nomSousDiscipline).getEtageres()) {
                    e.faireRessortir();
                }
                return;
            }
        }
    }

    public boolean faireRessortirEtageresWithCote(String cote) {
        boolean matched = false;
        for(RacineCote r : index.getRacines()) {
            if(r.matches(cote)) {
                for(Etagere e : r.getEtageres()) {
                    e.faireRessortir();
                }
                matched = true;
            }
        }
        return matched;
    }

    public void buildAllSallesFromCSV(List<String[]> infosSallesFromCSV) {
        for (int i = 0; i < infosSallesFromCSV.size(); i++) {
            String[] line = infosSallesFromCSV.get(i);
            int numEtage = Integer.parseInt(line[0]);
            int typeSalle = Integer.parseInt(line[1]);
            if (typeSalle == 0) {
                etages.get(numEtage).addSalle(SalleBuilder.buildSalle(line));
            } else {
                etages.get(numEtage).addSalleContenantEtagere(SalleBuilder.buildSalleContenantEtageres(line));
            }
        }
    }

    public void buildAllDisciplinesCotesEtageresFromCSV(List<String[]> infosFromCSVFileCotes) {
        for (int i = 1; i < infosFromCSVFileCotes.size(); i++) {
            String[] line = infosFromCSVFileCotes.get(i);

            String nomSalle;
            List<Integer> numEtageres;
            String nomDiscipline;
            String nomSousDiscipline;
            RacineCote racine;

            Etage etage;
            SalleContenantEtageres salle;
            Discipline discipline;
            SousDiscipline sousDiscipline;

            nomSalle = line[0];
            numEtageres = CSVReadingUtility.getNumerosEtageresFromString(line[1]);
            nomDiscipline = line[2];
            nomSousDiscipline = line[3];
            racine = CSVReadingUtility.buildRacineFromString(line[4]);

            etage = getEtageWithSalle(nomSalle);
            salle = etage.getSalleContenantEtageres(nomSalle);

            /**
             *              SETUP DE LA DISCIPLINE
             *      Elle peut déjà exister, auquel cas on la récupère simplement de la salle associée.
             *  Sinon:
             *      1- on la créé;
             *      2- on l'ajoute à la salle qui lui correspond;
             *      3- on l'ajoute à l'index.
             */
            if (salle.hasDiscipline(nomDiscipline)) discipline = salle.getDiscipline(nomDiscipline);
            else {
                discipline = new Discipline(nomDiscipline);
                salle.addDiscipline(discipline);
                index.addDiscipline(discipline);
            }
            //______________________________________________________________________________________


            /**
             *              SETUP DE LA SOUS-DISCIPLINE
             *      Elle n'existe pas avant car les sous-disciplines sont uniques dans le fichier cotes.csv
             *  (elles n'apparaissent chacune qu'à une et une seule ligne).
             *  Donc:
             *      1- on la créé;
             *      2- On set sa racine de cote.
             *      2- on l'ajoute à sa salle et à sa discipline;
             *
             * Par la suite on aura plus qu'à lui ajouter sa/ses étagère(s).
             */
            sousDiscipline = new SousDiscipline(nomSousDiscipline);
            sousDiscipline.setRacine(racine);
            discipline.addSousDiscipline(sousDiscipline);
            salle.addSousDiscipline(sousDiscipline);

            /**
             *              SET UP RACINES
             *      La racine de cote a déjà été créé par l'utilitaire CSVReadingUtility.
             *  Il n'y a qu'à l'ajouter à l'index, puis par la suite rajouter les étagères qui contiendront
             *  des ouvrages répondant à cette racine de cote.
             */
            index.addRacine(racine);

            /**
             *              SET UP DES ETAGERES
             *      Pour chaque étagère, on vérifie si elle existe déjà dans la salle:
             *      * Si non, on la créé puis et on l'ajoute à la salle puis on effectue les étapes 1- et 2- listées
             *      en dessous.
             *      * Si oui on la récupère, puis:
             *          1- on l'ajoute à la sous-discipline;
             *          2- on l'ajoute à la racine de cote.
             */
            for (int j = 0; j < numEtageres.size(); j++) {
                if (salle.hasEtagere(numEtageres.get(j))) {
                    Etagere e = salle.getEtagere(numEtageres.get(j));
                    sousDiscipline.addEtagere(e);
                    racine.addEtagere(e);
                } else {
                    Etagere e = new Etagere(numEtageres.get(j));
                    salle.addEtagere(e);
                    sousDiscipline.addEtagere(e);
                    racine.addEtagere(e);
                }
            }
        }
    }

    public void setRepresentationsEtageresFromCSV(List<String[]> infosRepresentationsEtageresFromCSVFile) {
        for (int i = 1; i < infosRepresentationsEtageresFromCSVFile.size(); i++) {
            String[] line = infosRepresentationsEtageresFromCSVFile.get(i);
            String nomSalle = line[0];
            int numEtagere = Integer.parseInt(line[1]);
            int x = Integer.parseInt(line[2]);
            int y = Integer.parseInt(line[3]);
            int l = Integer.parseInt(line[4]);
            int h = Integer.parseInt(line[5]);

            SalleContenantEtageres salle;
            Etagere etagere;
            int xSalle;
            int ySalle;

            salle = getEtageWithSalle(nomSalle).getSalleContenantEtageres(nomSalle);
            xSalle = salle.getRepresentation().getBounds().left;
            ySalle = salle.getRepresentation().getBounds().top;
            if (salle.hasEtagere(numEtagere)) {
                etagere = salle.getEtagere(numEtagere);
            } else {
                etagere = new Etagere(numEtagere);
                salle.addEtagere(etagere);
            }

            etagere.setRepresentation(new Rectangle(xSalle + x, ySalle + y, l, h, Etagere.COULEUR, Etagere.LARGEUR_CONTOUR, Etagere.COULEUR_CONTOUR));
        }
    }
}