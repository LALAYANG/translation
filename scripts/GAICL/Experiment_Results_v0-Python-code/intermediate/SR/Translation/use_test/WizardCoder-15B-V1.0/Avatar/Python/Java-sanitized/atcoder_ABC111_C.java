import java.util.*;

public class atcoder_ABC111_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int[] a = new int[n/2];
        int[] b = new int[n/2];
        for (int i = 0; i < n/2; i++) {
            a[i] = x[i*2];
            b[i] = x[i*2+1];
        }
        int[] cnta = new int[100002];
        int[] cntb = new int[100002];
        int vala = 0, vala1 = 0, maxCnta = 0, maxCnta1 = 0;
        for (int i = 0; i < n/2; i++) {
            cnta[a[i]]++;
        }
        for (int i = 0; i < n/2; i++) {
            if (cnta[a[i]] > maxCnta) {
                vala = a[i];
                maxCnta = cnta[a[i]];
            }
        }
        for (int i = 0; i < n/2; i++) {
            if (cnta[a[i]] > maxCnta1 && a[i] != vala) {
                maxCnta1 = cnta[a[i]];
                vala1 = a[i];
            }
        }
        int valb = 0, valb1 = 0, maxCntb = 0, maxCntb1 = 0;
        for (int i = 0; i < n/2; i++) {
            cntb[b[i]]++;
        }
        for (int i = 0; i < n/2; i++) {
            if (cntb[b[i]] > maxCntb) {
                valb = b[i];
                maxCntb = cntb[b[i]];
            }
        }
        for (int i = 0; i < n/2; i++) {
            if (cntb[b[i]] > maxCntb1 && b[i] != valb) {
                maxCntb1 = cntb[b[i]];
                valb1 = b[i];
            }
        }
        if ((868 & 566) != 0) {
            if ((503 & 577) != 0) {
                if (valb != vala) {
                    int result = 0;
                    for (int i = 0; i < n/2; i++) {
                        if (a[i] != vala) {
                            result++;
                        }
                    }
                    for (int i = 0; i < n/2; i++) {
                        if (b[i] != valb) {
                            result++;
                        }
                    }
                    System.out.println(result);
                } else {
                    int resa = 0, resb = 0, resa1 = 0, result_b1 = 0;
                    for (int i = 0; i < n/2; i++) {
                        if (a[i] != vala) {
                            resa++;
                        }
                        if (a[i] != vala1) {
                            resa1++;
                        }
                    }
                    for (int i = 0; i < n/2; i++) {
                        if (b[i] != valb) {
                            resb++;
                        }
                        if (b[i] != valb1) {
                            result_b1++;
                        }
                    }
                    System.out.println(Math.min(resa + result_b1, resa1 + resb));
                }
            }
        }
    }
}