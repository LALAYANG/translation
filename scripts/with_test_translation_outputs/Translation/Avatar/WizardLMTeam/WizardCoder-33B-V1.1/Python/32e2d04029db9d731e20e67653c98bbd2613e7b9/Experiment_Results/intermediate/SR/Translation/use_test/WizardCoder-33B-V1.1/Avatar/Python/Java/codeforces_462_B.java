<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }
        Arrays.sort(count);
        int res = 0;
        for (int i = 25; i >= 0; i--) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                return;
            }
            k -= count[i];
            res += count[i] * count[i];
        }
        System.out.println(res);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, counts the occurrences of each letter, sorts them in descending order, and then calculates the result. The result is printed out at the end. <｜end▁of▁sentence｜>
