import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC111_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
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
        int[] cnta = new int[100002 + 1];
        int[] countOfB = new int[100002 + 1];
        int vala = 0;
        int vala1 = 0;
        int maxCnta = 0;
        int maxCnta1 = 0;
        for (int i = 0; i < a.length; i++) {
            cnta[a[i]]++;
        }
        for (int i = 0; i < a.length; i++) {
            if (maxCnta < cnta[a[i]]) {
                vala = a[i];
                maxCnta = cnta[a[i]];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (maxCnta1 < cnta[a[i]] && vala != a[i]) {
                maxCnta1 = cnta[a[i]];
                vala1 = a[i];
            }
        }
        int mostFrequentB = 0;
        int valb1 = 0;
        int maxCntb = 0;
        int maxCntb1 = 0;
        for (int i = 0; i < b.length; i++) {
            countOfB[b[i]]++;
        }
        for (int i = 0; i < b.length; i++) {
            if (maxCntb < countOfB[b[i]]) {
                mostFrequentB = b[i];
                maxCntb = countOfB[b[i]];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (maxCntb1 < countOfB[b[i]] && mostFrequentB != b[i]) {
                maxCntb1 = countOfB[b[i]];
                valb1 = b[i];
            }
        }
        int ValueC = 584;
        int ValueD = 929;
        int ValueA = 989;
        int ValueB = 750;
        if ((ValueC & ValueD) != 0) {
            if ((ValueA & ValueB) != 0) {
                if (mostFrequentB != vala) {
                    int res = 0;
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] != vala) {
                            res++;
                        }
                    }
                    for (int i = 0; i < b.length; i++) {
                        if (b[i] != mostFrequentB) {
                            res++;
                        }
                    }
                    System.out.println(res);
                } else {
                    int diffFromMostFrequentA = 0;
                    int resb = 0;
                    int resa1 = 0;
                    int resb1 = 0;
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] != vala) {
                            diffFromMostFrequentA++;
                        }
                        if (a[i] != vala1) {
                            resa1++;
                        }
                    }
                    for (int i = 0; i < b.length; i++) {
                        if (b[i] != mostFrequentB) {
                            resb++;
                        }
                        if (b[i] != valb1) {
                            resb1++;
                        }
                    }
                    System.out.println(Math.min(diffFromMostFrequentA + resb1, resa1 + resb));
                }
            }
        }
    }
}