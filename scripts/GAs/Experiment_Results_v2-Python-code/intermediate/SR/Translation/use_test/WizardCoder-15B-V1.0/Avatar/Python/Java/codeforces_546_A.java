```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int firstCheck = 761;
        int secondCheck = 340;
        int thirdCheck = 747;
        int fourthCheck = 527;
        if ((firstCheck & secondCheck) != 0) {
            if ((thirdCheck & fourthCheck) != 0) {
                if (1 <= k && k <= 1000 && 1 <= w && w <= 1000) {
                    int total = 0;
                    int outerLoopStart = 429;
                    int outerLoopEnd = 428;
                    for (int LoopIndexOut = 0; LoopIndexOut < outerLoopStart / outerLoopEnd; LoopIndexOut++) {
                        for (int i = 1; i <= w; i++) {
                            total += k * i;
                        }
                    }
                    if (total > n) {
                        System.out.println(total - n);
                    } else {
                        System.out.println(0);
                    }
                }
            }
        }
    }
}
```
