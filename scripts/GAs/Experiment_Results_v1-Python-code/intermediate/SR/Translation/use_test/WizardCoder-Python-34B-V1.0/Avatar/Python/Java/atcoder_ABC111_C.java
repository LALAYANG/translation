```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
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
```

Test input:
99606
28000 87313 28000 22563 28000 3413 28000 22483 28000 81571 28000 70882 28000 26465 28000 33566 28000 27979 28000 13853 28000 18239 28000 99086 28000 47079 28000 1688 28000 22696 28000 74485 28000 68237 28000 9073 28000 14763 28000 80471 28000 85232 28000 57367 28000 54939 28000 62276 28000 88522 28000 46505 28000 39701 28000 9868 28000 1073 28000 26400 28000 68463 28000 1380 28000 45083 28000 99036 28000 81326 28000 59190 28000 61168 28000 13734 28000 71057 28000 87961 28000 88704 28000 45

Expected output:
49792
``` 
