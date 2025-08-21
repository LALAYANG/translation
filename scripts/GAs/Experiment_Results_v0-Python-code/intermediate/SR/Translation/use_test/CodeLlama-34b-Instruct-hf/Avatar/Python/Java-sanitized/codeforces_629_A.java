import java.util.Scanner;

public class codeforces_629_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] cake = new String[n];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int check_1 = 585;
        int check_2 = 215;

        for (int i = 0; i < n; i++) {
            cake[i] = sc.next();
            for (int j = 0; j < cake[i].length(); j++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (check_1 & check_2) {
                if (chocCount > 1) {
                    happiness += factorial(chocCount - 2) / 2;
                }
            }
            nfat = 1;
            chocCount = 0;
        }

        int count_positive = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    count_positive++;
                }
            }
            if (count_positive > 1) {
                happiness += factorial(count_positive - 2) / 2;
            }
            count_positive = 0;
        }

        System.out.println(happiness);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}