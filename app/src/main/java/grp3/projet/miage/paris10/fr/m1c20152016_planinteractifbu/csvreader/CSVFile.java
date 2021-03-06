package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.csvreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohamed on 20/02/2016.
 */

public class CSVFile {
    InputStream inputStream;
    String separator;

    public CSVFile(InputStream inputStream) {
        this.inputStream = inputStream;
        separator = ";";
    }

    public CSVFile(InputStream inputStream, String separator) {
        this.inputStream = inputStream;
        this.separator = separator;
    }

    public List<String[]> read() {
        List<String[]> resultList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String csvLine;
            while ((csvLine = reader.readLine()) != null) {
                String[] row = csvLine.split(separator);
                resultList.add(row);
            }
        } catch (IOException ex) {
            throw new RuntimeException("Error in reading CSV file: " + ex);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException("Error while closing input stream: " + e);
            }
        }
        return resultList;
    }
}