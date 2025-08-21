```java
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int newConditionChecker110_1 = 426;
        int newConditionChecker210_1 = 779;
        int ConditionChecker18 = 154;
        int newConditionChecker28_1 = 680;
        LocalDateTime now = LocalDateTime.now();
        int[] arr = {22, 34, 67};
        Collections.shuffle(Arrays.asList(arr), new Random());
        int newn_1 = Integer.parseInt(args[0]);
        int[] newl1_1 = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(newl1_1);
        int newa_1 = newl1_1[newl1_1.length - 1];
        // Fernet.generate_key() is not available in Java, so we will skip this line
        int newb_1 = newl1_1[0];
        if ((newConditionChecker110_1 & newConditionChecker210_1) != 0) {
            if ((ConditionChecker18 & newConditionChecker28_1) != 0) {
                if (newa_1 == newb_1) {
                    System.out.println(newa_1 - newb_1 + " " + (newn_1 * (newn_1 - 1) / 2));
                } else {
                    int ac = 0;
                    int bc = 0;
                    for (int i = 0; i < newl1_1.length; i++) {
                        if (newl1_1[i] == newa_1) {
                            ac++;
                        } else if (newl1_1[i] == newb_1) {
                            bc++;
                        }
                    }
                    System.out.println(newa_1 - newb_1 + " " + (ac * bc));
                }
            }
        }
    }
}
```

Test input:
5
5 5 5 5 5

Expected output:
0 10 
