<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
902

```
n = int ( input ( ) )
lst = list ( map ( int , input ( ).split ( ) ) )
lst.sort ( )
lst.reverse ( )
od = 0
for i in lst :
    if ( i & 1 ) :
        od += 1
sum = 0
ok = 0
for i in range ( n ) :
    if ( lst [ i ] % 2 == 0 ) :
        sum += lst [ i ]
    else :
        if ( ok or od > 1 ) :
            sum += lst [ i ]
            od -= 1
            ok = not ok
print ( sum )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int odd = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                odd++;
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            } else {
                if (ok || odd > 1) {
                    sum += arr[i];
                    odd--;
                    ok = !ok;
                }
            }
        }
        System.out.println(sum);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer n and an array of n integers from the standard input, sorts the array in descending order, counts the number of odd numbers in the array, and then calculates the sum of the numbers in the array. If the current number is odd and there are more than one odd numbers left or the previous number was also odd, it adds the current number to the sum. Otherwise, it skips the current number. Finally, it prints the sum. <｜end▁of▁sentence｜>
