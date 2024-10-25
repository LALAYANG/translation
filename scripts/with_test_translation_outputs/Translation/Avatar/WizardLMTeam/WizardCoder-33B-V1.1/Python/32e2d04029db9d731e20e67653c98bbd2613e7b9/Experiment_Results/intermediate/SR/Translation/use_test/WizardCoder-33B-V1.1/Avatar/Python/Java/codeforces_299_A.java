<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of the Python code:

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
        int min = arr[0];
        boolean divisible = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] % min == 0) {
                divisible = true;
                break;
            }
        }
        System.out.println(divisible ? -1 : min);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer n from the standard input, then reads n integers into an array. The array is sorted in ascending order. Then it checks if any of the elements in the array is divisible by the smallest element. If it finds such an element, it prints -1. Otherwise, it prints the smallest element. <｜end▁of▁sentence｜>
