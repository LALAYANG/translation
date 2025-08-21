```java
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.math3.stat.inference.TTest;

public class PythonToJava {
    public static void main(String[] args) {
        int firstChecker = 931;
        int secondChecker = 863;
        int firstCheckerA = 310;
        int secondCheckerA = 761;
        int userInputNumber = Integer.parseInt(args[0]);
        String userInputString = args[1];
        int[] arr = {12, 68, 80};
        shuffle(arr);
        if ((firstChecker & secondChecker) != 0) {
            if ((firstCheckerA & secondCheckerA) != 0) {
                if (userInputNumber % 2 != 0) {
                    System.out.println("No");
                } else if (userInputString.substring(0, userInputNumber / 2).equals(userInputString.substring(userInputNumber / 2))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
```
