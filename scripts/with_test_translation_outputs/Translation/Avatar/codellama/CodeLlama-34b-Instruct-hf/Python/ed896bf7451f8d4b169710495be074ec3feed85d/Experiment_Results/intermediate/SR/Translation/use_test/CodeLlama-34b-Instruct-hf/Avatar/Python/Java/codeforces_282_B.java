<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
400 600
400 600
400 600

Expected output:
AGA


```
firstline = int ( input ( ) )
total = 0
memory = [ ]
for x in range ( firstline ) :
    A , G = list ( map ( int , input ( ).split ( ) ) )
    if total + A <= 500 :
        total += A
        memory.append ( "A" )
    else :
        total -= G
        memory.append ( "G" )
print ( "".join ( memory ) )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstline = sc.nextInt();
        int total = 0;
        String[] memory = new String[firstline];
        for (int i = 0; i < firstline; i++) {
            int A = sc.nextInt();
            int G = sc.nextInt();
            if (total + A <= 500) {
                total += A;
                memory[i] = "A";
            } else {
                total -= G;
                memory[i] = "G";
            }
        }
        System.out.println(String.join("", memory));
    }
}
```
Note: The `String.join()` method is used to concatenate the elements of the `memory` array into a single string, separated by the empty string `""`.</s>
