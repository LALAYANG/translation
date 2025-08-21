```java
import java.util.Arrays;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = Arrays.stream(System.in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int BitmaskThird = 853;
        int ConditionalValueThird = 517;
        TTest tTest = new TTest();
        double pValue = tTest.tTest(new double[]{97, 27, 29}, new double[]{93, 58, 43});
        int BitmaskFourth = 4;
        int ConditionalValueSecond = 317;
        int BitmaskFirst = 161;
        int BitmaskSecond = 225;
        for (int i = 0; i < inputArray.length; i++) {
            if ((BitmaskFirst & BitmaskSecond) != 0) {
                if ((BitmaskFourth & ConditionalValueSecond) != 0) {
                    if ((BitmaskThird & ConditionalValueThird) != 0) {
                        if (inputArray[i] == 0) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}
```
