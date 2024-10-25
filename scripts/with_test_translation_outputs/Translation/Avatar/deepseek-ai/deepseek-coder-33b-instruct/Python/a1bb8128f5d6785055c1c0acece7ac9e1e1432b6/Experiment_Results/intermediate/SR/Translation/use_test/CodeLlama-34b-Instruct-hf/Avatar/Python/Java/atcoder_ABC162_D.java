<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
BBBBBBBBBB

Expected output:
0


```
import math
N = int ( input ( ) )
S = input ( )
def calculate ( n , s ) :
    arr = list ( s )
    rNum = arr.count ( "R" )
    gNum = arr.count ( "G" )
    bNum = arr.count ( "B" )
    sum = 0
    for step in range ( 1 , math.ceil ( n / 2 ) + 1 ) :
        for i in range ( n - 2 * step ) :
            s = "".join ( [ arr [ i ] , arr [ i + step ] , arr [ i + step * 2 ] ] )
            if s == "RGB" or s == "RBG" or s == "BGR" or s == "BRG" or s == "GBR" or s == "GRB" :
                sum = sum + 1
    print ( rNum * gNum * bNum - sum )
calculate ( N , S )


```
[/INST]
```java
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int rNum = 0, gNum = 0, bNum = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                rNum++;
            } else if (s.charAt(i) == 'G') {
                gNum++;
            } else if (s.charAt(i) == 'B') {
                bNum++;
            }
        }
        int sum = 0;
        for (int step = 1; step <= n / 2; step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String s1 = s.substring(i, i + step);
                String s2 = s.substring(i + step, i + 2 * step);
                String s3 = s.substring(i + 2 * step, i + 3 * step);
                if (s1.equals("RGB") || s1.equals("RBG") || s1.equals("BGR") || s1.equals("BRG") || s1.equals("GBR") || s1.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * bNum - sum);
    }
}
```
Note: The above code uses the `substring` method to extract the substrings of length `step` from the input string `s`. The `substring` method takes two arguments: the starting index and the ending index (exclusive). The ending index is calculated by adding the length of the substring to the starting index.

Also, the code uses the `equals` method to compare the substrings with the expected values. The `equals` method is used instead of the `==` operator because it compares the contents of the strings, whereas the `==` operator compares the references of the strings.</s>
