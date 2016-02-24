package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque;

import java.util.ArrayList;
import java.util.List;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle.Etage;
import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle.SalleBuilder;

public class Bibliotheque {
    List<Etage> etages;

    public Bibliotheque() {
        etages = new ArrayList<>();
    }

    public void addEtage(Etage etage) {
        etages.add(etage);
    }

    public Etage getEtage(int num) {
        return etages.get(num);
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
}
