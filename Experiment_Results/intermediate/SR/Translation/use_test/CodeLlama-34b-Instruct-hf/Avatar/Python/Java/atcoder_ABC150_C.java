<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
8
7 3 5 4 2 1 6 8
3 8 2 5 4 6 7 1

Expected output:
17517


```
n = int ( input ( ) )
import itertools
orig = list ( itertools.permutations ( list ( range ( 1 , n + 1 ) ) ) )
p = tuple ( map ( int , input ( ).split ( ) ) )
q = tuple ( map ( int , input ( ).split ( ) ) )
pn = orig.index ( p )
qn = orig.index ( q )
print ( abs ( pn - qn ) )


```
[/INST]
```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PermutationDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> orig = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            orig.add(Arrays.asList(i));
        }
        List<Integer> p = new ArrayList<>();
        List<Integer> q = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
            q.add(sc.nextInt());
        }
        int pn = orig.indexOf(p);
        int qn = orig.indexOf(q);
        System.out.println(Math.abs(pn - qn));
    }
}
```
Note: The above code uses the `List` interface and its implementations to store the permutations, and the `indexOf` method to find the index of a given permutation. The `Math.abs` method is used to calculate the absolute difference between the two indices.</s>
