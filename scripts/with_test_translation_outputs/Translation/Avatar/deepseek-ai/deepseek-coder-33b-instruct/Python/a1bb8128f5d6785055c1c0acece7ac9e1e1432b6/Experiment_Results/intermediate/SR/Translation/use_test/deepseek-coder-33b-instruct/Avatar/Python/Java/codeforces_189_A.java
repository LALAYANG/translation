<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
918 102 1327 1733

Expected output:
9


```
def cutRibbon ( ) :
    arr = [ int ( i ) for i in input ( ).split ( ) ]
    length = arr [ 0 ]
    arr = sorted ( arr [ 1 : 4 ] , reverse = False )
    if ( length % arr [ 0 ] == 0 ) :
        print ( int ( length / arr [ 0 ] ) )
        return
    ans = 0
    if ( arr [ 0 ] == arr [ 1 ] ) :
        k = 0
        for i in range ( int ( length / arr [ 2 ] ) + 1 ) :
            check = length - i * arr [ 2 ]
            if ( check >= 0 and check % arr [ 0 ] == 0 ) :
                k = int ( check / arr [ 0 ] )
                ans = max ( ans , k + i )
    else :
        k = 0
        for i in range ( int ( length / arr [ 2 ] ) + 1 ) :
            for j in range ( int ( length / arr [ 1 ] ) + 1 ) :
                check = length - i * arr [ 2 ] - j * arr [ 1 ]
                if ( check >= 0 and check % arr [ 0 ] == 0 ) :
                    k = int ( check / arr [ 0 ] )
                    ans = max ( ans , k + i + j )
    print ( ans )
    return
cutRibbon ( )


```

### Response:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = arr[0];
        Arrays.sort(arr, 1, 4);
        if (length % arr[1] == 0) {
            System.out.println(length / arr[1]);
            return;
        }
        int ans = 0;
        if (arr[1] == arr[2]) {
            int k = 0;
            for (int i = 0; i <= length / arr[3] + 1; i++) {
                int check = length - i * arr[3];
                if (check >= 0 && check % arr[1] == 0) {
                    k = check / arr[1];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            int k = 0;
            for (int i = 0; i <= length / arr[3] + 1; i++) {
                for (int j = 0; j <= length / arr[2] + 1; j++) {
                    int check = length - i * arr[3] - j * arr[2];
                    if (check >= 0 && check % arr[1] == 0) {
                        k = check / arr[1];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
<|EOT|>
