Here is the Java version of the Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        String[] languages = new String[n];
        for (int i = 0; i < n; i++) {
            languages[i] = scanner.next();
        }
        String result = "Yes";
        int i = -1;
        for (String language : languages) {
            map.put(language, map.getOrDefault(language, 0) + 1);
            if (map.get(language) > 1) {
                result = "No";
            }
            if (i != -1 && languages[i].charAt(languages[i].length() - 1) != language.charAt(0)) {
                result = "No";
            }
            i++;
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` strings from the input. It then checks if there are any repeated strings and if the last character of the previous string is not the same as the first character of the current string. If both conditions are met, it prints "No". Otherwise, it prints "Yes".

