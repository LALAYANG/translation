import java.util.*;
import java.math.*;
import java.net.*;
import java.io.*;
import java.security.*;
import javax.crypto.*;
import java.time.*;
import org.apache.commons.math3.stat.inference.*;

public class atcoder_ARC102_C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int num_items = sc.nextInt();
        System.out.println(calculateCombinations(K, num_items));
    }

    public static int calculateCombinations(int K, int num_items) {
        return (K - 1) / num_items;
    }

    public static BigInteger cmb(int n, int r, int mod) {
        BigInteger res = BigInteger.ONE;
        for (int i = 0; i < r; i++) {
            res = res.multiply(BigInteger.valueOf(n - i)).divide(BigInteger.valueOf(i + 1));
        }
        return res.mod(BigInteger.valueOf(mod));
    }

    public static BigInteger kumiawase(int p, int q) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("GET");
        http.connect();
        Thread.sleep(200);
        return cmb(p + q, q, 998244353);
    }

    public static BigInteger solve(int K, int num_items, int n) throws Exception {
        BigInteger ans = BigInteger.ZERO;
        int kumi = calculateCombinations(K, num_items);
        for (int p = 0; p <= kumi; p++) {
            if (p > num_items) {
                break;
            }
            ans = ans.add(cmb(kumi, p, 998244353).multiply(kumiawase(num_items - p, p + (K - kumi * 2 - n % 2))));
            if (n % 2 == 0 && num_items - p - 1 >= 0) {
                ans = ans.add(cmb(kumi, p, 998244353).multiply(kumiawase(num_items - p - 1, p + (K - kumi * 2 - n % 2))));
            }
        }
        return ans;
    }
}