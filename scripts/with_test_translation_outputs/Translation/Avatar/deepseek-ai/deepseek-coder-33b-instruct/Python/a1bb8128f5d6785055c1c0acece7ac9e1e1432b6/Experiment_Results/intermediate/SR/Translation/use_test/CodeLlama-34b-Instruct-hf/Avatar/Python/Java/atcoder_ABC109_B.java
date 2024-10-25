<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
9
basic
c
cpp
php
python
nadesico
ocaml
lua
assembly

Expected output:
Yes


```
from collections import defaultdict
n = int ( input ( ) )
s = defaultdict ( lambda : 0 )
l = list ( [ input ( ) for i in range ( n ) ] )
f = 'Yes'
i = - 1
for v in l :
    s [ v ] += 1
    if s [ v ] >= 2 :
        f = 'No'
    if i != - 1 and l [ i ] [ - 1 ] != v [ 0 ] :
        f = 'No'
    i += 1
print ( f )


```
[/INST]
```java
import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        String result = "Yes";
        for (int i = 0; i < n - 1; i++) {
            if (arr[i].charAt(0) != arr[i + 1].charAt(0)) {
                result = "No";
                break;
            }
        }

        for (String key : map.keySet()) {
            if (map.get(key) >= 2) {
                result = "No";
                break;
            }
        }

        System.out.println(result);
    }
}
```
Note: The above code uses the `HashMap` class to store the frequency of each word in the input array. The `HashMap` class is a part of the Java Collections Framework, which provides a way to store and manipulate collections of data. In this case, we use it to store the frequency of each word in the input array.

Also, the `String.charAt(0)` method is used to get the first character of each word in the input array. This is used to check if the words are in alphabetical order.

The `break` statement is used to exit the loop early if the condition is met. This is done to improve the efficiency of the code.</s>
