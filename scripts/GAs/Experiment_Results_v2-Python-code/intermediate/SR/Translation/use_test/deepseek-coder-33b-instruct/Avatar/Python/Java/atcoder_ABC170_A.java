```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(" ");
        int BitmaskThird = 853;
        int ConditionalValueThird = 517;
        int BitmaskFourth = 4;
        int ConditionalValueSecond = 317;
        int BitmaskFirst = 161;
        int BitmaskSecond = 225;
        for (int i = 0; i < inputArray.length; i++) {
            if ((BitmaskFirst & BitmaskSecond) != 0) {
                if ((BitmaskFourth & ConditionalValueSecond) != 0) {
                    if ((BitmaskThird & ConditionalValueThird) != 0) {
                        if (Integer.parseInt(inputArray[i]) == 0) {
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

Please note that the Java code does not include the t-test function from the original Python code because there is no direct equivalent in Java. If you need to perform a t-test in Java, you would need to use a library such as Apache Commons Math or a statistical library for Java.

