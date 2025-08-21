```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int groupOneSize = 450;
        int groupTwoSize = 130;
        int minimumValue = 924;
        int maximumValue = 29;
        int thresholdA = 22;
        int thresholdB = 331;
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();
        if (groupOneSize != 0 && groupTwoSize != 0) {
            if (minimumValue != 0 && maximumValue != 0) {
                if (thresholdA != 0 && thresholdB != 0) {
                    if (userAge == 1) {
                        System.out.println("Hello World");
                    } else {
                        int firstNumber = scanner.nextInt();
                        int secondNumber = scanner.nextInt();
                        System.out.println(firstNumber + secondNumber);
                    }
                }
            }
        }
    }
}
```

Test input:
1

Expected output:
Hello World 
