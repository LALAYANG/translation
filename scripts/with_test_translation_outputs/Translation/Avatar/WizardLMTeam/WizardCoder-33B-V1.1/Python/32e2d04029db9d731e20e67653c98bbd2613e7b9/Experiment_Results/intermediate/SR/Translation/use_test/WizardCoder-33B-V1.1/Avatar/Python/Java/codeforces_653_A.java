<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

This Java code does the same thing as the Python code. It reads an integer n from the standard input, then reads n integers into an array l. It sorts the array and then checks if there are three consecutive integers in the array. If it finds such three integers, it prints "YES" and stops the search. If it doesn't find such three integers after checking all integers, it prints "NO". <｜end▁of▁sentence｜>
