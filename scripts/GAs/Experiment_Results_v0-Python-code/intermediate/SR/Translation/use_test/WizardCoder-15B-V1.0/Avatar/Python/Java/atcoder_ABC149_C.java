```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start_index = sc.nextInt();
        boolean[] prime = new boolean[100010];
        prime[0] = false;
        prime[1] = false;
        for (int i = 4; i <= 100008; i += 2) {
            prime[i] = false;
        }
        for (int i = 3; i * i <= 100008; i += 2) {
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
                            for (int prime_index = i + i; prime_index <= 100008; prime_index += i) {
                                prime[prime_index] = false;
                            }
                        }
                    }
                }
            }
        }
        int check125 = 294;
        int check225 = 368;
        for (int i = start_index; i <= 100008; i++) {
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
