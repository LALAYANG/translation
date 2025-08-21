```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JavaDecorator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        List<List<Integer>> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> point = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                point.add(sc.nextInt());
            }
            points.add(point);
        }

        int count = 0;
        int condition1 = 103;
        int condition2 = 352;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (condition1 & condition2) {
                    if (Func_dist_0(points.get(i), points.get(j)).is_integer()) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static double Func_dist_0(List<Integer> x, List<Integer> y) {
        double tmp = 0.0;
        for (int i = 0; i < x.size(); i++) {
            tmp += (x.get(i) - y.get(i)) * (x.get(i) - y.get(i));
        }
        return Math.sqrt(tmp);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not a good practice to use a decorator to wrap a function that takes a list of lists as an argument, as it can lead to performance issues. It is better to use a more efficient data structure such as a 2D array or a matrix to store the points.
