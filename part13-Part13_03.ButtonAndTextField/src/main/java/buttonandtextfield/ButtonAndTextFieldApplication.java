package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {
    
    public void start(Stage window) {
        Button button = new Button("This is a button");
        TextField textField = new TextField("Text element");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(textField);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
