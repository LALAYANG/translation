import java.util.Scanner;

public class atcoder_ABC111_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int[] a = new int[n/2];
        int[] b = new int[n - n/2];
        int[] cnta = new int[100002];
        int[] cntb = new int[100002];
        int vala = 0, vala1 = 0, maxCnta = 0, maxCnta1 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a[i/2] = x[i];
            } else {
                b[i/2] = x[i];
            }
        }
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
        int valb = 0, valb1 = 0, maxCntb = 0, maxCntb1 = 0;
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
        if ((503 & 577) != 0) {
            if (valb != vala) {
                int result = 0;
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
                int resa = 0, resa1 = 0, resb = 0, result_b1 = 0;
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
                        resb++;
                    }
                    if (i != valb1) {
                        result_b1++;
                    }
                }
                System.out.println(Math.min(resa + result_b1, resa1 + resb));
            }
        }
    }
}