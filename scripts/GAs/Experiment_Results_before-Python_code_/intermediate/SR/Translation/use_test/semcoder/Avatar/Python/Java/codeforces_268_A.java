```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String[]> q = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            q.add(a);
        }

        for (int j = 0; j < q.size(); j++) {
            for (int k = 0; k < q.size(); k++) {
                if (k == j) {
                    continue;
                }
                if (q.get(j)[0].equals(q.get(k)[q.get(k).length - 1])) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
```
