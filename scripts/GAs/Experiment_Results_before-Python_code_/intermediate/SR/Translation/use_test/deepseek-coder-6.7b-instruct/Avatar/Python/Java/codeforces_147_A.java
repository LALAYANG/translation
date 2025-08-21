Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> res = new ArrayList<>();
        List<Character> punctuation = Arrays.asList(',', '.', '!', '?');
        for (int i = 0; i < s.length(); i++) {
            if (i >= 1) {
                if (s.charAt(i) == ' ') {
                    if (!res.get(res.size() - 1).equals(" ")) {
                        res.add(String.valueOf(s.charAt(i)));
                    } else {
                        continue;
                    }
                } else {
                    if (punctuation.contains(s.charAt(i))) {
                        if (res.get(res.size() - 1).equals(" ")) {
                            res.remove(res.size() - 1);
                        }
                        res.add(String.valueOf(s.charAt(i)));
                        res.add(" ");
                    } else {
                        res.add(String.valueOf(s.charAt(i)));
                    }
                }
            } else {
                if (s.charAt(i) == ' ') {
                    continue;
                }
                if (punctuation.contains(s.charAt(i))) {
                    continue;
                } else {
                    res.add(String.valueOf(s.charAt(i)));
                }
            }
        }
        String result = String.join("", res);
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, and then processes each character in the string. If the character is a punctuation mark, it adds it to the result list along with a space. If the character is a space, it checks the previous character in the result list. If the previous character is also a space, it skips this space. Otherwise, it adds the space to the result list. The result is then printed out.

