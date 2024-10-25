<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
2 2 2 2 1000000000

Expected output:
2


```
num_inp = lambda : int ( input ( ) )
arr_inp = lambda : list ( map ( int , input ( ).split ( ) ) )
sp_inp = lambda : map ( int , input ( ).split ( ) )
a = sorted ( map ( int , [ * open ( 0 ) ] [ 1 ].split ( ) ) )
print ( [ a [ 0 ] , - 1 ] [ any ( x % a [ 0 ] for x in a ) ] )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        boolean allDivisible = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] % arr[0] != 0) {
                allDivisible = false;
                break;
            }
        }
        System.out.println(allDivisible ? -1 : arr[0]);
    }
}
```

This Java code reads the number of elements in the array and the elements themselves from the standard input. It then sorts the array and checks if all elements are divisible by the smallest element. If they are, it prints -1, otherwise it prints the smallest element.
<|EOT|>
