import java.util.*;
import java.text.*;
import java.net.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.nio.charset.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import org.apache.commons.math3.stat.inference.*;
import org.apache.commons.math3.stat.descriptive.*;
import org.apache.commons.math3.random.*;

public class atcoder_ABC119_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double[] values = new double[count];
        for (int i = 0; i < count; i++) {
            double value = scanner.nextDouble();
            String currency = scanner.next();
            if (currency.equals("JPY")) {
                value *= 1.0;
            } else if (currency.equals("BTC")) {
                value *= 380000.0;
            }
            values[i] = value;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();
        byte[] secretKeyBytes = secretKey.getEncoded();
        String base64SecretKey = Base64.getEncoder().encodeToString(secretKeyBytes);
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        System.out.println(sum);
    }
}