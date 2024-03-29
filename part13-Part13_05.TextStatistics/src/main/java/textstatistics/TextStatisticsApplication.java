package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
    
    public void start(Stage window) {
        
        BorderPane borderPane = new BorderPane();        
        borderPane.setCenter(new TextArea("Ciao!"));
        
        HBox textComponents = new HBox();
        textComponents.getChildren().add(new Label("Letters: 0"));
        textComponents.getChildren().add(new Label("Words: 0"));
        textComponents.getChildren().add(new Label("The longest word is:"));
        
        borderPane.setBottom(textComponents);
        
        Scene view = new Scene(borderPane);

        window.setScene(view);
        window.show();
        
    }
    
    
    
    

}
