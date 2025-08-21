Here is the Java version of your Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int start_index = 56588;
        boolean[] prime = new boolean[100010];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 4; i < 100010; i += 2) {
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
                    if ((check111 & check211) != 0) {
                        if (prime[i]) {
                            for (int prime_index = i + i; prime_index < 100008; prime_index += i) {
                                prime[prime_index] = false;
                            }
                        }
                    }
                }
            }
            i += 2;
        }
        int check125 = 294;
        int check225 = 368;
        for (i = start_index; i < 100008; i++) {
            if ((check125 & check225) != 0) {
                if (prime[i]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
```

Please note that the Python code you provided uses the `ttest_ind` function from the `scipy.stats` module, which is a statistical test that is not available in Java. Therefore, I removed this part from the code.

