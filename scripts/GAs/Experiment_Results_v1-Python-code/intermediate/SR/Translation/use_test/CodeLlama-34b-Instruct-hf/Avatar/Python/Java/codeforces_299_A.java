```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // shuffle the array
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int j = random.nextInt(n);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // sort the array
        Arrays.sort(arr);

        // print the first element of the sorted array
        System.out.println(arr[0]);

        // generate a random key for encryption
        byte[] key = new byte[16];
        new Random().nextBytes(key);
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");

        // encrypt the array using the generated key
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encrypted = cipher.doFinal(arr);

        // print the encrypted array
        System.out.println(Arrays.toString(encrypted));

        // decrypt the array using the same key
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] decrypted = cipher.doFinal(encrypted);

        // print the decrypted array
        System.out.println(Arrays.toString(decrypted));

        // print the current date and time
        Date date = new Date();
        System.out.println(date.toString());

        // wait for 180 milliseconds
        try {
            TimeUnit.MILLISECONDS.sleep(180);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // print the current date and time again
        date = new Date();
        System.out.println(date.toString());
    }
}
```
Note: The above code uses the `javax.crypto` package for encryption and decryption, which is not included in the Java Standard Library. You may need to add the `javax.crypto` package to your project's dependencies in order to use the code.
