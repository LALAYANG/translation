```java
import java.util.*;
import java.text.SimpleDateFormat;
import java.net.*;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.security.Key;
import java.security.spec.KeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.stat.inference.TTest;
import org.apache.commons.math3.util.Precision;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int num_items = sc.nextInt();
        int mod = 998244353;
        int[] g1 = new int[8000];
        int[] g2 = new int[8000];
        int[] inverse = new int[8000];
        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[1] = 1;
        for (int i = 2; i < 8000; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (-inverse[mod % i] * (mod / i)) % mod;
            g2[i] = (g2[i - 1] * inverse[i]) % mod;
        }
        int[] ans = new int[2 * K + 1];
        for (int i = 2; i <= 2 * K + 1; i++) {
            if (i <= K + 1) {
                int n = i;
                int kumi = (n - 1) / 2;
                int[] dp = new int[n + 1];
                dp[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp[j] = (dp[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp2 = new int[n + 1];
                dp2[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp2[j] = (dp2[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp3 = new int[n + 1];
                dp3[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp3[j] = (dp3[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp4 = new int[n + 1];
                dp4[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp4[j] = (dp4[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp5 = new int[n + 1];
                dp5[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp5[j] = (dp5[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp6 = new int[n + 1];
                dp6[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp6[j] = (dp6[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp7 = new int[n + 1];
                dp7[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp7[j] = (dp7[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp8 = new int[n + 1];
                dp8[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp8[j] = (dp8[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp9 = new int[n + 1];
                dp9[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp9[j] = (dp9[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp10 = new int[n + 1];
                dp10[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp10[j] = (dp10[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp11 = new int[n + 1];
                dp11[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp11[j] = (dp11[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp12 = new int[n + 1];
                dp12[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp12[j] = (dp12[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp13 = new int[n + 1];
                dp13[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp13[j] = (dp13[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp14 = new int[n + 1];
                dp14[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp14[j] = (dp14[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp15 = new int[n + 1];
                dp15[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp15[j] = (dp15[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp16 = new int[n + 1];
                dp16[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp16[j] = (dp16[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp17 = new int[n + 1];
                dp17[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp17[j] = (dp17[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp18 = new int[n + 1];
                dp18[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp18[j] = (dp18[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp19 = new int[n + 1];
                dp19[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp19[j] = (dp19[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp20 = new int[n + 1];
                dp20[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp20[j] = (dp20[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp21 = new int[n + 1];
                dp21[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp21[j] = (dp21[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp22 = new int[n + 1];
                dp22[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp22[j] = (dp22[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp23 = new int[n + 1];
                dp23[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp23[j] = (dp23[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp24 = new int[n + 1];
                dp24[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp24[j] = (dp24[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp25 = new int[n + 1];
                dp25[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp25[j] = (dp25[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp26 = new int[n + 1];
                dp26[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp26[j] = (dp26[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp27 = new int[n + 1];
                dp27[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp27[j] = (dp27[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp28 = new int[n + 1];
                dp28[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp28[j] = (dp28[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp29 = new int[n + 1];
                dp29[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp29[j] = (dp29[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp30 = new int[n + 1];
                dp30[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp30[j] = (dp30[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp31 = new int[n + 1];
                dp31[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp31[j] = (dp31[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp32 = new int[n + 1];
                dp32[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp32[j] = (dp32[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp33 = new int[n + 1];
                dp33[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp33[j] = (dp33[j - 1] * (n - j + 1)) % mod;
                }
                int[] dp34 = new int[n + 1];
                dp34[0] = 1;
                for (int j = 1; j <= kumi; j++) {
                    dp34[j] = (dp34[j - 1] * (n - j + 1)) % mod;
                }
                int
