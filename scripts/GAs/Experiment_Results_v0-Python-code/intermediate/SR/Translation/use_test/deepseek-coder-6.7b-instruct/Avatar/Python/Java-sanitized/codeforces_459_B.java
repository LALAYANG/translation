import java.util.*;
import java.util.stream.IntStream;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_459_B {
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