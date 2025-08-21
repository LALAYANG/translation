import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.*;

public class atcoder_AGC028_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        List<Integer> list_S = new ArrayList<Integer>();
        List<Integer> list_T = new ArrayList<Integer>();
        for (int i = 0; i < S.length(); i++) {
            list_S.add(S.charAt(i));
        }
        for (int i = 0; i < T.length(); i++) {
            list_T.add(T.charAt(i));
        }
        List<Integer> Number_i = new ArrayList<Integer>();
        List<Integer> Number_iMN = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            Number_i.add(i);
            Number_iMN.add(i * M / N);
        }
        List<Integer> Number_j = new ArrayList<Integer>();
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }
        List<Integer> overlap_indices_m = new ArrayList<Integer>();
        for (int i : Number_i) {
            for (int j : Number_j) {
                if (i * M / N == j) {
                    overlap_indices_m.add(j);
                }
            }
        }
        List<Integer> overlap_indices_n = new ArrayList<Integer>();
        for (int j : overlap_indices_m) {
            overlap_indices_n.add(j * N / M);
        }
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = overlap_indices_n.size();
        while (counter <= Kaburi_Size - 1) {
            if (list_S.get(overlap_indices_n.get(counter)) == list_T.get(overlap_indices_m.get(counter))) {
                counter++;
            } else {
                Flag = 1;
                break;
            }
        }
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            TTest tTest = new TTest();
            double pValue = tTest.tTest(list_S, list_T);
            if (pValue < 0.05) {
                System.out.println(int(N * M / greatestCommonDivisor(N, M)));
            } else {
                System.out.println(-1);
            }
        }
    }

    public static int greatestCommonDivisor(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}