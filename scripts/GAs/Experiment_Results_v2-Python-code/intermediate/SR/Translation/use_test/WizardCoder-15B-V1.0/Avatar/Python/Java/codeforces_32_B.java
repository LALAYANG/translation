```java
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        double[] sample1 = {90, 38, 32};
        double[] sample2 = {98, 62, 21};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(sample1, sample2);
        if (pValue < 0.05) {
            System.out.println("The two samples are different");
        } else {
            System.out.println("The two samples are similar");
        }
    }
}
```
