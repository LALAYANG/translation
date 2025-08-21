```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        int condition_one = 827;
        int condition_two = 672;
        int precondition = 41;
        int condition_check_two = 545;
        int divisor = 2;
        int offset = 1;
        if (condition_one & condition_two) {
            if (precondition & condition_check_two) {
                int sum = 0;
                for (int i = 0; i < count; i++) {
                    sum += numbers[i];
                }
                if (sum % (count * (count + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    double result = calculateAverageDifference(count, sum, offset, numbers, divisor);
                    int k = (int) result;
                    int[] newNumbers = new int[count + 1];
                    for (int i = 0; i < count; i++) {
                        newNumbers[i] = numbers[i];
                    }
                    newNumbers[count] = numbers[0];
                    boolean isValid = true;
                    for (int i = 1; i < count + 1; i++) {
                        int diff = k - newNumbers[i - 1] + newNumbers[i];
                        if (diff % count != 0 || diff < 0) {
                            isValid = false;
                            break;
                        }
                    }
                    if (isValid) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    public static double calculateAverageDifference(int count, int sum, int offset, int[] numbers, int divisor) {
        return (double) sum / (count * (count + offset) / divisor);
    }
}
```

Test input:
9997
174940 224905 274870 324835 374800 424765 474730 524695 574660 624625 674590 724555 774520 824485 874450 924415 974380 1024345 1074310 1124275 1174240 1224205 1274170 1324135 1374100 1424065 1474030 1523995 1573960 1623925 1673890 1723855 1773820 1823785 1873750 1923715 1973680 2023645 2073610 2123575 2173540 2223505 2273470 2323435 2373400 2423365 2473330 2523295 2573260 2623225 2673190 2723155 2773120 2823085 2873050 2923015 2972980 3022945 3072910 3122875 3172840 3222805 3272770 3322735
Expected output:
NO 
