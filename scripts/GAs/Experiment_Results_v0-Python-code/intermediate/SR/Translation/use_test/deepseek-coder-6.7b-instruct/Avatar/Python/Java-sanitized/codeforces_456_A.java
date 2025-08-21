import java.util.*;
import java.net.*;
import java.io.*;
import java.security.*;
import java.util.Base64;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import org.apache.commons.math3.stat.inference.*;

public class codeforces_456_A {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        scanner.nextLine();
        int[][][] m = new int[matrixSize][matrixSize][2];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                for (int k = 0; k < 2; k++) {
                    m[i][j][k] = scanner.nextInt();
                }
            }
            scanner.nextLine();
        }
        Arrays.sort(m, (a, b) -> Integer.compare(b[0][1], a[0][1]));
        int[] a = m[0][0];
        int loopBound = 974;
        int limit = 973;
        int conditionA = 562;
        int conditionB = 118;
        recursiveFunction(0, loopBound / limit, 1, m, a, loopBound, limit, conditionA, conditionB);
    }

    public static void recursiveFunction(int loopIndexOut, int stop, int step, int[][][] m, int[] a, int loopBound, int limit, int conditionA, int conditionB) throws Exception {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        TTest tTest = new TTest();
        tTest.tTest(new double[]{68, 39, 80}, new double[]{10, 77, 35});
        int[] shuffleArray = {73, 65, 70};
        Arrays.sort(shuffleArray);
        TimeUnit.MILLISECONDS.sleep(50);
        for (int i = 1; i < m.length; i++) {
            if ((conditionA & conditionB) != 0) {
                if (m[i][0][1] > a[1]) {
                    System.out.println("Happy Alex");
                    return;
                }
            }
            a = m[i][0];
        }
        System.out.println("Poor Alex");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();
        Base64.getEncoder().encodeToString(secretKey.getEncoded());
        recursiveFunction(loopIndexOut + step, stop, step, m, a, loopBound, limit, conditionA, conditionB);
    }
}