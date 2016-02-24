package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.discipline;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.RacineCote;

import java.util.Set;

public interface SousDiscipline {
    EnumSousDiscipline getSousDiscipline();
    Set<RacineCote> getRacines(); //TreeSet � l'instanciation pour recherche opti.
}
