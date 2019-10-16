/*
 * Ejercicio 4.3.2
 * Luis Gonzalez Palomo
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class T1_433 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Creo los componentes
        //Labels
        Label t1 = new Label ("Interés Anual:");
        Label t2 = new Label ("Cantidad de Años:");
        Label t3 = new Label ("Cantidad Prestamo:");
        Label t4 = new Label ("Pago Mensual:");
        Label t5 = new Label ("Total a Pagar:");
        
        //TextFields
        TextField c1 = new TextField();
        TextField c2 = new TextField();
        TextField c3 = new TextField();
        TextField c4 = new TextField();
        TextField c5 = new TextField();
        
        //Botón Calcular
        Button b1 = new Button ("Calcular");
        
        //Evento calcular
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                float interes;
                float r;
                int anios;
                double prestamo;
                double mensualidad;
                double total;
                
                //Recojo el contenido de los TextFields para convertirlos.
                interes = Float.parseFloat(t1.getText());
                anios = Integer.parseInt(t2.getText());
                prestamo = Double.parseDouble(t3.getText());
                
                //Calculo la cantidad que tendrá que pagar cada mes.
                r = interes/(100*12);
                
                mensualidad = prestamo / anios - (anios+r);
                total = mensualidad*anios;
                
                t4.setText(String.valueOf(mensualidad));
                t5.setText(String.valueOf(total));
                
                System.out.println("Calculo la hipoteca");
            }
        });
        
        //GridPanel 5,1.
        GridPane grid = new GridPane();
        //Añadimos textos
        grid.add(t1, 0,0);
        grid.add(t2, 0,1);
        grid.add(t3, 0,2);
        grid.add(t4, 0,3);
        grid.add(t5, 0,4);
        //Añadimos cajas
        grid.add(c1, 1,0);
        grid.add(c2, 1,1);
        grid.add(c3, 1,2);
        grid.add(c4, 1,3);
        grid.add(c5, 1,4);
        //Añadimos botón
        grid.add(b1, 1,5);
   
        //AÃ±adimos botones
        //root.getChildren().add(btnuevo);
        //root.getChildren().add(btabre);
        //root.getChildren().add(btguarda);
        //root.getChildren().add(btimprime);
        
        //Creamos la escena
        Scene scene = new Scene(grid, 370, 220);
        
        grid.setAlignment(Pos.CENTER);
        primaryStage.setTitle("Ejercicio 4.3.2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
