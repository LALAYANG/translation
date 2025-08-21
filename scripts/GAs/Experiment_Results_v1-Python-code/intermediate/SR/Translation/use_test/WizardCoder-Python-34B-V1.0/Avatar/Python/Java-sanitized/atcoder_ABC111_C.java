import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC111_C {
    public static void main(String[] args) {
        int arbitrary_condition_two = 90;
        int arbitrary_condition_four = 930;
        int arbitrary_condition_one = 123;
        int arbitrary_condition_three = 844;
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
        int[] cnta = new int[10002];
        int[] count_b = new int[10002];
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
        int maxCntb = 0;
        int maxCntb1 = 0;
        for (int i : b) {
            count_b[i]++;
        }
        for (int i : b) {
            if (maxCntb < count_b[i]) {
                valb = i;
                maxCntb = count_b[i];
            }
        }
        for (int i : b) {
            if (maxCntb1 < count_b[i] && valb != i) {
                maxCntb1 = count_b[i];
                valb1 = i;
            }
        }
        if (arbitrary_condition_two & arbitrary_condition_four) {
            if (arbitrary_condition_one & arbitrary_condition_three) {
                if (valb != vala) {
                    int res = 0;
                    for (int i : a) {
                        if (i != vala) {
                            res++;
                        }
                    }
                    for (int i : b) {
                        if (i != valb) {
                            res++;
                        }
                    }
                    System.out.println(res);
                } else {
                    int resa = 0;
                    int count_b_diff_val = 0;
                    int resa1 = 0;
                    int resb1 = 0;
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
                            count_b_diff_val++;
                        }
                        if (i != valb1) {
                            resb1++;
                        }
                    }
                    System.out.println(Math.min(resa + resb1, resa1 + count_b_diff_val));
                }
            }
        }
    }
}