<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4 3 1
1 2 4
3

Expected output:
1 1 2 1


```
n , a , b = [ int ( x ) for x in input ( ).split ( " " ) ]
lista = [ int ( x ) for x in input ( ).split ( " " ) ]
listb = [ int ( x ) for x in input ( ).split ( " " ) ]
for k in range ( n ) :
    if k + 1 in lista :
        print ( 1 , end = " " )
    else :
        print ( 2 , end = " " )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] lista = new int[a];
        for (int i = 0; i < a; i++) {
            lista[i] = scanner.nextInt();
        }

        int[] listb = new int[b];
        for (int i = 0; i < b; i++) {
            listb[i] = scanner.nextInt();
        }

        for (int k = 0; k < n; k++) {
            boolean found = false;
            for (int i = 0; i < a; i++) {
                if (k + 1 == lista[i]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads the input, stores it in the appropriate variables and arrays, and then iterates over the range from 1 to n (inclusive). For each number in this range, it checks if it is in the lista array. If it is, it prints "1", otherwise it prints "2". <｜end▁of▁sentence｜>
