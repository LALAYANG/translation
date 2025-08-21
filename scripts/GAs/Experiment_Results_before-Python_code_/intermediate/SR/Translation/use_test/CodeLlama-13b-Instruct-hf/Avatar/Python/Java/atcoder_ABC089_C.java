
Here is the Java code for the given Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(sc.next());
        }
        String[] march = {"M", "A", "R", "C", "H"};
        int[] march_lis = new int[5];
        for (String s : S) {
            if (s.toUpperCase().equals(march[0])) {
                march_lis[0]++;
            } else if (s.toUpperCase().equals(march[1])) {
                march_lis[1]++;
            } else if (s.toUpperCase().equals(march[2])) {
                march_lis[2]++;
            } else if (s.toUpperCase().equals(march[3])) {
                march_lis[3]++;
            } else if (s.toUpperCase().equals(march[4])) {
                march_lis[4]++;
            }
        }
        int ans = 0;
        for (int x : march_lis) {
            for (int y : march_lis) {
                for (int z : march_lis) {
                    ans += x * y * z;
                }
            }
        }
        System.out.println(ans);
    }
}
```
Note that this code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the list of strings. It also uses the `stream` API to perform some operations on the list of strings.
