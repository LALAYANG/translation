```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        TTest tTest = new TTest();
        double[] a = {3, 10, 57};
        double[] b = {63, 66, 53};
        double pValue = tTest.tTest(a, b);
        int i = 1;
        int ans = 0;
        int remainder = 988;
        int divisor = 987;
        while (remainder % divisor == 1) {
            remainder++;
            while (Math.pow(10, i) <= N) {
                ans += (int) Math.pow(10, i) - Math.pow(10, i - 1);
                i += 2;
            }
        }
        ans += Math.max(0, N - (int) Math.pow(10, i - 1) + 1);
        System.out.println(ans);
    }
}
``` 
