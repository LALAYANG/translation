```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.next();
        }

        Set<Integer> c = new HashSet<>();
        for (String s : input) {
            int indexS = s.indexOf("S");
            int indexG = s.indexOf("G");
            if (indexS != -1 && indexG != -1) {
                c.add(indexS - indexG);
            }
        }

        if (c.contains(-1)) {
            System.out.println(-1);
        } else {
            System.out.println(c.size());
        }
    }
}
```
Note: The above code assumes that the input is in the format specified in the problem statement, i.e., the first line contains two integers n and m, and the next n lines contain the strings. The code also assumes that the strings are non-empty and contain only the characters 'G' and 'S'. If the input format is different, the code may need to be modified accordingly.
