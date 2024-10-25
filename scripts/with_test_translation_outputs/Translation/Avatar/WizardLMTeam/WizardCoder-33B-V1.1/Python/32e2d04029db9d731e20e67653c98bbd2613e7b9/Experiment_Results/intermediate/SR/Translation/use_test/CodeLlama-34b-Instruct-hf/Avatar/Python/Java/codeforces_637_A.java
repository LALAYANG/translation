<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
15
100 200 300 500 300 400 600 300 100 200 400 300 600 200 100

Expected output:
300


```
import sys
input = sys.stdin.readline
from collections import Counter
n = int ( input ( ) )
s = input ( ) [ : - 1 ].split ( )
w = Counter ( s )
s = s [ : : - 1 ]
c , a = - 1 , 0
for i in w :
    if w [ i ] == max ( w.values ( ) ) :
        if s.index ( i ) > c :
            a = i
            c = s.index ( i )
print ( a )


```
[/INST]
```java
import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.nextLine().split(" ");
        HashMap<String, Integer> w = new HashMap<>();
        for (String str : s) {
            if (w.containsKey(str)) {
                w.put(str, w.get(str) + 1);
            } else {
                w.put(str, 1);
            }
        }
        int maxCount = 0;
        String maxWord = "";
        for (String str : w.keySet()) {
            if (w.get(str) > maxCount) {
                maxCount = w.get(str);
                maxWord = str;
            }
        }
        System.out.println(maxWord);
    }
}
```
Note: The above code uses the `HashMap` class to store the words and their frequencies. The `HashMap` class is similar to the `Counter` class in Python, but it is not a built-in class in Java.

Also, the `split()` method is used to split the input string into an array of words. The `nextInt()` method is used to read the integer input from the user. The `nextLine()` method is used to read the string input from the user.</s>
