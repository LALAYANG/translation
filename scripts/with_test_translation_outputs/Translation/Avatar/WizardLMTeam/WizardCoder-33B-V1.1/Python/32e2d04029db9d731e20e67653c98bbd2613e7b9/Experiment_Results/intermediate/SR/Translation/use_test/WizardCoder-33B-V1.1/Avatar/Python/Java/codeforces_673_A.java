<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

This Java code does the same thing as the Python code. It reads an integer n from the standard input, then reads n integers into an array arr. It then checks the first element of the array and if it's greater than 15, it prints 15. If the first element is not greater than 15, it checks the difference between each subsequent pair of elements in the array. If the difference is greater than 15, it prints the first element of that pair plus 15 and breaks the loop. If no such pair is found, it checks the last element of the array and prints 90 if it's 90 or if adding 15 to it would make it greater than or equal to 90, otherwise it prints the last element plus 15. <｜end▁of▁sentence｜>
