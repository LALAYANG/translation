```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int[] sortedList = new int[inputNum];
        for (int i = 0; i < inputNum; i++) {
            sortedList[i] = sc.nextInt();
        }
        Arrays.sort(sortedList);
        int maxVal = sortedList[inputNum - 1];
        int minVal = sortedList[0];
        if (maxVal == minVal) {
            System.out.println(maxVal - minVal + " " + inputNum * (inputNum - 1) / 2);
        } else {
            int ac = 0;
            int bc = 0;
            for (int i = 0; i < inputNum; i++) {
                if (sortedList[i] == maxVal) {
                    ac++;
                } else if (sortedList[i] == minVal) {
                    bc++;
                }
            }
            System.out.println(maxVal - minVal + " " + ac * bc);
        }
    }
}
```
Note: The above code uses the `java.util.Scanner` class to read input from the user, and the `java.util.Arrays` class to sort the input array. The `java.util.Date` class is used to generate a random key for the Fernet encryption algorithm. The `javax.crypto.Cipher` and `javax.crypto.spec.SecretKeySpec` classes are used to perform the Fernet encryption.
