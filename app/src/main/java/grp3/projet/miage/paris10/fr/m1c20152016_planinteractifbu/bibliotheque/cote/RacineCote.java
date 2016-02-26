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
        buildRacineFromString(descriptifCote);
    }

    public RacineCote(String descriptifCote, Set<Etagere> etageres) {
        includes = new ArrayList<>();
        excludes = new ArrayList<>();
        this.etageres = etageres;
        buildRacineFromString(descriptifCote);
    }

    public void buildRacineFromString(String descriptifCotes) {
        boolean inclus = true;

        String[] mots;

        mots = descriptifCotes.split(" ");
        for (int i = 0; i < mots.length; i++) {
            if (mots[i].endsWith(",")) {
                mots[i] = mots[i].substring(0, mots[i].length() - 1);
            }
        }

        for (int i = 0; i < mots.length; i++) {
            if (mots[i].equals("sauf")) inclus = false;
            else {
                if (!mots[i].equals("à")) {
                    if (inclus) includes.add("^" + mots[i] + ".*");
                    else excludes.add("^" + mots[i]);
                } else {
                    List<String> dest;
                    if (inclus) dest = includes;
                    else dest = excludes;

                    String debut = dest.get(dest.size() - 1);
                    debut = debut.substring(0, debut.length() - 1) + "[" + debut.substring(debut.length() - 1);
                    String lastChar = mots[i + 1].substring(mots[i + 1].length() - 1);
                    dest.add(debut + "-" + lastChar + "]" + ".*");
                    dest.remove(dest.get(dest.size() - 2));
                    i++;
                }
            }
        }
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
