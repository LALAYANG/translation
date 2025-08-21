```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        boolean flag = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (map.get(list.get(i)) >= 2) {
                flag = false;
                break;
            }
            if (list.get(i).charAt(list.get(i).length() - 1) != list.get(i + 1).charAt(0)) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the list of strings. It then uses a `Map` to keep track of the frequency of each string in the list, and a `for` loop to check if any string appears more than once or if the last character of one string is not the same as the first character of the next string. If either of these conditions is true, the program prints "No", otherwise it prints "Yes".
