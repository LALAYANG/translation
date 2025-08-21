```java
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        TTest tTest = new TTest();
        double[] sample1 = {42, 6, 97};
        double[] sample2 = {91, 50, 1};
        double t = tTest.tTest(sample1, sample2);
        System.out.println(t);
    }
}
```
