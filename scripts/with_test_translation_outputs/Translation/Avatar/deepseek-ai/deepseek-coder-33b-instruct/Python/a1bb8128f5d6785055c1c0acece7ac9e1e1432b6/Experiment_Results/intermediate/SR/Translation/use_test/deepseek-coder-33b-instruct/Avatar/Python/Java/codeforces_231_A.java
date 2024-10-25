<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
1 0 0
0 1 1

Expected output:
1


```
n = int ( input ( ) )
c = 0
for i in range ( n ) :
    l1 = list ( map ( int , input ( ).split ( ) ) )
    if sum ( l1 ) > 1 :
        c = c + 1
print ( c )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int[] l1 = new int[3];
            for (int j = 0; j < 3; j++) {
                l1[j] = scanner.nextInt();
            }
            if (sum(l1) > 1) {
                c++;
            }
        }
        System.out.println(c);
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
```
<|EOT|>
