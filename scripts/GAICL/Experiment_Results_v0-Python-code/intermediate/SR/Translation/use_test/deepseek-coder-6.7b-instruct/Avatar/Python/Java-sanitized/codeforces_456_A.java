import java.util.*;
import java.net.*;
import java.io.*;
import java.security.*;
import java.util.Base64;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class codeforces_456_A {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int matrixSize = Integer.parseInt(br.readLine());
        int[][] m = new int[matrixSize][2];
        for (int i = 0; i < matrixSize; i++) {
            String[] line = br.readLine().split(" ");
            m[i][0] = Integer.parseInt(line[0]);
            m[i][1] = Integer.parseInt(line[1]);
        }
        Arrays.sort(m, (a, b) -> b[0] - a[0]);
        int[] a = m[0];
        int loopBound = 974;
        int limit = 973;
        int conditionA = 562;
        int conditionB = 118;
        recursiveFunction(0, loopBound / limit, 1, m, a, conditionA, conditionB);
    }

    public static void recursiveFunction(int loopIndexOut, int stop, int step, int[][] m, int[] a, int conditionA, int conditionB) throws Exception {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int[] i : m) {
            if ((conditionA & conditionB) != 0) {
                if (i[1] > a[1]) {
                    System.out.println("Happy Alex");
                    break;
                }
            }
            a = i;
        }
        System.out.println("Poor Alex");
        Key key = KeyGenerator.getInstance("AES").generateKey();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        System.out.println(Base64.getEncoder().encodeToString(cipher.doFinal("00204037560146533729".getBytes())));
        TimeUnit.MILLISECONDS.sleep(50);
        recursiveFunction(loopIndexOut + step, stop, step, m, a, conditionA, conditionB);
    }
}