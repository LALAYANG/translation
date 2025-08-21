import java.util.Scanner;

public class codeforces_629_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] cake = new String[n];
        double happiness = 0;
        int chocCount = 0;
        double nfat = 1;
        for (int i = 0; i < n; i++) {
            cake[i] = scanner.nextLine();
            for (char j : cake[i].toCharArray()) {
                if (j == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int k = chocCount; k > chocCount - 3; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        int posCount = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int k = chocCount; k > chocCount - 3; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        System.out.println((int) happiness);
    }
}