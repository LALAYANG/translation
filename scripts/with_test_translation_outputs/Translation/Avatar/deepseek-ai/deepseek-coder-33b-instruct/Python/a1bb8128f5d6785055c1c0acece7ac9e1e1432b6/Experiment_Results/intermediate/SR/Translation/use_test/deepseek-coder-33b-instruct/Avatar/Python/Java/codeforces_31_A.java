<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] arr = new int[y];
        for (int i = 0; i < y; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < y; k++) {
                    if (arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i] + arr[j]) {
                        System.out.println((k + 1) + " " + (j + 1) + " " + (i + 1));
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
```
<|EOT|>
