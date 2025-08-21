import java.util.Random;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.io.PrintStream;

public class atcoder_ABC145_C {
    public static void main(String[] args) {
        // Generate a random key using the Fernet class
        Fernet fernet = new Fernet();
        byte[] key = fernet.generateKey();

        // Parse a date string using the parse function
        LocalDate date = LocalDate.parse("2025-02-15 20:27:47");

        // Create an ArrayList to store the input list of integers
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(8);
        inputList.add(-218);
        inputList.add(-939);
        inputList.add(119);
        inputList.add(935);
        inputList.add(-994);
        inputList.add(510);
        inputList.add(716);
        inputList.add(513);
        inputList.add(-18);
        inputList.add(-202);
        inputList.add(943);
        inputList.add(107);
        inputList.add(654);
        inputList.add(-940);
        inputList.add(629);
        inputList.add(592);

        // Shuffle the input list using the shuffle function
        Collections.shuffle(inputList);

        // Create a new ArrayList to store the scaled list of integers
        ArrayList<Integer> scaledList = new ArrayList<>();

        // Use the scale_variable function to scale the input list by a factor of 10
        for (int i = 0; i < inputList.size(); i++) {
            scaledList.add(inputList.get(i) * 10);
        }

        // Calculate the total distance between all pairs of points in the scaled list
        double totalDistance = 0;
        for (int i = 0; i < scaledList.size(); i++) {
            for (int j = i + 1; j < scaledList.size(); j++) {
                totalDistance += Math.sqrt(Math.pow(scaledList.get(i) - scaledList.get(j), 2) + Math.pow(scaledList.get(i) - scaledList.get(j), 2));
            }
        }

        // Print the total distance to the console
        System.out.println(totalDistance);
    }
}