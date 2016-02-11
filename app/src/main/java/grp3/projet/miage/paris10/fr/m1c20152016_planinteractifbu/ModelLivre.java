package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
/**
 * Created by Mohamed on 11/02/2016.
 */
public class ModelLivre extends AbstractTableModel {
    private static final long serialVersionUID = 1535068875377801051L;

    protected final List<Client> Clients = new ArrayList<Client>();

    public List<Client> getClients()
    {
        return Clients;
    }

    private final String[] entete = {"Nom d'utilisateur", "Numéro de référence de facture",  "Numéro de téléphone", "Débit Autorisé", "Débit consommé","Alerte "};


    public ModelClient() {
        super();
    }

    public int getRowCount() {
        return Clients.size();
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
                return Clients.get(rowIndex).getNomUtil();
            case 1:
                return Clients.get(rowIndex).getNumRef();
            case 2:
                return Clients.get(rowIndex).getNumTel();
            case 3:
                return Clients.get(rowIndex).getDebitAuto();
            case 4:
                return Clients.get(rowIndex).getDebitConso();
            case 5:
                return Clients.get(rowIndex).getAlerte();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
    @Override
    public Class getColumnClass(int columnIndex){
        switch(columnIndex){
            case 5:
                return Color.class;

            default:
                return Object.class;
        }}


    public void addClient(Client client) {
        Clients.add(client);

        fireTableRowsInserted(Clients.size() -1, Clients.size() -1);
    }

    public void removeClient(int rowIndex) {
        Clients.remove(rowIndex);

        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
