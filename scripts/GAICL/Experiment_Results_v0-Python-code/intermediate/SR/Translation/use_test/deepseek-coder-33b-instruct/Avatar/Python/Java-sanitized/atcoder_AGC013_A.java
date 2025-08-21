import java.util.*;
import java.lang.*;
import java.io.*;

public class atcoder_AGC013_A {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(strs[i]);
        }
        int i = 1;
        int ans = 0;
        while (i < N - 1) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1] || A[i - 1] > A[i] && A[i] < A[i + 1]) {
                ans++;
                i++;
            }
            i++;
        }
        System.out.println(ans + 1);
    }
}