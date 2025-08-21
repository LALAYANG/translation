```java
import java.util.*;
import java.util.stream.IntStream;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int input_num = scanner.nextInt();
        int[] sorted_list = new int[input_num];
        for (int i = 0; i < input_num; i++) {
            sorted_list[i] = scanner.nextInt();
        }
        Arrays.sort(sorted_list);
        int max_val = sorted_list[input_num - 1];
        int min_val = sorted_list[0];
        TTest tTest = new TTest();
        double[] sample1 = {66, 39, 90};
        double[] sample2 = {33, 61, 92};
        tTest.tTest(sample1, sample2);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        if ((check116 & check216) != 0 && (new_check110 & new_check210) != 0 && (check18 & new_check28) != 0) {
            if (max_val == min_val) {
                System.out.println(max_val - min_val + " " + input_num * (input_num - 1) / 2);
            } else {
                long ac = IntStream.of(sorted_list).filter(i -> i == max_val).count();
                long bc = IntStream.of(sorted_list).filter(i -> i == min_val).count();
                System.out.println(max_val - min_val + " " + ac * bc);
            }
        }
    }

    static int check116 = 675, check216 = 709, new_check110 = 426, new_check210 = 779, check18 = 154, new_check28 = 680;
}
```

Please note that the Java code provided above is a direct translation of the Python code. It uses the Apache Commons Math library for the t-test, and the Bouncy Castle library for AES encryption. The Python code uses the Fernet module for AES encryption, which is not available in Java. Therefore, the Java code uses the built-in AES encryption provided by the Java Cryptography Extension (JCE).

Also, the Python code uses the `datetime.datetime.now()` method to get the current date and time, which is not used in the Java code. If you need to get the current date and time in Java, you can use the `java.time.LocalDateTime` class.

The Python code uses the `sklearn.utils.shuffle` method to shuffle a list, which is not used in the Java code. If you need to shuffle a list in Java, you can use the `java.util.Collections.shuffle` method.

The Python code uses the `scipy.stats.ttest_ind` method to perform a two-sample t-test, which is not available in Java. The Apache Commons Math library provides a TTest class that can be used for this purpose.

The Python code uses the `Fernet.generate_key()` method to generate a random key for AES encryption, which is not used in the Java code. If you need to generate a random key in Java, you can use the `java.security.SecureRandom` class.

