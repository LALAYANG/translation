<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (arr[0] > 15) {
            System.out.println(15);
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - arr[i - 1] > 15) {
                    System.out.println(arr[i - 1] + 15);
                    break;
                }
            }
            if (arr[arr.length - 1] == 90 || arr[arr.length - 1] + 15 >= 90) {
                System.out.println(90);
            } else {
                System.out.println(arr[arr.length - 1] + 15);
            }
        }
    }
}
```
<|EOT|>
