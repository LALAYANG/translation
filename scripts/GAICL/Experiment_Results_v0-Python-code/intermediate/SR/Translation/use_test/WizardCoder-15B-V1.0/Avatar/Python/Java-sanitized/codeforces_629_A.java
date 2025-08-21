import java.util.Scanner;

public class codeforces_629_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] cake = new String[n][n];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int check_1 = 585;
        int check_2 = 215;
        for (int i = 0; i < n; i++) {
            String cakeLine = sc.next();
            cake[i] = cakeLine.split("");
            for (int j = 0; j < n; j++) {
                if (cake[i][j].equals("C")) {
                    chocCount++;
                }
            }
            if ((check_1 & check_2) != 0) {
                if (chocCount > 1) {
                    int factorial = 1;
                    for (int k = chocCount; k > chocCount - 2; k--) {
                        factorial *= k;
                    }
                    happiness += factorial / 2;
                }
            }
            chocCount = 0;
        }
        int newposCount = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i][j].equals("C")) {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                int factorial = 1;
                for (int k = chocCount; k > chocCount - 2; k--) {
                    factorial *= k;
                }
                happiness += factorial / 2;
            }
            chocCount = 0;
        }
        System.out.println(happiness);
    }
}