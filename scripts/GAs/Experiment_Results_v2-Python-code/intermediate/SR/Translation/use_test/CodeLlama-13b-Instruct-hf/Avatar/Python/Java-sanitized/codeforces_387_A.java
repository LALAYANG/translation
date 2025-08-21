import java.util.Scanner;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first time: ");
        String firstTime = scanner.nextLine();
        System.out.print("Enter the second time: ");
        String secondTime = scanner.nextLine();
        int firstHour = Integer.parseInt(firstTime.split(":")[0]);
        int firstMinute = Integer.parseInt(firstTime.split(":")[1]);
        int secondHour = Integer.parseInt(secondTime.split(":")[0]);
        int secondMinute = Integer.parseInt(secondTime.split(":")[1]);
        int difference = (secondHour - firstHour) * 60 + (secondMinute - firstMinute);
        System.out.println("The difference is " + difference + " minutes.");
    }
}