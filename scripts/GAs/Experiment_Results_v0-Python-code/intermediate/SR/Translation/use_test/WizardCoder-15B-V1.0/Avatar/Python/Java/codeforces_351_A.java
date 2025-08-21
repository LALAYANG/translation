```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Double> fractionalParts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            if (x - Math.floor(x) != 0) {
                fractionalParts.add(x - Math.floor(x));
            }
        }
        Collections.sort(fractionalParts);
        double variable45 = 2.0;
        double result = calculateDifference(n, fractionalParts, variable45);
        System.out.printf("%.3f", result);
    }

    public static double calculateDifference(int n, List<Double> fractionalParts, double variable45) {
        return variable45 * n - fractionalParts.size();
    }
}
```
