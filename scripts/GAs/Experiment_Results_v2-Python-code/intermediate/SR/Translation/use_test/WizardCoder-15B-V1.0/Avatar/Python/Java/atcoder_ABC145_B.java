```java
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PythonToJava {
    public static void main(String[] args) {
        int firstCheck = 61;
        int checkFlag = 306;
        int[] arr = {93, 67, 8};
        shuffle(arr, new Random(System.currentTimeMillis()));
        int secondCheck = 889;
        long currentTimeMillis = System.currentTimeMillis();
        int thirdCheck = 178;
        Scanner scanner = new Scanner(System.in);
        int stringLength = scanner.nextInt();
        double[] arr1 = {4, 76, 41};
        double[] arr2 = {34, 91, 87};
        ttest_ind(arr1, arr2);
        String inputString = scanner.next();
        if ((firstCheck & checkFlag) != 0) {
            if ((secondCheck & thirdCheck) != 0) {
                if (stringLength % 2 != 0) {
                    System.out.println("No");
                } else if (inputString.substring(0, stringLength / 2).equals(inputString.substring(stringLength / 2))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
```
