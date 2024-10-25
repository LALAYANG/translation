<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
399 400 398

Expected output:
YES


```
n = int ( input ( ) )
l = list ( map ( int , input ( ).split ( ) ) )
l.sort ( )
for i in l :
    if i + 1 in l and i + 2 in l :
        print ( 'YES' )
        break
else :
    print ( 'NO' )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (Arrays.binarySearch(l, l[i] + 1) >= 0 && Arrays.binarySearch(l, l[i] + 2) >= 0) {
                System.out.println("YES");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer n from the input, then reads n integers into an array l. It sorts the array and then checks for each integer in the array if the integers i+1 and i+2 are also in the array. If it finds such a triplet, it prints "YES" and breaks the loop. If it doesn't find such a triplet after checking all integers, it prints "NO".
<|EOT|>
