<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
18
0 1 0 1 0 1 0 1 0 1 1 0 1 1 0 1 1 0

Expected output:
11


```
import itertools
def find ( s , ch ) :
    return [ i for i , ltr in enumerate ( s ) if ltr == ch ]
if __name__ == '__main__' :
    n = int ( input ( ) )
    s = input ( ).replace ( "" , "" )
    if '0' not in s :
        print ( n - 1 )
    else :
        indices = find ( s , '0' )
        if len ( indices ) == 1 :
            print ( n )
        else :
            maximum = 0
            combs = itertools.combinations ( indices , 2 )
            for x in combs :
                maximum = max ( maximum , 2 + 2 * ( abs ( indices.index ( x [ 0 ] ) - indices.index ( x [ 1 ] ) ) - 1 ) - ( abs ( x [ 0 ] - x [ 1 ] ) - 1 ) )
            print ( s.count ( '1' ) + maximum )


```
[/INST]
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] indices = find(s, '0');
        if (indices.length == 1) {
            System.out.println(n);
        } else {
            int maximum = 0;
            for (int i = 0; i < indices.length - 1; i++) {
                for (int j = i + 1; j < indices.length; j++) {
                    int diff = Math.abs(indices[i] - indices[j]);
                    maximum = Math.max(maximum, 2 + 2 * (diff - 1) - diff);
                }
            }
            System.out.println(s.length() + maximum);
        }
    }

    public static int[] find(String s, char ch) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                indices.add(i);
            }
        }
        return indices.stream().mapToInt(i -> i).toArray();
    }
}
```
Note: The `find` method in the Java code is similar to the `find` method in the Python code, but it uses a different approach to find the indices of the given character in the string. In Java, we use a `List` to store the indices and then convert it to an array using the `stream().mapToInt(i -> i).toArray()` method.</s>
