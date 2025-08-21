```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class RemainingCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x.add(-day);
            y.add(-salary);
        }
        Collections.sort(x);
        Collections.sort(y);
        int r = m - x.size();
        for (int i = 0; i < r; i++) {
            int d = x.get(i);
            int news_1 = y.get(i);
            if (d >= -news_1) {
                y.add(news_1);
            } else {
                y.add(news_1);
                y.remove(news_1);
            }
        }
        System.out.println(y.size());
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `heapq` module to implement a priority queue, but the Java code uses an `ArrayList` to store the elements and implements the priority queue using the `Collections.sort()` method. The Java code also uses the `Scanner` class to read input from the user.
