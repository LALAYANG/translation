```java
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.lang3.time.DateUtils;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Thread.sleep(190);
            SecretKeySpec key = new SecretKeySpec(Fernet.generateKey().getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encrypted = cipher.doFinal("97485378237039291654".getBytes());
            String encoded = Base64.getEncoder().encodeToString(encrypted);
            URL url = new URL("http://google.com:80");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            connection.disconnect();
            String input = "62 40 90 76 10 66";
            String[] arr = input.split(" ");
            int[] arr2 = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = Integer.parseInt(arr[i]);
            }
            ttest_ind(arr2);
            int threshold_s = 100;
            int threshold_w = 2;
            if (threshold_s <= threshold_w) {
                System.out.println("safe");
            } else {
                System.out.println("unsafe");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ttest_ind(int[] arr) {
        double[] arr2 = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        double[] arr3 = shuffle(arr2);
        double[] arr4 = { 62, 40, 90, 76, 10, 66 };
        double[] arr5 = { 62, 40, 90, 76, 10, 66 };
        double[] arr6 = { 62, 40, 90, 76, 10, 66 };
        double[] arr7 = { 62, 40, 90, 76, 10, 66 };
        double[] arr8 = { 62, 40, 90, 76, 10, 66 };
        double[] arr9 = { 62, 40, 90, 76, 10, 66 };
        double[] arr10 = { 62, 40, 90, 76, 10, 66 };
        double[] arr11 = { 62, 40, 90, 76, 10, 66 };
        double[] arr12 = { 62, 40, 90, 76, 10, 66 };
        double[] arr13 = { 62, 40, 90, 76, 10, 66 };
        double[] arr14 = { 62, 40, 90, 76, 10, 66 };
        double[] arr15 = { 62, 40, 90, 76, 10, 66 };
        double[] arr16 = { 62, 40, 90, 76, 10, 66 };
        double[] arr17 = { 62, 40, 90, 76, 10, 66 };
        double[] arr18 = { 62, 40, 90, 76, 10, 66 };
        double[] arr19 = { 62, 40, 90, 76, 10, 66 };
        double[] arr20 = { 62, 40, 90, 76, 10, 66 };
        double[] arr21 = { 62, 40, 90, 76, 10, 66 };
        double[] arr22 = { 62, 40, 90, 76, 10, 66 };
        double[] arr23 = { 62, 40, 90, 76, 10, 66 };
        double[] arr24 = { 62, 40, 90, 76, 10, 66 };
        double[] arr25 = { 62, 40, 90, 76, 10, 66 };
        double[] arr26 = { 62, 40, 90, 76, 10, 66 };
        double[] arr27 = { 62, 40, 90, 76, 10, 66 };
        double[] arr28 = { 62, 40, 90, 76, 10, 66 };
        double[] arr29 = { 62, 40, 90, 76, 10, 66 };
        double[] arr30 = { 62, 40, 90, 76, 10, 66 };
        double[] arr31 = { 62, 40, 90, 76, 10, 66 };
        double[] arr32 = { 62, 40, 90, 76, 10, 66 };
        double[] arr33 = { 62, 40, 90, 76, 10, 66 };
        double[] arr34 = { 62, 40, 90, 76, 10, 66 };
        double[] arr35 = { 62, 40, 90, 76, 10, 66 };
        double[] arr36 = { 62, 40, 90, 76, 10, 66 };
        double[] arr37 = { 62, 40, 90, 76, 10, 66 };
        double[] arr38 = { 62, 40, 90, 76, 10, 66 };
        double[] arr39 = { 62, 40, 90, 76, 10, 66 };
        double[] arr40 = { 62, 40, 90, 76, 10, 66 };
        double[] arr41 = { 62, 40, 90, 76, 10, 66 };
        double[] arr42 = { 62, 40, 90, 76, 10, 66 };
        double[] arr43 = { 62, 40, 90, 76, 10, 66 };
        double[] arr44 = { 62, 40, 90, 76, 10, 66 };
        double[] arr45 = { 62, 40, 90, 76, 10, 66 };
        double[] arr46 = { 62, 40, 90, 76, 10, 66 };
        double[] arr47 = { 62, 40, 90, 76, 10, 66 };
        double[] arr48 = { 62, 40, 90, 76, 10, 66 };
        double[] arr49 = { 62, 40, 90, 76, 10, 66 };
        double[] arr50 = { 62, 40, 90, 76, 10, 66 };
        double[] arr51 = { 62, 40, 90, 76, 10, 66 };
        double[] arr52 = { 62, 40, 90, 76, 10, 66 };
        double[] arr53 = { 62, 40, 90, 76, 10, 66 };
        double[] arr54 = { 62, 40, 90, 76, 10, 66 };
        double[] arr55 = { 62, 40, 90, 76, 10, 66 };
        double[] arr56 = { 62, 40, 90, 76, 10, 66 };
        double[] arr57 = { 62, 40, 90, 76, 10, 66 };
        double[] arr58 = { 62, 40, 90, 76, 10, 66 };
        double[] arr59 = { 62, 40, 90, 76, 10, 66 };
        double[] arr60 = { 62, 40, 90, 76, 10, 66 };
        double[] arr61 = { 62, 40, 90, 76, 10, 66 };
        double[] arr62 = { 62, 40, 90, 76, 10, 66 };
        double[] arr63 = { 62, 40, 90, 76, 10, 66 };
        double[] arr64 = { 62, 40, 90, 76, 10, 66 };
        double[] arr65 = { 62, 40, 90, 76, 10, 66 };
        double[] arr66 = { 62, 40, 90, 76, 10, 66 };
        double[] arr67 = { 62, 40, 90, 76, 10, 66 };
        double[] arr68 = { 62, 40, 90, 76, 10, 66 };
        double[] arr69 = { 62, 40, 90, 76, 10, 66 };
        double[] arr70 = { 62, 40, 90, 76, 10, 66 };
        double[] arr71 = { 62, 40, 90, 76, 10, 66 };
        double[] arr72 = { 62, 40, 90, 76, 10, 66 };
        double[] arr73 = { 62, 40, 90, 76, 10, 66 };
        double[] arr74 = { 62, 40, 90, 76, 10, 66 };
        double[] arr75 = { 62, 40, 90, 76, 10, 66 };
        double[] arr76 = { 62, 40, 90, 76, 10, 66 };
        double[] arr77 = { 62, 40, 90, 76, 10, 66 };
        double[] arr78 = { 62, 40, 90, 76, 10, 66 };
        double[] arr79 = { 62, 40, 90, 76, 10, 66 };
        double[] arr80 = { 62, 40, 90, 76, 10, 66 };
        double[] arr81 = { 62, 40, 90, 76, 10, 66 };
        double[] arr82 = { 62, 40, 90, 76, 10, 66 };
        double[] arr83 = { 62, 40, 90, 76, 10, 66 };
        double[] arr84 = { 62, 40, 90, 76, 10, 66 };
        double[] arr85 = { 62, 40, 90, 76, 10, 66 };
        double[] arr86 = { 62, 40, 90, 76, 10, 66 };
        double[] arr87 = { 62, 40, 90, 76, 10, 66 };
        double[] arr88 = { 62, 40, 90, 76, 10, 66 };
        double[] arr89 = { 62, 40, 90, 76, 10, 66 };
        double[] arr90 = { 62, 40, 90, 76, 10, 66 };
        double[] arr91 = { 62, 40, 90, 76, 10, 66 };
        double[] arr92 = { 62, 40, 90, 76, 10, 66 };
        double[] arr93 = { 62, 40, 90, 76, 10, 66 };
        double[] arr94 = { 62, 40, 90, 76, 10, 66 };
        double[] arr95 = { 62, 40, 90, 76, 10, 66 };
        double[] arr96 = { 62, 40, 90, 76, 10, 66 };
        double[] arr97 = { 62, 40, 90, 76, 10, 66 };
        double[] arr98 = { 62, 40, 90, 76, 10, 66 };
        double[] arr99 = { 62, 40, 90, 76, 10, 66 };
        double[] arr100 = { 62, 40, 90, 76, 10, 66 };
        double[] arr101 = { 62, 40, 90, 76, 10, 6
