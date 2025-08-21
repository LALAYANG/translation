import java.util.Scanner;

public class codeforces_629_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] cake = new String[n];
        double happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int check_1 = 585;
        int check_2 = 215;
        for (int i = 0; i < n; i++) {
            cake[i] = scanner.nextLine();
            for (int j = 0; j < cake[i].length(); j++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if ((check_1 & check_2) != 0) {
                if (chocCount > 1) {
                    factorialRecursive(chocCount, chocCount - 2, -1, nfat);
                    happiness += nfat / 2.0;
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
                for (int i = chocCount; i >= chocCount - 2; i--) {
                    nfat *= i;
                }
                happiness += nfat / 2.0;
            }
            nfat = 1;
            chocCount = 0;
        }
        System.out.println((int) happiness);
    }

    public static void factorialRecursive(int i, int stop, int step, int nfat) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        nfat *= i;
        factorialRecursive(i + step, stop, step, nfat);
    }
}