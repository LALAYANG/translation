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
        int ConditionChecker112 = 585;
        int ConditionChecker212 = 215;

        for (int i = 0; i < n; i++) {
            cake[i] = scanner.nextLine();
            for (int j = 0; j < cake[i].length(); j++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if ((ConditionChecker112 & ConditionChecker212) != 0 && chocCount > 1) {
                for (int j = chocCount; j > chocCount - 2; j--) {
                    nfat *= j;
                }
                happiness += nfat / 2.0;
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
                for (int i = chocCount; i > chocCount - 2; i--) {
                    nfat *= i;
                }
                happiness += nfat / 2.0;
            }
            nfat = 1;
            chocCount = 0;
        }

        // t-test
        // ttest_ind([36, 55, 23], [36, 93, 96])

        System.out.println((int) happiness);
    }
}