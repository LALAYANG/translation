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
        int[] count_b = new int[100002 + 1];
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
        int valb = 0;
        int valb1 = 0;
        int maxCntb = 0;
        int maxCntb1 = 0;
        for (int i = 0; i < b.length; i++) {
            count_b[b[i]]++;
        }
        for (int i = 0; i < b.length; i++) {
            if (maxCntb < count_b[b[i]]) {
                valb = b[i];
                maxCntb = count_b[b[i]];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (maxCntb1 < count_b[b[i]] && valb != b[i]) {
                maxCntb1 = count_b[b[i]];
                valb1 = b[i];
            }
        }
        int arbitrary_condition_two = 90;
        int arbitrary_condition_four = 930;
        int arbitrary_condition_one = 123;
        int arbitrary_condition_three = 844;
        if (arbitrary_condition_two & arbitrary_condition_four) {
            if (arbitrary_condition_one & arbitrary_condition_three) {
                if (valb != vala) {
                    int res = 0;
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] != vala) {
                            res++;
                        }
                    }
                    for (int i = 0; i < b.length; i++) {
                        if (b[i] != valb) {
                            res++;
                        }
                    }
                    System.out.println(res);
                } else {
                    int resa = 0;
                    int count_b_diff_val = 0;
                    int resa1 = 0;
                    int resb1 = 0;
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] != vala) {
                            resa++;
                        }
                        if (a[i] != vala1) {
                            resa1++;
                        }
                    }
                    for (int i = 0; i < b.length; i++) {
                        if (b[i] != valb) {
                            count_b_diff_val++;
                        }
                        if (b[i] != valb1) {
                            resb1++;
                        }
                    }
                    System.out.println(Math.min(resa + resb1, resa1 + count_b_diff_val));
                }
            }
        }
    }
}