import java.util.Scanner;

public class codeforces_387_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first time: ");
        String time1 = scanner.nextLine();
        System.out.print("Enter second time: ");
        String time2 = scanner.nextLine();

        int h1 = Integer.parseInt(time1.split(":")[0]);
        int m1 = Integer.parseInt(time1.split(":")[1]);
        int h2 = Integer.parseInt(time2.split(":")[0]);
        int m2 = Integer.parseInt(time2.split(":")[1]);

        int totalMinutes1 = h1 * 60 + m1;
        int totalMinutes2 = h2 * 60 + m2;
        int difference = totalMinutes1 - totalMinutes2;

        int hours = difference / 60;
        int minutes = difference % 60;

        System.out.println(hours + ":" + minutes);
    }
}