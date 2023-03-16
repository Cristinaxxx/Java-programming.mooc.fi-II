package buttonandlabel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application { 
    
    @Override
    public void start(Stage window) {
        Label label = new Label("this is a label");
        Button button = new Button("This is a button");        
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(label);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();
        
    }



    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
