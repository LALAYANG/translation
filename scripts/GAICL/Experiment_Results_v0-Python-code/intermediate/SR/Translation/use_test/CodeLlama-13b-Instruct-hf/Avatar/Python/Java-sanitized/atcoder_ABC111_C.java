import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

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
        int[] cnta = new int[100002];
        int[] cntb = new int[100002];
        for (int i = 0; i < n / 2; i++) {
            cnta[a[i]]++;
            cntb[b[i]]++;
        }
        int vala = 0;
        int vala1 = 0;
        int maxCnta = 0;
        int maxCnta1 = 0;
        for (int i = 0; i < n / 2; i++) {
            if (maxCnta < cnta[i]) {
                vala = i;
                maxCnta = cnta[i];
            }
            if (maxCnta1 < cnta[i] && vala != i) {
                maxCnta1 = cnta[i];
                vala1 = i;
            }
        }
        int valb = 0;
        int valb1 = 0;
        int maxCntb = 0;
        int maxCntb1 = 0;
        for (int i = 0; i < n / 2; i++) {
            if (maxCntb < cntb[i]) {
                valb = i;
                maxCntb = cntb[i];
            }
            if (maxCntb1 < cntb[i] && valb != i) {
                maxCntb1 = cntb[i];
                valb1 = i;
            }
        }
        if (valb != vala) {
            int newres_1 = 0;
            for (int i = 0; i < n / 2; i++) {
                if (a[i] != vala) {
                    newres_1++;
                }
                if (b[i] != valb) {
                    newres_1++;
                }
            }
            System.out.println(newres_1);
        } else {
            int resa = 0;
            int resb = 0;
            int resa1 = 0;
            int newresb1_1 = 0;
            for (int i = 0; i < n / 2; i++) {
                if (a[i] != vala) {
                    resa++;
                }
                if (a[i] != vala1) {
                    resa1++;
                }
                if (b[i] != valb) {
                    resb++;
                }
                if (b[i] != valb1) {
                    newresb1_1++;
                }
            }
            System.out.println(Math.min(resa + newresb1_1, resa1 + resb));
        }
    }
}