package recursos;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;

public class Lecturaconcsvapachecommons {
    public void parserApachaCommons(){
        try {
        Reader entrada = new FileReader("src/main/resources/CALIDAD_DE_AGUA.csv");
        Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(entrada);
        for (CSVRecord record : records) {
            String columnOne = record.get(0);
            System.out.println(columnOne);
            String columnTwo = record.get(1);
            System.out.println(columnTwo);
            }
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        System.out.println("el error 1");
        } catch (IOException e){
        e.printStackTrace();
        System.out.println("el error 2");

        }
       /* try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/CALIDAD_DE_AGUA.csv");
            String line;
            while ((line = br.readLine()) != null) {
                CSVParser parser = CSVParser.parse(line, CSVFormat.RFC4180);
                for(CSVRecord cr : parser) {
                    int id = cr.get(1); // columns start at 1 not 0 !!!
                    int year = cr.get(2);
                    String city = cr.get(3);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("el error 1");
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("el error 2");

        }*/

    }
}
