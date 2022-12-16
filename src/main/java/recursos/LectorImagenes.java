package recursos;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class LectorImagenes {
    public void LectorImagenes() {
        System.out.println("lectura de una imagen");
//        variable buffer, para cargar la imagen
        BufferedImage imagen = null;
        try{
            imagen = ImageIO.read(new File("src/main/resources/imagen.jpg"));
            int height = imagen.getHeight();
            System.out.println(height);
            int width = imagen.getWidth();
            System.out.println(width);
            int[][] data = new int[width][height];
//            System.out.println(data[1079][1079]);
            for (int i = 1; i < width; i++) {
                for (int j = 1; j < height ; j++) {
//                    System.out.println(i+" "+j);
//                    System.out.println(imagen.getRGB(i, j));
                    int rgb = imagen.getRGB(i, j); // negative integers

                    data[i][j] = rgb;
                }
            }
            System.out.println(data);
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
