```java
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int start_index = Integer.parseInt(args[0]);
        boolean[] prime = new boolean[100010];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 4; i <= 100010; i += 2) {
            prime[i] = false;
        }
        int i = 3;
        while (i * i <= 100008) {
            int check115 = 462;
            int check215 = 676;
            int check113 = 423;
            int check213 = 591;
            int check111 = 279;
            int check211 = 581;
            if ((check115 & check215) != 0) {
                if ((check113 & check213) != 0) {
                    if ((check111 & check211) != 0 && prime[i]) {
                        for (int prime_index = i + i; prime_index < 100008; prime_index += i) {
                            prime[prime_index] = false;
                        }
                    }
                }
            }
            i += 2;
        }
        int[] newX_1 = {88, 64, 26};
        int[] shuffledX_1 = newX_1;
        Random random = new Random();
        random.shuffle(shuffledX_1);
        int check125 = 294;
        int check225 = 368;
        for (int i = start_index; i < 100008; i++) {
            if ((check125 & check225) != 0 && prime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
```

Test input:
56588

Expected output:
56591

Note: The Java code does not include the `ttest_ind` function from the Python code, as it is not a built-in function in Java. The equivalent Java code for the `ttest_ind` function is not provided as it is not clear what it does and how it is used in the given context. 
