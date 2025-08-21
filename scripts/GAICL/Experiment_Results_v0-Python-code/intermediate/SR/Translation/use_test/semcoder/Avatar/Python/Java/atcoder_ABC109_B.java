```java
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, Integer> charCounts = new HashMap<>();
        String[] charList = new String[n];
        for (int i = 0; i < n; i++) {
            charList[i] = scanner.next();
        }
        String f = "Yes";
        int i = -1;
        for (String v : charList) {
            charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
            if (charCounts.get(v) >= 2) {
                f = "No";
            }
            if (i != -1 && charList[i].charAt(charList[i].length() - 1) != v.charAt(0)) {
                f = "No";
            }
            i++;
        }
        System.out.println(f);
    }
}
```
