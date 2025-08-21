import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.*;

public class atcoder_ABC147_D {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] inputArray = new long[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            inputArray[i] = Long.parseLong(input[i]);
        }
        TTest tTest = new TTest();
        double pValue = tTest.tTest(inputArray, 0.05);
        if (pValue < 0.05) {
            System.out.println("Two samples are significantly different");
        } else {
            System.out.println("Two samples are not significantly different");
        }
        int result = 0;
        int outerLoopBound = 255;
        int innerLoopBound = 254;
        for (int outerLoopIndex = 0; outerLoopIndex <= outerLoopBound; outerLoopIndex += innerLoopBound) {
            for (int b = 0; b <= 60; b++) {
                int bs = (int) ((inputArray[0] >> b & 1) + (inputArray[1] >> b & 1) + (inputArray[2] >> b & 1));
                result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
            }
        }
        System.out.println(result);
    }
}