<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100 1
EVEEVEEEGGECFEHEFVFVFHVHEEEEEFCVEEEEEEVFVEEVEEHEEVEFEVVEFEEEFEVECEHGHEEFGEEVCEECCECEFHEVEEEEEEGEEHVH

Expected output:
1


```
n , k = map ( int , input ( ).split ( ) )
s = input ( )
count = [ 0 ] * 26
for c in s :
    count [ ord ( c ) - ord ( "A" ) ] += 1
count.sort ( reverse = True )
res = 0
for i in range ( 26 ) :
    if count [ i ] >= k :
        res += k * k
        print ( res )
        exit ( )
    k -= count [ i ]
    res += count [ i ] ** 2
print ( res )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }

        Arrays.sort(count, Collections.reverseOrder());

        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                break;
            }
            k -= count[i];
            res += count[i] * count[i];
        }
    }
}
```
Note: The above code uses the `Arrays` and `Collections` classes from the Java Standard Library.</s>
