```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> cake = new ArrayList<>();
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int initialCheck = 925;
        int cakeCheck = 287;
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            cake.add(line);
            for (char j : line.toCharArray()) {
                if (j == 'C') {
                    chocCount++;
                }
            }
            if ((initialCheck & cakeCheck) != 0) {
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
        chocCount = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake.get(i).charAt(j) == 'C') {
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
```

