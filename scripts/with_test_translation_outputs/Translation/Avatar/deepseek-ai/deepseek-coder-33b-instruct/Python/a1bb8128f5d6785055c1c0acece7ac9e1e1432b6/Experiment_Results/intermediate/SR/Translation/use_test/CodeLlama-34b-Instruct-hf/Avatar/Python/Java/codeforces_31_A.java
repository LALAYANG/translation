<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
8
537 198 48 771 944 868 700 163

Expected output:
7 8 1


```
y = int ( input ( ) )
arr = [ int ( i ) for i in input ( ).split ( ) ]
for i in range ( len ( arr ) ) :
    for j in range ( len ( arr ) ) :
        if i == j :
            continue
        for k in range ( len ( arr ) ) :
            if arr [ k ] != arr [ j ] and arr [ k ] != arr [ i ] and arr [ k ] == arr [ i ] + arr [ j ] :
                print ( k + 1 , j + 1 , i + 1 )
                exit ( )
print ( - 1 )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int[] arr = new int[y];
        for (int i = 0; i < y; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < y; k++) {
                    if (arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i] + arr[j]) {
                        System.out.println(k + 1 + " " + j + 1 + " " + i + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution, and there are many ways to improve it.</s>
