<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 23

Expected output:
Ciel


```
x , y = list ( map ( int , input ( ).split ( ) ) )
a = 0
while x >= 0 and y >= 22 or x >= 1 and y >= 12 or x >= 2 and y >= 2 :
    if a :
        if y >= 22 :
            y -= 22
        elif x >= 1 and y >= 12 :
            x -= 1
            y -= 12
        else :
            x -= 2
            y -= 2
    else :
        if x >= 2 and y >= 2 :
            x -= 2
            y -= 2
        elif x >= 1 and y >= 12 :
            x -= 1
            y -= 12
        else :
            y -= 22
    a = 1 - a
print ( [ 'Ciel' , 'Hanako' ] [ 1 - a ] )


```
[/INST]
```java
import java.util.Scanner;

public class CielHanako {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = 0;
        while (x >= 0 && y >= 22 || x >= 1 && y >= 12 || x >= 2 && y >= 2) {
            if (a == 0) {
                if (y >= 22) {
                    y -= 22;
                } else if (x >= 1 && y >= 12) {
                    x -= 1;
                    y -= 12;
                } else {
                    x -= 2;
                    y -= 2;
                }
            } else {
                if (x >= 2 && y >= 2) {
                    x -= 2;
                    y -= 2;
                } else if (x >= 1 && y >= 12) {
                    x -= 1;
                    y -= 12;
                } else {
                    y -= 22;
                }
            }
            a = 1 - a;
        }
        System.out.println(a == 0 ? "Ciel" : "Hanako");
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant way to solve the problem. A more efficient solution would involve using a different algorithm to determine the winner of the game.</s>
