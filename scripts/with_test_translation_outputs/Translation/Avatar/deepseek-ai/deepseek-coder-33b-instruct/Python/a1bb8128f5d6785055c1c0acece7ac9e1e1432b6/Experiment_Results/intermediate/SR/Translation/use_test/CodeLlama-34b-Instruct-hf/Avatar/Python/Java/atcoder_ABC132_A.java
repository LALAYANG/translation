<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
AVVA

Expected output:
Yes


```
S = input ( )
from collections import Counter
c = Counter ( S )
Sa = set ( list ( S ) )
if len ( Sa ) != 2 :
    print ( "No" )
    exit ( )
for i in Sa :
    if c [ i ] != 2 :
        print ( "No" )
        exit ( )
print ( "Yes" )


```
[/INST]
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (!countMap.containsKey(c)) {
                countMap.put(c, 1);
            } else {
                countMap.put(c, countMap.get(c) + 1);
            }
        }

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : countMap.keySet()) {
            if (countMap.get(c) == 2) {
                uniqueChars.add(c);
            }
        }

        if (uniqueChars.size() == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Explanation:

1. The first step is to read the input string from the user.
2. Then, we create a map to store the count of each character in the input string.
3. We iterate over the input string and for each character, we check if it already exists in the map. If it doesn't, we add it to the map with a count of 1. If it does, we increment its count by 1.
4. Next, we create a set to store the unique characters in the input string. We iterate over the map and for each character, we check if its count is 2. If it is, we add it to the set.
5. Finally, we check if the size of the set is 2. If it is, we print "Yes" to indicate that the input string is a palindrome. Otherwise, we print "No".

Note: This solution assumes that the input string is not null and is not empty. If the input string is null or empty, the solution will throw a NullPointerException or an IndexOutOfBoundsException, respectively.</s>
