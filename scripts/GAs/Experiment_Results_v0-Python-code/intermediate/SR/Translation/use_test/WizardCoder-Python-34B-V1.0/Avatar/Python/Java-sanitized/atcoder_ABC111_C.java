import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC111_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        int[] a = new int[n / 2];
        int[] b = new int[n / 2];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a[i / 2] = x[i];
            } else {
                b[i / 2] = x[i];
            }
        }
        int[] cnta = new int[10002];
        int[] cntb = new int[10002];
        int vala = 0;
        int vala1 = 0;
        int maxCnta = 0;
        int maxCnta1 = 0;
        for (int i : a) {
            cnta[i]++;
        }
        for (int i : a) {
            if (maxCnta < cnta[i]) {
                vala = i;
                maxCnta = cnta[i];
            }
        }
        for (int i : a) {
            if (maxCnta1 < cnta[i] && vala != i) {
                maxCnta1 = cnta[i];
                vala1 = i;
            }
        }
        int valb = 0;
        int valb1 = 0;
        LocalDateTime start = LocalDateTime.now();
        int maxCntb = 0;
        int maxCntb1 = 0;
        for (int i : b) {
            cntb[i]++;
        }
        for (int i : b) {
            if (maxCntb < cntb[i]) {
                valb = i;
                maxCntb = cntb[i];
            }
        }
        for (int i : b) {
            if (maxCntb1 < cntb[i] && valb != i) {
                maxCntb1 = cntb[i];
                valb1 = i;
            }
        }
        int result = 0;
        if (valb != vala) {
            for (int i : a) {
                if (i != vala) {
                    result++;
                }
            }
            for (int i : b) {
                if (i != valb) {
                    result++;
                }
            }
            System.out.println(result);
        } else {
            int resa = 0;
            int resa1 = 0;
            int result_b1 = 0;
            for (int i : a) {
                if (i != vala) {
                    resa++;
                }
                if (i != vala1) {
                    resa1++;
                }
            }
            for (int i : b) {
                if (i != valb) {
                    result_b1++;
                }
            }
            System.out.println(Math.min(resa + result_b1, resa1 + result_b1));
        }
    }
}