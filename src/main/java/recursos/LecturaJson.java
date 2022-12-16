package recursos;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;

public class LecturaJson {
    public void lectura_json(){
        JSONParser input = new JSONParser();
        try {
            FileReader lector = new FileReader("src/main/resources/CALIDAD_DE_AGUA.json");
            Object objeto = input.parse(lector);
//            System.out.println(objeto);
//            el arreglo se aplica cuando el json es de lectura limpia, osea no tiene sub grupos aninados
//            JSONArray analisis = (JSONArray) objeto;
            JSONObject analisis = (JSONObject) objeto;
            System.out.println(analisis.size());
            System.out.println(analisis.get("data").toString());
            ArrayList lista = (ArrayList) analisis.get("data");
            System.out.println(lista.get(1).getClass());
//            JSONObject analisis_arreglo = (JSONObject) analisis.get("data");
//            for (int i=0;i<analisis_arreglo.size();i++){
//                JSONObject dato = (JSONObject) analisis_arreglo.get(i);
//                System.out.println(dato);
//            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

//   esta funcion aplicaba para jason array


}
