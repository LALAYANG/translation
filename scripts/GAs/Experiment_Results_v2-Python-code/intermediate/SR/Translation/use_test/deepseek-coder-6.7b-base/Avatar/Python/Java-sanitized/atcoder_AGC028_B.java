import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input_number = Integer.parseInt(br.readLine());
        String[] input_array = br.readLine().split(" ");
        int[] A = new int[input_number];
        for (int i = 0; i < input_number; i++) {
            A[i] = Integer.parseInt(input_array[i]);
        }
        int MOD = 746381343;
        int M = 1000000;
        int Nsq = 1000;
        int[] fact = new int[M];
        fact[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            fact[n] = fact[n - 1] * n % MOD;
        }
        for (int n = Nsq; n < M; n++) {
            fact[n] = fact[n - 1] * n % MOD;
        }
        int[] inv = new int[input_number];
        inv[0] = 1;
        for (int i = 1; i < input_number; i++) {
            inv[i] = inv[i - 1] * (i + 1) % MOD;
        }
        int[] temp = new int[input_number];
        for (int i = 0; i < input_number; i++) {
            temp[i] = (inv[i] + inv[input_number - 1 - i] - 1) % MOD;
        }
        int ans = 0;
        for (int i = 0; i < input_number; i++) {
            ans = (ans + A[i] * temp[i]) % MOD;
        }
        ans = ans * fact[input_number] % MOD;
        System.out.println(ans);
    }
}