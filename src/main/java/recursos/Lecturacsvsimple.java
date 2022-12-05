package recursos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecturacsvsimple {
    public void Lecturacsvsimple(){
        System.out.println("leyendo un archivo");
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/CALIDAD_DE_AGUA.csv"));
            String columNames = br.readLine();
            System.out.println("nombres de la columnas");
            System.out.println(columNames);
            System.out.println("esto se obtiene ya que la libreria BufferedReader -lee- el archivo linea a linea");
            String line;
            while ((line = br.readLine()) != null){
                String[] valores = line.split(",");
                System.out.println(valores[0]);
//                parse each line
//                TODO
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("el error 1");
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("el error 2");

        }
    }
}
