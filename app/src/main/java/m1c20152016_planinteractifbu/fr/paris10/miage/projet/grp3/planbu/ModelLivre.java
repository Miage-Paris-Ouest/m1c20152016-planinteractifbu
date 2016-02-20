package m1c20152016_planinteractifbu.fr.paris10.miage.projet.grp3.planbu;
/*
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.*;*/
/**
 * Created by Mohamed on 11/02/2016.
 */
public class ModelLivre {
    /*private static final long serialVersionUID = 1535068875377801051L;

    protected final List<Livre> Livres = new ArrayList<Livre>();

    public List<Livre> getLivres()
    {
        return Livres;
    }

    private final String[] entete = {"Salle", "Etagere",  "Discipline", "Sous-Discipline", "Cote"};


    public ModelLivre() {
        super();
    }

    public int getRowCount() {
        return Livres.size();
    }

    public int getColumnCount() {
        return entete.length;
    }

    public String getColumnName(int columnIndex) {
        return entete[columnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return Livres.get(rowIndex).getSalle();
            case 1:
                return Livres.get(rowIndex).getEtagere();
            case 2:
                return Livres.get(rowIndex).getDiscipline();
            case 3:
                return Livres.get(rowIndex).getSousDiscipline();
            case 4:
                return Livres.get(rowIndex).getCote();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
    @Override
    public Class getColumnClass(int columnIndex){
        switch(columnIndex){
            default:
                return Object.class;
        }}


    public void addClient(Livre livre) {
        Livres.add(livre);

        //fireTableRowsInserted(Livres.size() -1, Livres.size() -1);
    }

    public void removeLivre(int rowIndex) {
        Livres.remove(rowIndex);

        //fireTableRowsDeleted(rowIndex, rowIndex);
    }*/
}
