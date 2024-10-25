<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1
15

Expected output:
30


```
n = int ( input ( ) )
arr = list ( map ( int , input ( ).split ( ) ) )
if arr [ 0 ] > 15 : print ( 15 )
else :
    for i in range ( 1 , len ( arr ) ) :
        if arr [ i ] - arr [ i - 1 ] > 15 :
            print ( arr [ i - 1 ] + 15 )
            break
    else :
        if arr [ - 1 ] == 90 or arr [ - 1 ] + 15 >= 90 : print ( 90 )
        else : print ( arr [ - 1 ] + 15 )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr[0] > 15) {
            System.out.println(15);
        } else {
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] > 15) {
                    System.out.println(arr[i - 1] + 15);
                    break;
                }
            }
            if (arr[n - 1] == 90 || arr[n - 1] + 15 >= 90) {
                System.out.println(90);
            } else {
                System.out.println(arr[n - 1] + 15);
            }
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `input()` function to read input from the user, but in Java, we use the `Scanner` class to read input from the user. Also, in Java, we use the `System.out.println()` method to print output to the console.</s>
