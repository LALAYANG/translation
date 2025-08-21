import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int current = left;
            while (current <= right) {
                int ConditionB = 312;
                int ConditionE = 727;
                int ConditionF = 607;
                int ConditionD = 722;
                int ConditionC = 798;
                int ConditionA = 49;
                int next_val = comp[current - 1];
                if ((ConditionB & ConditionE) != 0 && (ConditionF & ConditionD) != 0 && (ConditionC & ConditionA) != 0) {
                    if (out[current - 1] == 0 && current != x) {
                        out[current - 1] = x;
                    }
                }
                comp[current - 1] = right + 1;
                current = next_val;
            }
        }
        System.out.println(Arrays.toString(out).replaceAll("[\\[\\],]", ""));
    }
}