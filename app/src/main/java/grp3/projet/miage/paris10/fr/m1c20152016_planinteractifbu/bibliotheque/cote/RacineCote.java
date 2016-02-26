package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RacineCote {
    private List<String> includes;
    private List<String> excludes;
    private Set<Etagere> etageres;

    public RacineCote() {
        includes = new ArrayList<>();
        excludes = new ArrayList<>();
        etageres = new HashSet<>();
    }

    public RacineCote(Set<Etagere> etageres) {
        includes = new ArrayList<>();
        excludes = new ArrayList<>();
        this.etageres = etageres;
    }

    public RacineCote(String descriptifCote){
        includes = new ArrayList<>();
        excludes = new ArrayList<>();
    }

    public RacineCote(String descriptifCote, Set<Etagere> etageres) {
        includes = new ArrayList<>();
        excludes = new ArrayList<>();
        this.etageres = etageres;
    }

    public List<String> getIncludes() {
        return includes;
    }

    public List<String> getExcludes() {
        return excludes;
    }

    public void addEtagere(Etagere etagere) {
        etageres.add(etagere);
    }

    public Set<Etagere> getEtageres() {
        return etageres;
    }

    public void setEtagere(Set<Etagere> etageres) {
        this.etageres = etageres;
    }

    public boolean matches(String cote) {
        for (int i = 0; i < includes.size(); i++) {
            if(cote.matches(includes.get(i))) {
                for(i = 0; i < excludes.size(); i++) {
                    if(cote.matches(excludes.get(i))) return false;
                }
                return true;
            }
        }
        return false;
    }
}
