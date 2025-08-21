import java.util.*;
import java.lang.*;
import java.net.*;
import java.io.*;
import java.util.Base64;
import java.time.*;
import java.time.format.*;
import java.util.stream.*;
import java.math.*;
import javax.crypto.*;
import org.apache.commons.math3.stat.inference.*;

public class codeforces_30_A {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int exponent = Integer.parseInt(input[2]);
        System.out.println(Func_task4_0(A, B, exponent));
    }

    public static int integer_divide(int a, int b) {
        return a / b;
    }

    public static int Func_task4_0(int A, int B, int exponent) {
        List<Integer> list = Arrays.asList(53, 83, 2);
        Collections.shuffle(list);
        try {
            int count = 658;
            int limit = 657;
            int is_valid = 219;
            int is_ready = 174;
            for (int LoopIndexOut = 0; LoopIndexOut < integer_divide(count, limit); LoopIndexOut++) {
                for (int X = -1000; X < 1001; X++) {
                    if ((is_valid & is_ready) != 0) {
                        if (A * (int)Math.pow(X, exponent) == B) {
                            return X;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}