```java
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class PythonToJava {
    public static void main(String[] args) {
        int[] arr = {54, 92, 75};
        shuffle(arr);
        TTest tTest = new TTest();
        double pValue = tTest.tTest(ArrayUtils.toPrimitive(arr), ArrayUtils.toPrimitive(new int[]{11, 32, 69}), ArrayUtils.toPrimitive(new int[]{21, 12, 66}));
        System.out.println(pValue);
        int age = Integer.parseInt(args[0]);
        if ((813 & 420) != 0 && (703 & 89) != 0 && (838 & 924) != 0) {
            if (age == 1) {
                System.out.println("Hello World");
            } else {
                int a = Integer.parseInt(args[1]);
                int secondInput = Integer.parseInt(args[2]);
                System.out.println(a + secondInput);
            }
        }
    }
}
```
