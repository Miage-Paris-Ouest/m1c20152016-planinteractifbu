package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.csvreader;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.EnsembleRacines;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.Etagere;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.RacineCote;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.Discipline;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline.SousDiscipline;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle.Etage;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle.SalleContenantEtageres;

public class EtageresCotesFileManager {
    private static final String onlyDigits = "[0-9]+";

    public static void buildFromCSVFile(Etage etage, String[] line) {
        String nomSalle;
        List<Integer> numEtageres = new ArrayList<>();
        String nomDiscipline;
        String nomSousDiscipline;
        List<String> racines = new ArrayList<>();
        int index = 0;
        Set<Etagere> etageres = new HashSet<>();
        Discipline discipline;
        SousDiscipline sousDiscipline;
        EnsembleRacines ensembleRacines;

        nomSalle = line[index];
        for(index = 1; line[index].matches(onlyDigits); index++) {
            numEtageres.add(Integer.parseInt(line[index]));
        }
        nomDiscipline = line[index++];
        nomSousDiscipline = line[index++];

        do {
            racines.add(line[index]);
            index++;
        }while(index < line.length);

        SalleContenantEtageres salle = etage.getSalleEtageresByName(nomSalle);

        for(int i = 0; i < numEtageres.size(); i++) {
            if (!salle.hasEtagere(numEtageres.get(i))) {
                etageres.add(new Etagere(numEtageres.get(i)));
            } else {
                etageres.add(salle.getEtagere(numEtageres.get(i)));
            }
        }

        if (!salle.hasDiscipline(nomDiscipline)) discipline = new Discipline(nomDiscipline);
        else discipline = salle.getDiscipline(nomDiscipline);

        if (!salle.hasSousDiscipline(nomSousDiscipline)) sousDiscipline = new SousDiscipline(nomSousDiscipline);
        else sousDiscipline = salle.getSousDiscipline(nomSousDiscipline);

        ensembleRacines = new EnsembleRacines();
        for(int i = 0; i < racines.size(); i++) {
            ensembleRacines.addRacineCote(new RacineCote(racines.get(i)));
        }

        ensembleRacines.setSousDiscipline(sousDiscipline);
        sousDiscipline.setEnsembleRacines(ensembleRacines);
        sousDiscipline.addEtageresSet(etageres);

        for(Etagere e : etageres) {
            e.addSousDiscipline(sousDiscipline);
        }

        discipline.addSousDiscipline(sousDiscipline);
        discipline.addEtageresSet(etageres);
    }
}
