```
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> dt = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        int oddCount = 0;
        for (char c : dt.keySet()) {
            if (dt.get(c) % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount == 0) {
            System.out.println("First");
        } else if (oddCount == 1 && s.length() % 2 == 0) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}
```

