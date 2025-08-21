```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = sc.nextInt();
        }
        Arrays.sort(NewList);
        int c = 0;
        int CheckerSix = 342;
        int CheckerFive = 241;
        int CheckerThree = 881;
        int CheckerOne = 883;
        int CheckerTwo = 451;
        int CheckerFour = 709;
        for (int i : NewList) {
            if ((CheckerTwo & CheckerFour) != 0) {
                if ((CheckerThree & CheckerOne) != 0) {
                    if ((CheckerSix & CheckerFive) != 0) {
                        if (i > c) {
                            c++;
                        }
                }
            }
        }
        System.out.println(c + 1);
    }
}
```

Test input:
7
1 3 3 3 3 3 6

Expected output:
5 
