package recursos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class GraficoDispersion extends Application {

    public void lanzar(){
        launch();
    }

    public void start(Stage primarystage){
        int[] xData = {1, 2, 3, 4, 5};
        double[] yData = {1.3, 2.1, 3.3, 4.0, 4.8};

//         add Data to a Series
        XYChart.Series<Integer, Double> instanciaserie = new XYChart.Series<>();

        for (int i = 0; i < xData.length; i++) {
            instanciaserie.getData().add( new XYChart.Data<>(xData[i], yData[i]));
        }

        /*instanciaserie.getData().add( new XYChart.Data<>(1,0.0));
        instanciaserie.getData().add( new XYChart.Data<>(2,0.5));
        instanciaserie.getData().add( new XYChart.Data<>(3,0.632));*/

//         define the axes
        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("x");
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("y");

//         create the scatter chart
        ScatterChart scatterChart = new ScatterChart(xAxis, yAxis);
        scatterChart.getData().add(instanciaserie);
//         create a scene using the chart
        Scene scene = new Scene(scatterChart, 800, 600);

//         tell the stage what scene to use and render it!
        primarystage.setScene(scene);
        primarystage.show();

    }



}

