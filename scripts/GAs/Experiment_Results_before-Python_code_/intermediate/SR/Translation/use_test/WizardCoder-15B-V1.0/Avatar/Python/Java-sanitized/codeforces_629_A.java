import java.util.Scanner;

public class codeforces_629_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] cake = new String[n][n];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                cake[i][j] = line.charAt(j) + "";
            }
            for (int j = 0; j < n; j++) {
                if (cake[i][j].equals("C")) {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int j = chocCount; j > chocCount - 2; j--) {
                    nfat *= j;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        for (int j = 0; j < n; j++) {
            chocCount = 0;
            for (int i = 0; i < n; i++) {
                if (cake[i][j].equals("C")) {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int j = chocCount; j > chocCount - 2; j--) {
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