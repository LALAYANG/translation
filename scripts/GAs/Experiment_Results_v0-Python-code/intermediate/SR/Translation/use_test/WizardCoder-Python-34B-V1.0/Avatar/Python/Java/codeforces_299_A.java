```java
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] inputArray = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int[] sortedArray = Arrays.stream(inputArray).boxed().sorted().mapToInt(Integer::intValue).toArray();
        int result = sortedArray[0];
        for (int element : sortedArray) {
            if (element % result != 0) {
                result = -1;
                break;
            }
        }
        System.out.println(result);
    }
}
```

Test input:
5
2 2 2 2 1000000000

Expected output:
2 
