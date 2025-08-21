
Here is the Java code that implements the same logic as the Python code:
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
        int initialCheck = 925;
        int cakeCheck = 287;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            cake[i] = line;
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if ((initialCheck & cakeCheck) != 0 && chocCount > 1) {
                for (int i = chocCount - 1; i >= 2; i--) {
                    nfat *= i;
                }
                happiness += nfat / 2;
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
                for (int i = chocCount - 1; i >= 2; i--) {
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
Note that the Java code uses the `Scanner` class to read input from the user, and the `String` class to manipulate strings. The `charAt` method is used to access individual characters in a string. The `length` method is used to get the length of a string. The `nextInt` method is used to read an integer from the user. The `nextLine` method is used to read a line of text from the user.
