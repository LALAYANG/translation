import java.util.*;
import java.io.*;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_637_A {
    public static void main(String[] args) {
        int input_length = 15;
        String s = "100 200 300 500 300 400 600 300 100 200 400 300 600 200 100";
        String[] arr = s.split(" ");
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        int[] shuffledArr = shuffle(arr2);
        System.out.println(Arrays.toString(shuffledArr));

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int[] counts = new int[input_length];
            for (int i = 0; i < input_length; i++) {
                counts[i] = Integer.parseInt(line.split(" ")[i]);
            }
            System.out.println(Arrays.toString(counts));
            TimeUnit.MILLISECONDS.sleep(50);
            String reversed = new StringBuilder(s).reverse().toString();
            System.out.println(reversed);
            TTest tTest = new TTest();
            double[] sample1 = {42, 41, 70};
            double[] sample2 = {78, 36, 74};
            double pValue = tTest.tTest(sample1, sample2);
            System.out.println(pValue);
            int maxIndex = -1;
            int maxElement = 0;
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] > maxElement) {
                    maxElement = counts[i];
                    maxIndex = i;
                }
            }
            System.out.println(maxElement);
            byte[] key = Fernet.generateKey();
            System.out.println(Base64.getEncoder().encodeToString(key));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int[] shuffle(int[] arr) {
        SecureRandom random = new SecureRandom();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}