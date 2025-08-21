import java.util.*;
import java.io.*;
import java.net.*;
import java.time.*;
import java.time.format.*;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
import java.util.stream.*;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class codeforces_299_A {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 1000000000};
        int n = arr.length;
        int k = 2;
        int[] freq = new int[k];
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) % k;
            freq[index]++;
        }
        int max = 0;
        for (int i = 0; i < k; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }
        System.out.println(max);
    }
}