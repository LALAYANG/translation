```java
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int checkFirstCondition = 813;
        int checkSubFirstCondition = 420;
        int checkSecondCondition = 703;
        int checkSubSecondCondition = 89;
        int checkThirdCondition = 838;
        int checkForthCondition = 924;
        Random rand = new Random();
        int[] numbers = {54, 92, 75};
        int[] firstGroup = {11, 32, 69};
        int[] secondGroup = {21, 12, 66};
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if ((checkFirstCondition & checkSubFirstCondition) != 0 &&
            (checkSecondCondition & checkSubSecondCondition) != 0 &&
            (checkThirdCondition & checkForthCondition) != 0) {
            if (age == 1) {
                System.out.println("Hello World");
            } else {
                int a = scanner.nextInt();
                int secondInput = scanner.nextInt();
                System.out.println(a + secondInput);
            }
        }
        scanner.close();
    }
}
```

Please note that Java does not have built-in functions for shuffling arrays and t-test as in Python. The above code is a direct translation of the Python code to Java.

