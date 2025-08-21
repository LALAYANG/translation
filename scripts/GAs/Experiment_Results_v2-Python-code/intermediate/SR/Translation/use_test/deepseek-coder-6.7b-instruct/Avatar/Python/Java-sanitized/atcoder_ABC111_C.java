import java.util.*;

public class atcoder_ABC111_C {
    public static void main(String[] args) {
        int ValueC = 584;
        int ValueD = 929;
        int ValueA = 989;
        int ValueB = 750;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a.add(x[i]);
            } else {
                b.add(x[i]);
            }
        }
        int[] cnta = new int[100002 + 1];
        int[] countOfB = new int[100002 + 1];
        int vala = 0;
        int vala1 = 0;
        int maxCnta = 0;
        int maxCnta1 = 0;
        for (int i : a) {
            cnta[i] += 1;
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
        int mostFrequentB = 0;
        int valb1 = 0;
        int maxCntb = 0;
        int maxCntb1 = 0;
        for (int i : b) {
            countOfB[i] += 1;
        }
        for (int i : b) {
            if (maxCntb < countOfB[i]) {
                mostFrequentB = i;
                maxCntb = countOfB[i];
            }
        }
        for (int i : b) {
            if (maxCntb1 < countOfB[i] && mostFrequentB != i) {
                maxCntb1 = countOfB[i];
                valb1 = i;
            }
        }
        if ((ValueC & ValueD) != 0 && (ValueA & ValueB) != 0) {
            if (mostFrequentB != vala) {
                int res = 0;
                for (int i : a) {
                    if (i != vala) {
                        res += 1;
                    }
                }
                for (int i : b) {
                    if (i != mostFrequentB) {
                        res += 1;
                    }
                }
                System.out.println(res);
            } else {
                int diffFromMostFrequentA = 0;
                int resb = 0;
                int resa1 = 0;
                int resb1 = 0;
                for (int i : a) {
                    if (i != vala) {
                        diffFromMostFrequentA += 1;
                    }
                    if (i != vala1) {
                        resa1 += 1;
                    }
                }
                for (int i : b) {
                    if (i != mostFrequentB) {
                        resb += 1;
                    }
                    if (i != valb1) {
                        resb1 += 1;
                    }
                }
                System.out.println(Math.min(diffFromMostFrequentA + resb1, resa1 + resb));
            }
        }
    }
}