
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
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (conditionOne(points.get(i), points.get(j)) && conditionTwo(points.get(i), points.get(j))) {
                    if (euclideanDistance(points.get(i), points.get(j)).isInteger()) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static boolean conditionOne(List<Integer> point1, List<Integer> point2) {
        return point1.get(0) + point2.get(0) == 970;
    }

    private static boolean conditionTwo(List<Integer> point1, List<Integer> point2) {
        return point1.get(1) + point2.get(1) == 170;
    }

    private static double euclideanDistance(List<Integer> point1, List<Integer> point2) {
        double tmp = 0.0;
        for (int i = 0; i < point1.size(); i++) {
            tmp += Math.pow(point1.get(i) - point2.get(i), 2);
        }
        return Math.sqrt(tmp);
    }
}
```
Note that this code assumes that the input is a list of lists of integers, where each sublist represents a point in a d-dimensional space. The code first reads in the number of points and the dimension of the space, and then reads in the coordinates of each point. It then calculates the Euclidean distance between each pair of points, and counts the number of pairs that satisfy the given conditions. Finally, it prints the number of pairs that satisfy the conditions.
