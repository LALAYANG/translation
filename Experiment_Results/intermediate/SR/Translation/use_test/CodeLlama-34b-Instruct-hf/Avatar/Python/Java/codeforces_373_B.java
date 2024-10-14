<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
462 183 8

Expected output:
19


```
def sum ( k ) :
    ret = 0
    pw = 10
    len = 1
    while 1 == 1 :
        cur = min ( pw - 1 , k )
        prev = pw // 10
        ret += ( cur - prev + 1 ) * len
        if ( pw - 1 >= k ) :
            break
        len += 1
        pw *= 10
    return ret
w , m , k = map ( int , input ( ).split ( ) )
lo = 0
hi = int ( 1e18 )
while hi - lo > 1 :
    md = ( lo + hi ) // 2
    c = sum ( m + md - 1 ) - sum ( m - 1 )
    if c * k <= w :
        lo = md
    else :
        hi = md
print ( lo )


```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int lo = 0;
        int hi = (int)1e18;
        while (hi - lo > 1) {
            int md = (lo + hi) / 2;
            int c = sum(m + md - 1) - sum(m - 1);
            if (c * k <= w) {
                lo = md;
            } else {
                hi = md;
            }
        }
        System.out.println(lo);
    }

    public static int sum(int k) {
        int ret = 0;
        int pw = 10;
        int len = 1;
        while (true) {
            int cur = Math.min(pw - 1, k);
            int prev = pw / 10;
            ret += (cur - prev + 1) * len;
            if (pw - 1 >= k) {
                break;
            }
            len += 1;
            pw *= 10;
        }
        return ret;
    }
}
```
Note: The `sum` method is a Java implementation of the Python function with the same name. The `main` method is the entry point of the program, and it reads the input from the user, calls the `sum` method with the appropriate arguments, and prints the result.</s>
