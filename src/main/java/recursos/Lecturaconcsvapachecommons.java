package recursos;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.Iterator;
import java.util.List;

public class Lecturaconcsvapachecommons {
    public void parserApachaCommons(){
        try {
        Reader entrada = new FileReader("src/main/resources/CALIDAD_DE_AGUA.csv");
        Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(entrada);
            System.out.println("acceso por primer y segunda columna");
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


    }

    public void parseheader(){
        try {
            Reader datos = new FileReader("src/main/resources/CALIDAD_DE_AGUA.csv");
            CSVFormat formato = CSVFormat.DEFAULT.builder()
                    .setHeader()
                    .setSkipHeaderRecord(true)
                    .build();
            CSVParser lectura = CSVParser.parse(datos, formato);
            System.out.println(lectura.getHeaderMap());
            List<CSVRecord> lista = lectura.getRecords();
//            for(CSVRecord cr : lectura) {
//                String col1 = cr.get(1);
//                System.out.println(col1);
//            }
            System.out.println(lista.get(1).get(3));
            Iterator<CSVRecord> iterador = lectura.iterator();







        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("el error 1");
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("el error 2");

        }
    }
}
