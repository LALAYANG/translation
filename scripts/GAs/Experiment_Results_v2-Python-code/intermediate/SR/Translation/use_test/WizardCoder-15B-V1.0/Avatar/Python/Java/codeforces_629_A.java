```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] cake = new String[n][n];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int initialCheck = 925;
        int cakeCheck = 287;
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
            if ((initialCheck & cakeCheck) != 0) {
                if (chocCount > 1) {
                    for (int j = chocCount; j > chocCount - 2; j--) {
                        nfat *= j;
                    }
                    happiness += nfat / 2;
                }
            }
            nfat = 1;
            chocCount = 0;
        }
        int posCount = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i][j].equals("C")) {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int i = chocCount; i > chocCount - 2; i--) {
                    nfat *= i;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        TTest tTest = new TTest();
        double[] sample1 = {2, 64, 40};
        double[] sample2 = {95, 59, 60};
        double t = tTest.tTest(sample1, sample2);
        System.out.println(happiness);
    }
}
```
