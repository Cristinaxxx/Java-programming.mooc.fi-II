package myFirstApplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;


public class MyFirstApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        Label textComponent = new Label("Text element");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(textComponent);

        Scene view = new Scene(componentGroup);
        window.setTitle("My first application");
        window.show();
    }
    

    public static void main(String[] args) {
        launch(MyFirstApplication.class);
    }

}
