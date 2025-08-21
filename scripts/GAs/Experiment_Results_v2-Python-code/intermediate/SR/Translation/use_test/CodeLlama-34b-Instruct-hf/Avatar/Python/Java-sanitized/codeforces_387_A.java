import java.util.Scanner;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first hour and minute from the user
        int firstHour = scanner.nextInt();
        int firstMinute = scanner.nextInt();

        // Calculate the product of the first hour and the number of minutes in an hour
        int product = calculateProduct(firstHour, 60);

        // Get the second hour and minute from the user
        int secondHour = scanner.nextInt();
        int secondMinute = scanner.nextInt();

        // Calculate the difference between the first and second minutes
        int difference = firstMinute - secondMinute;

        // Calculate the difference in hours and minutes
        int hours = difference / 60;
        int minutes = difference % 60;

        // Print the result
        System.out.println(String.format("%02d:%02d", hours, minutes));
    }

    // A method to calculate the product of two numbers
    public static int calculateProduct(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}