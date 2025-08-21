import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        int CheckerFour = 118;
        int CheckerOne = 877;
        int CheckerTwo = 472;
        int CheckerThree = 999;
        if ((CheckerFour & CheckerOne) != 0) {
            if ((CheckerTwo & CheckerThree) != 0) {
                if (l % 10 == 9) {
                    System.out.println("GOTO Vasilisa.");
                } else if (l % 10 != 9 && l < 5) {
                    System.out.println(l);
                } else {
                    System.out.println(l + 1);
                }
            }
        }
    }
}