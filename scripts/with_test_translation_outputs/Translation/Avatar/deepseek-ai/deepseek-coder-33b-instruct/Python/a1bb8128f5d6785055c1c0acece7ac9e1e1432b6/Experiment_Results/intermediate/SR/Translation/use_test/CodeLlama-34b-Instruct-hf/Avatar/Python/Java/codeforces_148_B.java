<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
1
10
1
11

Expected output:
0


```
princess = int ( input ( ) )
dragon = int ( input ( ) )
t = int ( input ( ) )
f = int ( input ( ) )
c = int ( input ( ) )
if dragon <= princess :
    print ( 0 )
    exit ( 0 )
result = 0
position = t * princess
position += princess * position / ( dragon - princess )
while position < c :
    result += 1
    position += princess * position / dragon
    position += princess * f
    position += princess * position / ( dragon - princess )
print ( result )


```
[/INST]
```java
import java.util.Scanner;

public class DragonAndPrincess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int princess = sc.nextInt();
        int dragon = sc.nextInt();
        int t = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();

        if (dragon <= princess) {
            System.out.println(0);
            return;
        }

        int result = 0;
        int position = t * princess;
        position += princess * position / (dragon - princess);

        while (position < c) {
            result++;
            position += princess * position / dragon;
            position += princess * f;
            position += princess * position / (dragon - princess);
        }

        System.out.println(result);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution, and there may be better ways to solve the problem.</s>
