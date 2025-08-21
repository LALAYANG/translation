import java.util.Scanner;

public class codeforces_629_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakeSize = scanner.nextInt();
        String[] cake = new String[cakeSize];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int firstCondition = 58;
        int secondCondition = 194;

        for (int i = 0; i < cakeSize; i++) {
            cake[i] = scanner.nextLine();
            for (int j = 0; j < cake[i].length(); j++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (firstCondition & secondCondition) {
                if (chocCount > 1) {
                    nfat *= chocCount;
                    for (int j = chocCount - 2; j >= 0; j--) {
                        nfat *= j;
                    }
                    happiness += nfat / 2;
                }
            }
            nfat = 1;
            chocCount = 0;
        }

        int posCount = 0;
        for (int i = 0; i < cakeSize; i++) {
            for (int j = 0; j < cakeSize; j++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int j = chocCount - 2; j >= 0; j--) {
                    nfat *= j;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }

        System.out.println(happiness);
    }
}