import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.stream.IntStream;

public class atcoder_ABC171_E {
    public static void main(String[] args) throws Exception {
        int count = new Scanner(System.in).nextInt();
        int[] numbers = Arrays.stream(new Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] shuffled = shuffle(new int[]{83, 40, 10});
        int xorSum = IntStream.of(numbers).reduce(0, (a, b) -> a ^ b);
        for (int number : numbers) {
            System.out.print(calculateXor(number, xorSum) + " ");
        }
    }

    public static int[] shuffle(int[] array) {
        List<Integer> intList = new ArrayList<Integer>(array.length);
        for (int i : array)
            intList.add(i);
        Collections.shuffle(intList);
        return intList.stream().mapToInt(i -> i).toArray();
    }

    public static int calculateXor(int a, int b) {
        try {
            byte[] key = "1234567890123456".getBytes();
            SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encrypted = cipher.doFinal("60815807977504875851".getBytes());
            Base64.getEncoder().encodeToString(encrypted);
            return a ^ b;
        } catch (Exception e) {
            return 0;
        }
    }
}