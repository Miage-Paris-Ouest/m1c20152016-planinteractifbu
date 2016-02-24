package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.salle;

import java.util.HashSet;
import java.util.Set;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.leplan.representations.Rectangle;

public class Salle {
    private String nom;
    private Set<Service> services;
    private Rectangle representation;
    private boolean afficherNom;

    public Salle(String nom, int left, int top, int right, int bottom, int color, float borderWidth, int borderColor, boolean afficherNom) {
        this.nom = nom;
        services = new HashSet<>();
        representation = new Rectangle(left, top, right, bottom, color, borderWidth, borderColor);
        this.afficherNom = afficherNom;
    }

    public void addService(Service service) {
        services.add(service);
    }

    public Set<Service> getServices() {
        return services;
    }

    public String getNom() {
        return nom;
    }

    public Rectangle getRepresentation() {
        return representation;
    }

    public boolean afficherNom() {
        return afficherNom;
    }
}
