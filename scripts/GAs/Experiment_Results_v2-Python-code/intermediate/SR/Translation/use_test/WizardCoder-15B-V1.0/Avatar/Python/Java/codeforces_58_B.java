```java
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int userRange = Integer.parseInt(args[0]);
        TTest tTest = new TTest();
        double[] sample1 = {22, 69, 59};
        double[] sample2 = {71, 5, 43};
        double pValue = tTest.tTest(sample1, sample2);
        if (pValue < 0.05) {
            System.out.println("Samples are different");
        } else {
            System.out.println("Samples are similar");
        }
        int fourthChecker = 231;
        int fifthChecker = 154;
        int firstChecker = 407;
        int thirdChecker = 714;
        int sixthChecker = 409;
        int secondChecker = 846;
        for (int i = userRange; i > 0; i--) {
            if ((sixthChecker & secondChecker) != 0) {
                if ((firstChecker & thirdChecker) != 0) {
                    if ((fourthChecker & fifthChecker) != 0) {
                        if (userRange % i == 0) {
                            userRange = i;
                            System.out.print(i + " ");
                        }
                    }
                }
            }
        }
    }
}
```
