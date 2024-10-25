<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000000

Expected output:
4444477777


```
l = [ ]
limit = 10000000000
def gen ( number , four , seven ) :
    if ( number > limit ) :
        return
    if ( number > 0 and four == seven ) :
        l.append ( number )
    gen ( number * 10 + 4 , four + 1 , seven )
    gen ( number * 10 + 7 , four , seven + 1 )
def main ( ) :
    gen ( 0 , 0 , 0 )
    l.sort ( )
    n = int ( input ( ) )
    ans = 0
    for val in l :
        if ( val >= n ) :
            ans = val
            break
    print ( ans )
main ( )


```
[/INST]
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = 1000000000;
        ArrayList<Integer> l = new ArrayList<>();
        gen(0, 0, 0, limit, l);
        Collections.sort(l);
        int n = sc.nextInt();
        int ans = 0;
        for (int val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        System.out.println(ans);
    }

    public static void gen(int number, int four, int seven, int limit, ArrayList<Integer> l) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven, limit, l);
        gen(number * 10 + 7, four, seven + 1, limit, l);
    }
}
```
Note: In the Python code, the `l` variable is a list, but in Java, it is an `ArrayList`. Also, the `input()` function in Python is replaced with `sc.nextInt()` in Java to read an integer from the user.</s>
