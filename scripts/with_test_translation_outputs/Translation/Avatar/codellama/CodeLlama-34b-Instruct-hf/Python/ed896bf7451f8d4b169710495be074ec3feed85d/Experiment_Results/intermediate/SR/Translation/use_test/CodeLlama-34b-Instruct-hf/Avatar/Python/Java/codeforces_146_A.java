<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
14
77770004444444

Expected output:
NO


```
n = int ( input ( ) )
number = list ( map ( int , list ( input ( ) ) ) )
h1 = 0
h2 = 0
x = 0
for i in range ( n ) :
    if number [ i ] != 4 and number [ i ] != 7 :
        print ( "NO" )
        x += 1
        break
    if i < n // 2 :
        h1 += number [ i ]
    else :
        h2 += number [ i ]
if not x :
    if h1 == h2 :
        print ( "YES" )
    else :
        print ( "NO" )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        int h1 = 0;
        int h2 = 0;
        for (int i = 0; i < n / 2; i++) {
            h1 += number[i];
        }
        for (int i = n / 2; i < n; i++) {
            h2 += number[i];
        }

        if (h1 == h2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Note: In the Java code, I have used an array to store the input numbers, and then used a for loop to iterate over the array and calculate the sum of the first half of the numbers and the second half of the numbers. Finally, I compared the two sums to determine if they are equal or not.</s>
