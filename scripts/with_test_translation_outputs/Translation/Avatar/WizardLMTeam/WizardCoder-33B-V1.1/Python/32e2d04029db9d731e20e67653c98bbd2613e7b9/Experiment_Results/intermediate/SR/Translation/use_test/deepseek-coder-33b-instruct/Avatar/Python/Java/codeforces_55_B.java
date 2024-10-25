<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000 1000 999 1000
* * *

Expected output:
999000000000


```
def rememberTheNumber ( nums , i , operations , ans ) :
    if i >= 3 :
        return
    for j in range ( 4 ) :
        for k in range ( j + 1 , 4 ) :
            if ( nums [ j ] != - 1 and nums [ k ] != - 1 ) :
                s = nums [ j ]
                nums [ j ] = - 1
                t = nums [ k ]
                if ( operations [ i ] == '+' ) :
                    nums [ k ] = s + t
                elif ( operations [ i ] == '*' ) :
                    nums [ k ] = s * t
                if ( i == 2 and nums [ k ] < ans [ 0 ] ) :
                    ans [ 0 ] = nums [ k ]
                rememberTheNumber ( nums , i + 1 , operations , ans )
                nums [ j ] = s
                nums [ k ] = t
nums = list ( map ( int , input ( ).split ( ) ) )
operations = list ( map ( str , input ( ).split ( ) ) )
ans = [ 10000000000000000000000000 ]
rememberTheNumber ( nums , 0 , operations , ans )
print ( ans [ 0 ] )


```

### Response:
```java
import java.util.*;

public class Main {
    static int ans = Integer.MAX_VALUE;
    static int[] nums = new int[4];
    static char[] operations = new char[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            operations[i] = scanner.next().charAt(0);
        }
        rememberTheNumber(0);
        System.out.println(ans);
    }

    static void rememberTheNumber(int i) {
        if (i >= 3) {
            return;
        }
        for (int j = 0; j < 4; j++) {
            for (int k = j + 1; k < 4; k++) {
                if (nums[j] != -1 && nums[k] != -1) {
                    int s = nums[j];
                    nums[j] = -1;
                    int t = nums[k];
                    if (operations[i] == '+') {
                        nums[k] = s + t;
                    } else if (operations[i] == '*') {
                        nums[k] = s * t;
                    }
                    if (i == 2 && nums[k] < ans) {
                        ans = nums[k];
                    }
                    rememberTheNumber(i + 1);
                    nums[j] = s;
                    nums[k] = t;
                }
            }
        }
    }
}
```
<|EOT|>
