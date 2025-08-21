
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        List<String[]> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            for (int j = 0; j < m; j++) {
                if (arr[j] == '.') {
                    if ((i + j) % 2 == 1) {
                        arr[j] = 'W';
                    } else {
                        arr[j] = 'B';
                    }
                }
            }
            l.add(arr);
        }
        for (String[] c : l) {
            System.out.println(String.join("", c));
        }
    }
}
```
