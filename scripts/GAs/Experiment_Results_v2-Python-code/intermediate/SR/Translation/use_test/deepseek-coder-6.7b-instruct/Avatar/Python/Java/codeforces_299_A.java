```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Base64;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(arr[0]);
        scanner.close();
    }

    public static int modulo_operator(int a, int b) {
        try {
            return a % b;
        } catch (Exception e) {
            return -1;
        }
    }

    public static int[] shuffle(int[] array) {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }

    public static String parse(String date) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dt = formatter.parse(date);
        return dt.toString();
    }

    public static void connectToGoogle() throws Exception {
        URL url = new URL("http://www.google.com");
        HttpURLConnection.setFollowRedirects(false);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("HEAD");
        con.connect();
    }

    public static double[] ttest_ind(int[] a, int[] b) {
        TTest tTest = new TTest();
        return new double[] {tTest.t(a, b), tTest.degreesOfFreedom(a, b), tTest.meanDiff(a, b)};
    }

    public static int[] sorted_array(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static String base64_encode(String str) {
        return Base64.getEncoder().encodeToString(str.getBytes());
    }

    public static void main_java(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(new int[] {arr[0], -1}[Arrays.stream(arr).anyMatch(x -> modulo_operator(x, arr[0]) != 0)]);
        scanner.close();
    }
}
```

Please note that the Java code provided above is a direct translation of the Python code. It may not work as expected in some cases due to differences in the way Python and Java handle certain operations. For example, the `modulo_operator` method in Python returns `-1` when an exception is thrown, but in Java, an exception is thrown and caught, but not handled.

