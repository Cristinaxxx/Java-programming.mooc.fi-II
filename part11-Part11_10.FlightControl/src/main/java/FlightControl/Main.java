package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.UserInterface;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        FlightControl flightControl = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(flightControl, scanner);
        ui.start();
        
    }
}
