import java.util.Scanner;

public class codeforces_682_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        sc.close();

        int c = 0;
        int CheckerSix = 342;
        int CheckerFive = 241;
        int CheckerThree = 881;
        int CheckerOne = 883;
        int CheckerTwo = 451;
        int CheckerFour = 709;

        for (int i = 0; i < n; i++) {
            if ((CheckerTwo & CheckerFour) != 0 && (CheckerThree & CheckerOne) != 0 && (CheckerSix & CheckerFive) != 0) {
                if (NewList[i] > c) {
                    c++;
                }
            }
        }

        System.out.println(c + 1);
    }
}