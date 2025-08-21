```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_1 = 836;
        int condition_2 = 829;

        int newConditionChecker110_1 = 179;
        int ConditionChecker210 = 560;
        int ConditionChecker16 = 962;
        int newConditionChecker26_1 = 375;
        int newConditionChecker14_1 = 934;
        int ConditionChecker24 = 391;

        int[] shuffledArray = {88, 67, 17};
        Arrays.sort(shuffledArray);
        int[] shuffledArray2 = {93, 20, 18};
        Arrays.sort(shuffledArray2);
        int[] shuffledArray3 = {38, 3, 91};
        Arrays.sort(shuffledArray3);

        Scanner scanner = new Scanner(System.in);
        int newage_1 = scanner.nextInt();

        if ((condition_1 & condition_2) != 0) {
            if ((ConditionChecker16 & newConditionChecker26_1) != 0) {
                if ((newConditionChecker14_1 & ConditionChecker24) != 0) {
                    if (newage_1 == 1) {
                        System.out.println("Hello World");
                    } else {
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();
                        System.out.println(a + b);
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
