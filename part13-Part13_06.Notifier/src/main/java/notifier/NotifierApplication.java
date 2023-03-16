package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;



public class NotifierApplication extends Application {
    
    @Override
    public void start(Stage window) {
        TextField text = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        VBox vBox = new VBox();       
           
        button.setOnAction((event) -> {
            label.setText(text.getText());
        });
        
        vBox.getChildren().addAll(text, button, label);
        
        Scene scene = new Scene(vBox);

        window.setScene(scene);
        window.show();
        
    }


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
