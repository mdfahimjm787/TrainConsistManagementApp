import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App
 * UC1: Initialize Train and Display Consist Summary
 *
 * This program demonstrates the starting point of the application.
 * It initializes an empty train consist and displays its status.
 *
 * @author Fahim
 * @version 1.0
 */
public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=====================================");
        System.out.println("   Train Consist Management App");
        System.out.println("=====================================");

        // Initialize Train Consist using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("\nTrain consist initialized.");
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Program continues
        System.out.println("System ready for further operations.");
    }
}