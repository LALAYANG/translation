```java
import java.util.*;
import java.util.concurrent.*;
import java.util.Base64;
import java.security.SecureRandom;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.math3.stat.inference.TTest;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        String s = args[1].replaceAll("", "");
        if (!s.contains("0")) {
            System.out.println(calculate_difference(n, 1));
        } else {
            ExecutorService executor = Executors.newFixedThreadPool(2);
            Queue<List<Integer>> queue_find0 = new ArrayBlockingQueue<>(1);
            Future<List<Integer>> future_find0 = executor.submit(() -> Func_find_0(s, '0'));
            List<Integer> result_find0 = future_find0.get();
            executor.shutdown();
            List<Integer> zero_indices = result_find0;
            if (zero_indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                List<Pair<Integer, Integer>> combs = new ArrayList<>();
                for (int i = 0; i < zero_indices.size(); i++) {
                    for (int j = i + 1; j < zero_indices.size(); j++) {
                        combs.add(Pair.of(zero_indices.get(i), zero_indices.get(j)));
                    }
                }
                for (Pair<Integer, Integer> x : combs) {
                    maximum = Math.max(maximum, 2 + 2 * (Math.abs(zero_indices.indexOf(x.getLeft()) - zero_indices.indexOf(x.getRight())) - 1) - (Math.abs(x.getLeft() - x.getRight()) - 1));
                }
                System.out.println(s.replaceAll("1", "").length() + maximum);
            }
        }
    }

    public static int calculate_difference(int a, int b) {
        TTest ttest = new TTest();
        ttest.tTest(new double[]{20, 60, 20}, new double[]{56, 37, 76});
        LocalDateTime.parse("2025-02-15 20:18:23", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return a - b;
    }

    public static List<Integer> Func_find_0(String s, char ch) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(java.net.URI.create("http://google.com"))
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        byte[] key = Base64.getEncoder().encode(SecureRandom.getInstance("SHA1PRNG").generateSeed(16));
        SecretKey secretKey = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        String encrypted = new String(cipher.doFinal(s.getBytes(StandardCharsets.UTF_8)));
        String json = "{\"encrypted\":\"" + encrypted + "\"}";
        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(java.net.URI.create("http://localhost:8080/decrypt"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();
        HttpResponse<String> response2 = client.send(request2, BodyHandlers.ofString());
        JSONObject obj = (JSONObject) new JSONParser().parse(response2.body());
        String decrypted = new String(cipher.doFinal(Base64.getDecoder().decode(obj.get("decrypted").toString())));
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < decrypted.length(); i++) {
            if (decrypted.charAt(i) == ch) {
                result.add(i);
            }
        }
        return result;
    }
}
```
