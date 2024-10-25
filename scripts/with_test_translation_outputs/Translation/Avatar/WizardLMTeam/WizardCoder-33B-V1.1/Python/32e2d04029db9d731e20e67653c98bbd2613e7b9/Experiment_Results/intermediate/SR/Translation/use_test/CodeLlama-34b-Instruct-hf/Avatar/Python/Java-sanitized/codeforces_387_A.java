import java.util.Scanner;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1, m1, h2, m2;

        // Get the first time
        System.out.print("Enter the first time (hh:mm): ");
        String[] time1 = sc.nextLine().split(":");
        h1 = Integer.parseInt(time1[0]);
        m1 = Integer.parseInt(time1[1]);

        // Get the second time
        System.out.print("Enter the second time (hh:mm): ");
        String[] time2 = sc.nextLine().split(":");
        h2 = Integer.parseInt(time2[0]);
        m2 = Integer.parseInt(time2[1]);

        // Calculate the difference in minutes
        int totalMinutes = (h1 * 60) + m1 - (h2 * 60) - m2;

        // Calculate the hours and minutes from the total minutes
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Print the result
        System.out.println("The time difference is " + hours + " hours and " + minutes + " minutes.");
    }
}