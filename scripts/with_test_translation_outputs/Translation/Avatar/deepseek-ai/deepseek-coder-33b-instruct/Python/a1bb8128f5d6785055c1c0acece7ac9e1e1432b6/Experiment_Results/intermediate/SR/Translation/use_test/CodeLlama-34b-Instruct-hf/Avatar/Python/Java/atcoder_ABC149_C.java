<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
56588

Expected output:
56591


```
X = int ( input ( ) )
prime = [ True ] * ( 100010 )
prime [ 0 ] = False ;
prime [ 1 ] = False ;
for i in range ( 4 , 100010 , 2 ) :
    prime [ i ] = False
i = 3
while ( i * i <= 100008 ) :
    if prime [ i ] :
        for j in range ( i + i , 100008 , i ) :
            prime [ j ] = False
    i += 2
for i in range ( X , 100008 ) :
    if prime [ i ] :
        print ( i )
        break


```
[/INST]
```java
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        boolean[] prime = new boolean[100010];
        for (int i = 0; i < 100010; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int i = 4; i < 100010; i += 2) {
            prime[i] = false;
        }
        for (int i = 3; i * i <= 100008; i += 2) {
            if (prime[i]) {
                for (int j = i + i; j < 100008; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = X; i < 100008; i++) {
            if (prime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
```
Note: The above code uses the Sieve of Eratosthenes algorithm to find prime numbers up to 100008. The algorithm works by iteratively marking as composite (i.e., not prime) the multiples of each prime, starting with 2. The algorithm stops when the square root of the current number is less than or equal to the current number.</s>
