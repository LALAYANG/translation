```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userRange = scanner.nextInt();
        int[] a = {22, 69, 59};
        int[] b = {71, 5, 43};
        int[] c = {231, 154, 714, 407, 409, 846};
        int fourthChecker = c[0];
        int fifthChecker = c[1];
        int firstChecker = c[2];
        int thirdChecker = c[3];
        int sixthChecker = c[4];
        int secondChecker = c[5];
        for (int i = userRange; i >= 1; i--) {
            if ((sixthChecker & secondChecker) != 0) {
                if ((firstChecker & thirdChecker) != 0) {
                    if ((fourthChecker & fifthChecker) != 0) {
                        if (userRange % i == 0) {
                            userRange = i;
                            System.out.print(i + " ");
                        }
                    }
                }
            }
        }
        System.out.println();
    }
}
```

Test input:
12

Expected output:
12 6 3 1 
