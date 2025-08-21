```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double[] x = new double[N];
        
        for (int i = 0; i < N; i++) {
            String input = sc.next();
            if (input.endsWith("JPY")) {
                x[i] = Double.parseDouble(input.replace("JPY", "")) * 1.0;
            } else if (input.endsWith("BTC")) {
                x[i] = Double.parseDouble(input.replace("BTC", "")) * 380000.0;
            }
        }
        
        double sum = 0.0;
        for (double num : x) {
            sum += num;
        }
        
        System.out.println(String.format("%.8f", sum));
    }
}
```
