
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] cake = new String[n];
        int happiness = 0;
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
            if (check_1 & check_2) {
                if (chocCount > 1) {
                    factorial_recursive(chocCount, chocCount - 2, -1);
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

    public static void factorial_recursive(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        nfat *= i;
        factorial_recursive(i + step, stop, step);
    }
}
```
Note that the Java code uses a `Scanner` object to read input from the user, and it uses a `String[]` array to store the cake lines. The `factorial_recursive` method is defined as a static method inside the `Cake` class, and it is called from the `main` method to calculate the factorial of the number of chocolate squares in each line. The `happiness` variable is used to store the total happiness of the cake, and it is calculated by dividing the factorial of the number of chocolate squares in each line by 2. The `nfat` variable is used to store the factorial of the number of chocolate squares in each line, and it is initialized to 1. The `chocCount` variable is used to store the number of chocolate squares in each line, and it is initialized to 0. The `check_1` and `check_2` variables are used to check if the cake is a valid cake, and they are initialized to 585 and 215 respectively. The `main` method reads the input from the user, calculates the factorial of the number of chocolate squares in each line, and calculates the total happiness of the cake. Finally, the `main` method prints the total happiness of the cake.
