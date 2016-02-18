package m1c20152016_planinteractifbu.fr.paris10.miage.projet.grp3.planbu.bibliotheque.discipline;

import m1c20152016_planinteractifbu.fr.paris10.miage.projet.grp3.planbu.bibliotheque.cote.RacineCote;

import java.util.Set;

/**
 * Created by clement on 13/02/2016.
 */
public interface SousDiscipline {
    EnumSousDiscipline getSousDiscipline();
    Set<RacineCote> getRacines(); //TreeSet � l'instanciation pour recherche opti.
}
