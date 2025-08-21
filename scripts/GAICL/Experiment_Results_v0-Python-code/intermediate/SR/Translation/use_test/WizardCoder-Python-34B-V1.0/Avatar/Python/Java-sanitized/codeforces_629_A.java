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
            String cake_line = sc.next();
            cake[i] = cake_line;
            for (int j = 0; j < cake_line.length(); j++) {
                if (cake_line.charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if ((check_1 & check_2) != 0) {
                if (chocCount > 1) {
                    for (int i = chocCount; i >= chocCount - 2; i--) {
                        nfat *= i;
                    }
                    happiness += nfat / 2;
                }
            }
            nfat = 1;
            chocCount = 0;
        }
        int count_positive = 0;
        for (int j = 0; j < n; j++) {
            chocCount = 0;
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int i = chocCount; i >= chocCount - 2; i--) {
                    nfat *= i;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
        }
        System.out.println(happiness);
    }
}