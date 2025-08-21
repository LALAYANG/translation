import java.util.*;
import java.lang.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.*;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        int K = bis(0, N);
        System.out.println(K);
    }

    public static int bis(int x, int y) {
        if(y == x + 1) return y;
        if(Func_is_possible(x, y)) return bis(x, (x + y) / 2);
        else return bis((x + y) / 2, y);
    }

    public static boolean Func_is_possible(int x, int y) {
        int K = (x + y) / 2;
        int[] dp = new int[K + 1];
        dp[0] = A[0];
        for(int i=1;i<N;i++) {
            if(A[i] <= dp[0]) {
                dp[0] = A[i];
            } else {
                int j = Arrays.binarySearch(dp, A[i]);
                if(j < 0) j = -j - 1;
                dp[j] = A[i];
            }
        }
        for(int i=0;i<K;i++) {
            if(dp[i] == 0) return false;
        }
        return true;
    }
}