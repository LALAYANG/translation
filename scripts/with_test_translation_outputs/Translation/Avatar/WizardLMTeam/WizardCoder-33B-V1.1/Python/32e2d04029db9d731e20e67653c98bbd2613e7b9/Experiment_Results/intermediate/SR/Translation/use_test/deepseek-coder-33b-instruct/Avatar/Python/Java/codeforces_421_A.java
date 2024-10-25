<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] lista = new int[a];
        int[] listb = new int[b];

        for (int i = 0; i < a; i++) {
            lista[i] = scanner.nextInt();
        }

        for (int i = 0; i < b; i++) {
            listb[i] = scanner.nextInt();
        }

        for (int k = 0; k < n; k++) {
            boolean found = false;
            for (int i = 0; i < a; i++) {
                if (k + 1 == lista[i]) {
                    System.out.print("1 ");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print("2 ");
            }
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads the input, then for each number from 1 to n, it checks if it is in the first list. If it is, it prints 1, otherwise it prints 2.
<|EOT|>
