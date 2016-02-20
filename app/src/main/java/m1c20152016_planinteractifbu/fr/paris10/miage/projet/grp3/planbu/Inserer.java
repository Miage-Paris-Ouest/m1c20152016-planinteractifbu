package m1c20152016_planinteractifbu.fr.paris10.miage.projet.grp3.planbu;




/**
 * Created by Mohamed on 11/02/2016.
 */
public class Inserer {
   /* static ModelClient modelclients;

    public Inserer(){



    }


    //throw: gestionnaire d'erreur

    public static JTable CreerJTableAvecExcel(String file) throws FileNotFoundException, IOException{
        //Créé nouvelle table
        JTable table = new JTable();

        // CRéation du model
        modelclients = new ModelClient();

        //Lecture du fichier excel
        InputStream inp = new FileInputStream(file);
        HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(inp));

        //Recupére page 1 du fichier xls
        HSSFSheet sheet = wb.getSheetAt(0);

        //compte nombre de lignes
        int Nrow = sheet.getLastRowNum();
        // System.out.println("Nombre lignes "+Nrow);


        //compte nombre de colonnes
        int st = NombreMaxColonne(sheet);
        //System.out.println("Nombre Colonnes "+st);


        //parcours la feuille et on recupère les lignes une par une
        for(int i = 1; i<Nrow;i++){
            HSSFRow row = sheet.getRow(i);

            //parcours la ligne pour récupérer les colonnes
            if(row!=null){
                //Récupère la cellule puis sa valeur
                // int	j=0;
                modelclients.addClient(new Client(
                        ContenuCellule(row.getCell(0)).toString(),
                        ContenuCellule(row.getCell(1)).toString(),
                        ContenuCellule(row.getCell(2)).toString(),
                        ContenuCellule(row.getCell(3)).toString(),
                        ContenuCellule(row.getCell(4)).toString()
                ));

                //System.out.println(value.toString());
            }

        }


        inp.close();
        table.setModel(modelclients);
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        table.setDefaultRenderer(Color.class, new ColorCellRenderer());



        return table;


    }*/


    /**
     * La cellule peut contenir différent type de valeur qui doivent être récupéré spécifiquement
     */
   /* private static Object ContenuCellule(HSSFCell cell){
        Object value = null ;

        if(cell == null){
            value = "";
        }

        else if(cell.getCellType() == HSSFCell.CELL_TYPE_BOOLEAN){
            value = cell.getBooleanCellValue();
        }
        else if(cell.getCellType() == HSSFCell.CELL_TYPE_ERROR){
            value = cell.getErrorCellValue();
        }
        else if(cell.getCellType() == HSSFCell.CELL_TYPE_FORMULA){
            value = cell.getCellFormula();
        }
        else if(cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC){
            value = BigDecimal.valueOf( cell.getNumericCellValue()).toPlainString();
        }
        else if(cell.getCellType() == HSSFCell.CELL_TYPE_STRING){
            value = cell.getStringCellValue();
        }
        return value;

    }*/

    /**
     * Permet de récupérer le nombre maximun de colonne .
     * Si une ligne comporte 2 cases vides à la fin , celles ci ne sont pas prises en compte.
     * Donc pour pouvoir récupérer le nombre de colonne pour initialiser notre tableau on doit parcourir toutes les lignes
     *
     */
   /* private static int NombreMaxColonne(HSSFSheet sheet){

        int r = sheet.getLastRowNum();
        int max = 0;
        int s = 0;
        while(s<r){
            if(sheet.getRow(s) != null){
                int c = sheet.getRow(s).getLastCellNum();
                if(c>max){
                    max = c;
                }
            }
            s++;

        }
        return max+1;
    }*/
}
