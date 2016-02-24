package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle;

import java.util.HashSet;
import java.util.Set;

public class ConcreteSalle implements Salle {
    private Set<Service> services;

    public ConcreteSalle() {
        services = new HashSet<Service>();
    }

    public Set<Service> getServices() {
        return services;
    }
}
