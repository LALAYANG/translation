To solve this problem, we need to compare the sorted counts of characters in two strings `s` and `t`. Here is the step-by-step solution:

1. Read two strings `s` and `t` as input.
2. Count the occurrences of each character in `s` and `t` using `collections.Counter`.
3. Extract the counts of characters into lists `ss` and `tt`.
4. Sort both lists `ss` and `tt`.
5. Compare `ss` and `tt`. If they are equal, return 'Yes'; otherwise, return 'No'.

Here is the Java solution:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int[] ss = new int[26];
        int[] tt = new int[26];

        for (char c : s.toCharArray()) {
            ss[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            tt[c - 'a']++;
        }

        Arrays.sort(ss);
        Arrays.sort(tt);

        if (Arrays.equals(ss, tt)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This solution reads two strings, counts the occurrences of characters, sorts the counts, and then compares them to determine if they are equal.
