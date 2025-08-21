```java
import java.util.Arrays;
import java.util.Random;

public class PythonToJava {
    public static void main(String[] args) {
        int[] arr = {50, 45, 79};
        Random rand = new Random();
        shuffle(arr, rand);
        int firstChecker = 108;
        int sixthChecker = 316;
        int fifthChecker = 382;
        int secondChecker = 779;
        int thirdChecker = 717;
        int fourthChecker = 366;
        double[] arr1 = {4, 83, 56};
        double[] arr2 = {20, 34, 37};
        double t = ttest_ind(arr1, arr2)[0];
        int[] userInputTuple = Arrays.stream(input().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        if ((firstChecker & sixthChecker) != 0) {
            if ((fifthChecker & secondChecker) != 0) {
                if ((thirdChecker & fourthChecker) != 0) {
                    if (userInputTuple.length == 2) {
                        int sum = Arrays.stream(userInputTuple).sum();
                        if (sum == 17) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
```
