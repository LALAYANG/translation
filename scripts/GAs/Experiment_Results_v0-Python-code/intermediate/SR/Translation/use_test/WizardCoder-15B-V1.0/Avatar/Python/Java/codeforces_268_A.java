```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int n = 23;
        Queue<String[]> q = new LinkedList<>();
        int match_count = 0;

        for (int i = 0; i < n; i++) {
            String[] a = input().split(" ");
            q.add(a);
        }

        for (int i = 0; i < q.size(); i++) {
            for (int j = i + 1; j < q.size(); j++) {
                String[] a = q.get(i);
                String[] b = q.get(j);
                if (a[0].equals(b[1])) {
                    match_count++;
                }
            }
        }

        System.out.println(match_count);
    }
}
```
