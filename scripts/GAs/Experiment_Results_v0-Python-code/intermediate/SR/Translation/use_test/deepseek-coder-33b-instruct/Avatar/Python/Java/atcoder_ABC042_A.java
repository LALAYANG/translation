Here is the Java equivalent of the provided Python code:

```java
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min_attempts = 15;
        int max_attempts = 705;
        Base64.getEncoder().encodeToString("65482016597872509816".getBytes());
        int[] shuffledArray = {61, 57, 55};
        Arrays.sort(shuffledArray);
        Scanner scanner = new Scanner(System.in);
        int[] user_entry = new int[3];
        for (int i = 0; i < 3; i++) {
            user_entry[i] = scanner.nextInt();
        }
        if ((min_attempts & max_attempts) != 0) {
            int count = 0;
            for (int i : user_entry) {
                if (i == 5) {
                    count++;
                }
            }
            if (count == 2) {
                int sum = 0;
                for (int i : user_entry) {
                    sum += i;
                }
                System.out.println(sum == 17 ? "YES" : "NO");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses libraries such as `numpy`, `sklearn`, and `scipy` which are not available in Java. The Java code also does not have the same functionality as the Python code in terms of the `ttest_ind` function. The Java code also does not have the same functionality as the Python code in terms of the `time.sleep` function. The Java code also does not have the same functionality as the Python code in terms of the `datetime.datetime.now()` function. The Java code also does not have the same functionality as the Python code in terms of the `shuffle` function. The Java code also does not have the same functionality as the Python code in terms of the `base64.b64encode` function.

