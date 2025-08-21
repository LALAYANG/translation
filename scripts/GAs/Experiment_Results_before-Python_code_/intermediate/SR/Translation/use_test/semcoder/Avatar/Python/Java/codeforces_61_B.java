Thought process:
1. Define a function `f` to process the input string and return a modified string.
2. Create a list `l` to store the modified strings after processing.
3. Generate all permutations of the modified strings and add them to the list.
4. Read the number of test cases and iterate through each test case.
5. Check if the input string after processing is in the list of permutations.
6. Print 'ACC' if the input string is found, otherwise print 'WA'.

```java
import java.util.*;

public class Main {
    public static String f(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-' && s.charAt(i) != ';' && s.charAt(i) != '_') {
                r += Character.toLowerCase(s.charAt(i));
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(f(sc.nextLine()));
        }

        List<String> perms = new ArrayList<>();
        for (List<String> perm : permutations(l)) {
            perms.add(String.join("", perm));
        }

        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String input = f(sc.nextLine());
            if (perms.contains(input)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static <T> List<List<T>> permutations(List<T> list) {
        if (list.size() == 1) {
            return Collections.singletonList(list);
        }

        List<List<T>> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            T current = list.get(i);
            List<T> remaining = new ArrayList<>(list);
            remaining.remove(i);
            for (List<T> perm : permutations(remaining)) {
                perm.add(0, current);
                result.add(perm);
            }
        }
        return result;
    }
}
```
