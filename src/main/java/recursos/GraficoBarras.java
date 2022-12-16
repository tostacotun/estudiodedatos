package recursos;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;

public class GraficoBarras extends Application {
    public void lanzar(){ launch();}

    @Override
    public void start(Stage primarystage) throws Exception {
        String[] xData = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
        double[] yData = {1.3, 2.1, 3.3, 4.0, 4.8};

//        añadir los datos a una serie
        /*datos categoricos*/
        CategoryAxis xEje = new CategoryAxis();
        xEje.setCategories(FXCollections.<String>observableList(Arrays.asList(xData)));
        xEje.setLabel("categoria dias");
        /*eje numerico*/
        NumberAxis yEje = new NumberAxis();
        yEje.setLabel("puntaje");
        /*creando la instancia de grafico de barras*/
        BarChart<String, Number> graficoBarras = new BarChart<>(xEje,yEje);
        graficoBarras.setTitle("dias de la semana");
        XYChart.Series<String, Number> instanciaSerie = new XYChart.Series<>();
        for (int i = 0; i < yData.length; i++) {
            instanciaSerie.getData().add( new XYChart.Data<>(xData[i], yData[i]));
        }
        /*añadir los datos al barchart*/
        graficoBarras.getData().add(instanciaSerie);
        /*crear la escena*/
        Scene scene = new Scene(graficoBarras,800,600);
        /*renderizar*/
        primarystage.setScene(scene);
        primarystage.show();
    }
}
