<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
63 949213645
2 6 26 26 38 46 78 130 286 390 494 494 570 690 874 1014 1254 1254 1430 1482 1690 2990 3174 3174 3718 4370 5070 5070 6422 11362 13754 15870 16302 18590 19266 34914 38870 41262 60306 85514 100510 144210 256542 261326 353210 453882 453882 783978 894010 1105610 1624766 1624766 1874730 2215590 2215590 2269410 2682030 8123830 14372930 14372930 29502330 37369618 560544270

Expected output:
2


```
import fractions
import math
n , num = map ( int , input ( ).split ( ) )
num_set = set ( map ( lambda x : int ( x ) , input ( ).split ( ) ) )
two_times_set = set ( )
for i in num_set :
    for j in range ( 1 , 30 ) :
        i //= 2
        if i % 2 != 0 :
            two_times_set.add ( j )
            break
    if len ( two_times_set ) != 1 :
        print ( 0 )
        break
else :
    num_list = list ( num_set )
    lcm = num_list [ 0 ]
    for i in range ( 1 , len ( num_list ) ) :
        lcm = lcm * num_list [ i ] // fractions.gcd ( lcm , num_list [ i ] )
    print ( ( num - lcm // 2 ) // ( lcm ) + 1 )


```

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(scanner.nextInt());
        }
        Set<Integer> twoTimesSet = new HashSet<>();
        for (int num : numSet) {
            for (int j = 1; j <= 30; j++) {
                num /= 2;
                if (num % 2 != 0) {
                    twoTimesSet.add(j);
                    break;
                }
            }
            if (twoTimesSet.size() != 1) {
                System.out.println(0);
                return;
            }
        }
        List<Integer> numList = new ArrayList<>(numSet);
        BigInteger lcm = BigInteger.valueOf(numList.get(0));
        for (int i = 1; i < numList.size(); i++) {
            lcm = lcm.multiply(BigInteger.valueOf(numList.get(i))).divide(lcm.gcd(BigInteger.valueOf(numList.get(i))));
        }
        System.out.println(lcm.divide(BigInteger.valueOf(2)).add(BigInteger.ONE));
    }
}
```
<|EOT|>
