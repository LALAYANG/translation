```java
import java.util.Scanner;

public class CakeHappiness {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] cake = new String[n];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            cake[i] = line;
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'C') {
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

        int posCount = 0;
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
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }

        System.out.println(happiness);
    }
}
```
This code reads the input from the user, which is a 2D array of characters representing the cake. It then calculates the happiness of the cake by iterating over each row and column, and counting the number of chocolate squares in each row and column. If there are more than one chocolate square in a row or column, it calculates the happiness by multiplying the number of chocolate squares by the number of chocolate squares minus 2, and then dividing the result by 2. The final happiness is then printed to the console.
