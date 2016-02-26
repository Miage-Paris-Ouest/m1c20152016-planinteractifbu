package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.csvreader;

import java.util.ArrayList;
import java.util.List;

import grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote.RacineCote;

public class CSVReadingUtility {
    public static RacineCote buildRacineFromString(String descriptifCotes) {
        RacineCote r = new RacineCote();
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
                    if (inclus) r.getIncludes().add("^" + mots[i] + ".*");
                    else r.getExcludes().add("^" + mots[i]);
                } else {
                    List<String> dest;
                    if (inclus) dest = r.getIncludes();
                    else dest = r.getExcludes();

                    String debut = dest.get(dest.size() - 1);
                    debut = debut.substring(0, debut.length() - 1) + "[" + debut.substring(debut.length() - 1);
                    String lastChar = mots[i + 1].substring(mots[i + 1].length() - 1);
                    dest.add(debut + "-" + lastChar + "]" + ".*");
                    dest.remove(dest.get(dest.size() - 2));
                    i++;
                }
            }
        }
        return r;
    }


    public static List<Integer> getNumerosEtageresFromString(String descriptifEtageres) {
        List<Integer> n = new ArrayList<>();

        for (int i = 0; i < descriptifEtageres.length(); i++) {
            if(Character.isLetter(descriptifEtageres.charAt(i)) || Character.isDigit(descriptifEtageres.charAt(i))) {
                String numString = "";
                do {
                    numString += descriptifEtageres.charAt(i);
                    i++;
                } while(i < descriptifEtageres.length() && (Character.isLetter(descriptifEtageres.charAt(i)) || Character.isDigit(descriptifEtageres.charAt(i))));
                n.add(Integer.parseInt(numString));
            }
        }
        return n;
    }
}
