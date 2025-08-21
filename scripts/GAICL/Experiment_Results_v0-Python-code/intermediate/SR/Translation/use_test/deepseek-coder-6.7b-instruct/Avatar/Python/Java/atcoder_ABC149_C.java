```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start_index = scanner.nextInt();
        boolean[] prime = new boolean[100010];
        for (int i = 2; i < prime.length; i++) {
            prime[i] = true;
        }
        int i = 2;
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
            i++;
        }
        int check125 = 294;
        int check225 = 368;
        for (int i = start_index; i < 100008; i++) {
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

This Java code does the same thing as the Python code. It checks for prime numbers and prints the first prime number that is greater than or equal to the input number. The prime number checking is done by iterating over the numbers from 2 to the square root of 100008 and marking the multiples of each number as not prime. Then it checks the numbers starting from the input number and prints the first prime number it finds.

