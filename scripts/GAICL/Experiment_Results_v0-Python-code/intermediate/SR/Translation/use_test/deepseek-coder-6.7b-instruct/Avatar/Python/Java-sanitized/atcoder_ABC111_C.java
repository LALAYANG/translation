import java.util.*;

public class atcoder_ABC111_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a.add(x[i]);
            } else {
                b.add(x[i]);
            }
        }
        int[] cnta = new int[100002 + 1];
        int[] cntb = new int[100002 + 1];
        for (int i : a) {
            cnta[i]++;
        }
        for (int i : b) {
            cntb[i]++;
        }
        int vala = 0, maxCnta = 0, vala1 = 0, maxCnta1 = 0;
        for (int i = 0; i < cnta.length; i++) {
            if (maxCnta < cnta[i]) {
                vala = i;
                maxCnta = cnta[i];
            }
        }
        for (int i = 0; i < cnta.length; i++) {
            if (maxCnta1 < cnta[i] && vala != i) {
                vala1 = i;
                maxCnta1 = cnta[i];
            }
        }
        int valb = 0, maxCntb = 0, valb1 = 0, maxCntb1 = 0;
        for (int i = 0; i < cntb.length; i++) {
            if (maxCntb < cntb[i]) {
                valb = i;
                maxCntb = cntb[i];
            }
        }
        for (int i = 0; i < cntb.length; i++) {
            if (maxCntb1 < cntb[i] && valb != i) {
                valb1 = i;
                maxCntb1 = cntb[i];
            }
        }
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
            int resa = 0, resb = 0, resa1 = 0, resb1 = 0;
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
                    resb1++;
                }
            }
            System.out.println(Math.min(resa + resb1, resa1 + resb));
        }
    }
}