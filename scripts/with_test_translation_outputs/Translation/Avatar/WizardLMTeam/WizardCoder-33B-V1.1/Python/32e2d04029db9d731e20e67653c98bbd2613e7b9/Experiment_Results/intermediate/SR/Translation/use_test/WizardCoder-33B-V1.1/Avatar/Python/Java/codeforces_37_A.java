<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
6 5 6 7

Expected output:
2 3


```
n = int ( input ( ) )
l = list ( map ( int , input ( ).split ( ) ) )
high = 1
tower = n
maximum = 1
l.sort ( )
for i in range ( 1 , n ) :
    if l [ i ] == l [ i - 1 ] :
        tower -= 1
        high += 1
    else :
        if high > maximum :
            maximum = high
        high = 1
if high > maximum :
    maximum = high
print ( maximum , tower )


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
        int high = 1, tower = n, maximum = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                tower--;
                high++;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer n from the standard input, then reads n integers into an array. The array is sorted, and then the code counts the number of identical elements in a row (high) and the number of remaining elements (tower). The maximum number of identical elements in a row is stored in the maximum variable. The result is printed to the standard output. <｜end▁of▁sentence｜>
