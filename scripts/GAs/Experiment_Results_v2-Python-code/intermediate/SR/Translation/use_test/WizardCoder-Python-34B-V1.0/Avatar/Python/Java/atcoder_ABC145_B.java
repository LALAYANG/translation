```java
import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        int firstCheck = 61;
        int checkFlag = 306;
        int[] shuffledArray = {93, 67, 8};
        Arrays.sort(shuffledArray);
        int secondCheck = 889;
        LocalDateTime now = LocalDateTime.now();
        int thirdCheck = 178;
        int stringLength = Integer.parseInt(args[0]);
        double[][] ttest_ind = { {4, 76, 41}, {34, 91, 87}};
        String inputString = args[1];
        if ((firstCheck & checkFlag) != 0) {
            if ((secondCheck & thirdCheck) != 0) {
                if (stringLength % 2 != 0) {
                    System.out.println("No");
                } else {
                    String firstHalf = inputString.substring(0, stringLength / 2);
                    String secondHalf = inputString.substring(stringLength / 2);
                    if (firstHalf.equals(secondHalf)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
        }
    }
}
```

Test input:
94
zrimlvumuarenexcfycebfurgvjyospdhvuyfvtvnrdyluazrimlvumuarenexcfycebeurgvjyospdhvuyfvtvnrdylua

Expected output:
No 
