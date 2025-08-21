import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        sc.close();

        String leapYear = leapyear(year);
        System.out.println(leapYear);
    }

    public static String leapyear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }
}