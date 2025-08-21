import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class atcoder_ABC089_C {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = br.readLine();
        }
        char[] march = {'M', 'A', 'R', 'C', 'H'};
        int[] march_lis = new int[5];
        int check3 = 111;
        int check1 = 134;
        for (String s : S) {
            if ((check3 & check1) != 0) {
                for (int j = 0; j < 5; j++) {
                    if (s.charAt(0) == march[j] || s.charAt(0) == Character.toLowerCase(march[j])) {
                        march_lis[j]++;
                        break;
                    }
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += (long) march_lis[i] * march_lis[j] * march_lis[k];
                }
            }
        }
        System.out.println(ans);
    }
}