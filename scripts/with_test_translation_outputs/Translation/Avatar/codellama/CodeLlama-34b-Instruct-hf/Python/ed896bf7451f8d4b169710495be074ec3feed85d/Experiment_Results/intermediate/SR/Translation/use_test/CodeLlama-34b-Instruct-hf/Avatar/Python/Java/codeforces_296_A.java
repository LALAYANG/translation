<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
324 539 83 440 834 640 440 440 440 440

Expected output:
YES


```
n = int ( input ( ) )
m = input ( ).split ( )
possible = True
for i in set ( m ) :
    if m.count ( i ) >= n / 2 + 1 :
        possible = False
        break
print ( 'YES' if possible else 'NO' )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] m = sc.nextLine().split(" ");
        boolean possible = true;
        for (String i : m) {
            if (m.count(i) >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
```
Note: The `count` method in Java is used to count the number of occurrences of a particular element in an array. In this case, we are using it to count the number of occurrences of each element in the `m` array.</s>
