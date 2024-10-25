<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
902

```
n = int ( input ( ) )
lst = list ( map ( int , input ( ).split ( ) ) )
lst.sort ( )
lst.reverse ( )
od = 0
for i in lst :
    if ( i & 1 ) :
        od += 1
sum = 0
ok = 0
for i in range ( n ) :
    if ( lst [ i ] % 2 == 0 ) :
        sum += lst [ i ]
    else :
        if ( ok or od > 1 ) :
            sum += lst [ i ]
            od -= 1
            ok = not ok
print ( sum )


```
[/INST]
```java
import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        Arrays.sort(lst);
        Arrays.reverse(lst);
        int od = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 1) {
                od++;
            }
        }
        int sum = 0;
        int ok = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else {
                if (ok || od > 1) {
                    sum += lst[i];
                    od--;
                    ok = 1 - ok;
                }
            }
        }
        System.out.println(sum);
    }
}
```
Note: The above code uses the `Arrays.sort()` and `Arrays.reverse()` methods to sort and reverse the input array. The `Arrays.sort()` method is used to sort the array in ascending order, and the `Arrays.reverse()` method is used to reverse the order of the elements in the array.</s>
