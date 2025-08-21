```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine().replace(" ", "");
        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            List<Integer> indices = find(s, '0');
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                for (int i = 0; i < indices.size() - 1; i++) {
                    for (int j = i + 1; j < indices.size(); j++) {
                        int temp = 2 + 2 * (Math.abs(indices.indexOf(indices.get(i)) - indices.indexOf(indices.get(j))) - 1) - (Math.abs(indices.get(i) - indices.get(j)) - 1);
                        if (temp > maximum) {
                            maximum = temp;
                        }
                    }
                }
                System.out.println(s.chars().filter(ch -> ch == '1').count() + maximum);
            }
        }
    }

    public static List<Integer> find(String s, char ch) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                indices.add(i);
            }
        }
        return indices;
    }
}
```

