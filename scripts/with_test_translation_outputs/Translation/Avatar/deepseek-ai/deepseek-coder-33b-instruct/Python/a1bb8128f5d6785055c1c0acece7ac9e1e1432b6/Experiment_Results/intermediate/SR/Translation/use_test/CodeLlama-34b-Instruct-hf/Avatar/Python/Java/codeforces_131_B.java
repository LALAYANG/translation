<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
10 -10

Expected output:
1


```
import sys
input = sys.stdin.readline
from collections import Counter
n = int ( input ( ) )
w = Counter ( map ( int , input ( ).split ( ) ) )
c = 0
for i in w :
    if i == 0 :
        c += w [ i ] * ( w [ i ] - 1 )
    else :
        if - i in w :
            c += w [ i ] * w [ - i ]
print ( c // 2 )


```
[/INST]
```java
import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (w.containsKey(num)) {
                w.put(num, w.get(num) + 1);
            } else {
                w.put(num, 1);
            }
        }
        int c = 0;
        for (int i : w.keySet()) {
            if (i == 0) {
                c += w.get(i) * (w.get(i) - 1);
            } else {
                if (w.containsKey(-i)) {
                    c += w.get(i) * w.get(-i);
                }
            }
        }
        System.out.println(c / 2);
    }
}
```
Explanation:

The code is written in Java and uses the `Scanner` class to read input from the user. The `HashMap` is used to store the frequency of each number. The `for` loop is used to iterate over the input numbers and update the frequency of each number in the `HashMap`. The `if` statement is used to check if the number is 0 and if it is, the frequency of 0 is updated accordingly. The `else` statement is used to check if the negative of the number is in the `HashMap` and if it is, the frequency of the number and its negative is updated accordingly. Finally, the `System.out.println` statement is used to print the result.</s>
