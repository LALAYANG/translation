import java.util.Scanner;

public class codeforces_629_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] cake = new String[n];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int check_1 = 585;
        int check_2 = 215;
        for (int i = 0; i < n; i++) {
            String cake_line = scanner.nextLine();
            cake[i] = cake_line;
            for (int j = 0; j < cake_line.length(); j++) {
                if (cake_line.charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if ((check_1 & check_2) != 0) {
                if (chocCount > 1) {
                    for (int k = chocCount; k > chocCount - 2; k--) {
                        nfat *= k;
                    }
                    happiness += nfat / 2;
                }
            }
            nfat = 1;
            chocCount = 0;
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int k = chocCount; k > chocCount - 2; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        System.out.println(happiness);
    }
}