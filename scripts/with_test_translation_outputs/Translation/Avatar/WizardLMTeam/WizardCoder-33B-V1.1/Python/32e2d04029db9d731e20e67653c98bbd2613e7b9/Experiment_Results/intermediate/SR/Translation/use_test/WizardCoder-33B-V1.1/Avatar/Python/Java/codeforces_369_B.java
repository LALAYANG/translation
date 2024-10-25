<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50 25 1000 1000 50000 25000

Expected output:
1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 

```
def get_nums ( num , t ) :
    return [ t // num + 1 if i in range ( t % num ) else t // num for i in range ( num ) ]
n , k , l , r , sa , sk = map ( int , input ( ).split ( ) )
ans = get_nums ( k , sk ) + get_nums ( n - k , sa - sk )
print ( ' '.join ( map ( str , ans ) ) )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < k) {
                ans[i] = (sk % k > i) ? sk / k + 1 : sk / k;
            } else {
                ans[i] = ((sa - sk) % (n - k) > i - k) ? (sa - sk) / (n - k) + 1 : (sa - sk) / (n - k);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads the input from the user, calculates the array `ans`, and then prints the array. The logic inside the for loop is the same as your Python code. <｜end▁of▁sentence｜>
