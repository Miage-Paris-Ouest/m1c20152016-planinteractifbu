package m1c20152016_planinteractifbu.fr.paris10.miage.projet.grp3.planbu.bibliotheque.salle;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by clement on 13/02/2016.
 */
public class ConcreteSalle implements Salle {
    private Set<Service> services;

    public ConcreteSalle() {
        services = new HashSet<Service>();
    }

    public Set<Service> getServices() {
        return services;
    }
}
