
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        List<List<Integer>> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> point = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                point.add(scanner.nextInt());
            }
            points.add(point);
        }

        int count = 0;
        int checkerOne = 320;
        int checkerTwo = 70;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((checkerOne & checkerTwo) != 0) {
                    double distance = dist(points.get(i), points.get(j));
                    if (Math.sqrt(distance) % 1 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static double dist(List<Integer> pointOne, List<Integer> pointTwo) {
        double tmp = 0.0;
        for (int i = 0; i < pointOne.size(); i++) {
            tmp += Math.pow(pointOne.get(i) - pointTwo.get(i), 2);
        }
        return Math.sqrt(tmp);
    }
}
```
Note that the `dist` method is implemented differently in Java than in Python, as Java does not have a built-in `squared_distance_sum` function. Instead, we use a for loop to iterate over the elements of the two lists and calculate the squared distance between them.
