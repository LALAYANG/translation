<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46

Expected output:
4


```
n = int ( input ( ) )
list = [ int ( x ) % 2 for x in input ( ).split ( ) ]
if sum ( list ) == 1 :
    print ( list.index ( 1 ) + 1 )
else :
    print ( list.index ( 0 ) + 1 )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt() % 2;
        }
        if (sum(list) == 1) {
            System.out.println(list.indexOf(1) + 1);
        } else {
            System.out.println(list.indexOf(0) + 1);
        }
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
```
Note: The `sum` method is a utility method that calculates the sum of the elements in an integer array. It is not a built-in method in Java, but it is a common practice to define such methods when they are needed.</s>
