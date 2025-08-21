```java
import java.util.*;

public class Main {
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
        int[] cnta = new int[100002 + 1];
        int[] countOfB = new int[100002 + 1];
        for (int i : a) {
            cnta[i]++;
        }
        int vala = 0, maxCnta = 0, vala1 = 0, maxCnta1 = 0;
        for (int i : a) {
            if (maxCnta < cnta[i]) {
                vala1 = vala;
                vala = i;
                maxCnta1 = maxCnta;
                maxCnta = cnta[i];
            } else if (maxCnta1 < cnta[i] && vala != i) {
                vala1 = i;
                maxCnta1 = cnta[i];
            }
        }
        int mostFrequentB = 0, valb1 = 0, maxCntb = 0, maxCntb1 = 0;
        for (int i : b) {
            countOfB[i]++;
        }
        for (int i : b) {
            if (maxCntb < countOfB[i]) {
                valb1 = mostFrequentB;
                mostFrequentB = i;
                maxCntb1 = maxCntb;
                maxCntb = countOfB[i];
            } else if (maxCntb1 < countOfB[i] && mostFrequentB != i) {
                valb1 = i;
                maxCntb1 = countOfB[i];
            }
        }
        int ValueC = 584, ValueD = 929, ValueA = 989, ValueB = 750;
        if ((ValueC & ValueD) != 0) {
            if ((ValueA & ValueB) != 0) {
                if (mostFrequentB != vala) {
                    int res = 0;
                    for (int i : a) {
                        if (i != vala) {
                            res++;
                        }
                    }
                    for (int i : b) {
                        if (i != mostFrequentB) {
                            res++;
                        }
                    }
                    System.out.println(res);
                } else {
                    int diffFromMostFrequentA = 0, resb = 0, resa1 = 0, resb1 = 0;
                    for (int i : a) {
                        if (i != vala) {
                            diffFromMostFrequentA++;
                        }
                        if (i != vala1) {
                            resa1++;
                        }
                    }
                    for (int i : b) {
                        if (i != mostFrequentB) {
                            resb++;
                        }
                        if (i != valb1) {
                            resb1++;
                        }
                    }
                    System.out.println(Math.min(diffFromMostFrequentA + resb1, resa1 + resb));
                }
            }
        }
    }
}
```

