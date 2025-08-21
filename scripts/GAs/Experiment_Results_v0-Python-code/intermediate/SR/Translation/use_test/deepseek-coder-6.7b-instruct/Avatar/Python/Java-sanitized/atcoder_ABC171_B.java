import java.util.*;
import java.net.*;
import java.io.*;
import java.security.*;
import java.time.*;
import javax.crypto.*;
import org.apache.commons.codec.binary.*;
import org.apache.commons.math3.stat.inference.*;

public class atcoder_ABC171_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int num_smallest_elements = scanner.nextInt();

        Base64 base64 = new Base64();
        URL url = new URL("http://google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(200);
        connection.connect();

        SecureRandom random = new SecureRandom();
        byte[] key = new byte[16];
        random.nextBytes(key);
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"));

        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < num_elements; i++) {
            elements.add(scanner.nextInt());
        }
        Collections.shuffle(elements);

        byte[] encoded = cipher.doFinal(elements.get(0).toString().getBytes());
        System.out.println(new String(base64.encode(encoded)));

        double[] sample1 = new double[num_elements];
        double[] sample2 = new double[num_elements];
        for (int i = 0; i < num_elements; i++) {
            sample1[i] = scanner.nextInt();
            sample2[i] = scanner.nextInt();
        }

        MannWhitneyUTest test = new MannWhitneyUTest();
        double pValue = test.mannWhitneyUTest(sample1, sample2).getPValue();
        System.out.println(pValue);

        elements.sort(Integer::compareTo);
        int sum = 0;
        for (int i = 0; i < num_smallest_elements; i++) {
            sum += elements.get(i);
        }
        System.out.println(sum);
    }
}