<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
5 5 5 5 5

Expected output:
0 10

```
n = int ( input ( ) )
l1 = list ( map ( int , input ( ).split ( ) ) )
l1.sort ( )
a = l1 [ - 1 ]
b = l1 [ 0 ]
if a == b :
    print ( a - b , ( n ) * ( n - 1 ) // 2 )
else :
    ac = l1.count ( a )
    bc = l1.count ( b )
    print ( a - b , ac * bc )


```

### Response:
Here is the Java version of your Python code:

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
        int a = arr[n - 1];
        int b = arr[0];
        if (a == b) {
            System.out.println(a - b + " " + (n * (n - 1) / 2));
        } else {
            int ac = 0;
            int bc = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == a) {
                    ac++;
                } else if (arr[i] == b) {
                    bc++;
                }
            }
            System.out.println(a - b + " " + ac * bc);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer n from the standard input, then reads n integers into an array. It sorts the array, and then finds the maximum and minimum values. If the maximum and minimum values are the same, it prints the difference between them and the number of pairs of elements in the array. If the maximum and minimum values are different, it counts the number of occurrences of the maximum and minimum values, and prints the difference between them and the product of these counts. <｜end▁of▁sentence｜>
