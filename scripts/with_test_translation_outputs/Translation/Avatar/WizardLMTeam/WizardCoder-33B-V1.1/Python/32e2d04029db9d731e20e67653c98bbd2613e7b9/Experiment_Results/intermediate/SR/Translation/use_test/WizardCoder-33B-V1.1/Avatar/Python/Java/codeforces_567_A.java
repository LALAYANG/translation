<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
-10000 1 10000

Expected output:
10001 20000
9999 10001
9999 20000


```
inp = int ( input ( ) )
lista = [ ]
lista = [ int ( x ) for x in input ( ).split ( ) ]
for i in range ( len ( lista ) ) :
    if i == 0 :
        print ( f"{lista[i+1] - lista[i]} {lista[len(lista)-1] - lista[i]}" )
        continue
    elif i == len ( lista ) - 1 :
        print ( f"{lista[len(lista)-1] - lista[len(lista)-2]} {lista[len(lista)-1] - lista[0]}" )
        continue
    elif lista [ i ] - lista [ i - 1 ] > lista [ i + 1 ] - lista [ i ] :
        print ( lista [ i + 1 ] - lista [ i ] , end = " " )
    else :
        print ( lista [ i ] - lista [ i - 1 ] , end = " " )
    if lista [ len ( lista ) - 1 ] - lista [ i ] > lista [ i ] - lista [ 0 ] :
        print ( lista [ len ( lista ) - 1 ] - lista [ i ] )
    else :
        print ( lista [ i ] - lista [ 0 ] )


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
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println((arr[i + 1] - arr[i]) + " " + (arr[n - 1] - arr[i]));
                continue;
            }
            if (i == n - 1) {
                System.out.println((arr[n - 1] - arr[n - 2]) + " " + (arr[n - 1] - arr[0]));
                continue;
            }
            if (arr[i] - arr[i - 1] > arr[i + 1] - arr[i]) {
                System.out.print(arr[i + 1] - arr[i] + " ");
            } else {
                System.out.print(arr[i] - arr[i - 1] + " ");
            }
            if (arr[n - 1] - arr[i] > arr[i] - arr[0]) {
                System.out.println(arr[n - 1] - arr[i]);
            } else {
                System.out.println(arr[i] - arr[0]);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer n from the standard input, then reads n integers into an array. It then iterates over the array, and for each element, it prints the difference between the next element and the current element, and the difference between the current element and the first element, or the difference between the last element and the current element, and the difference between the current element and the first element, whichever is larger. <｜end▁of▁sentence｜>
