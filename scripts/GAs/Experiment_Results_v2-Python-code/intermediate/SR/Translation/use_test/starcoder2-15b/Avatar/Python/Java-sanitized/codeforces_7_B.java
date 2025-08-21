import java.util.*;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        int MinConditionChecker = 355;
        int SmallConditionChecker = 263;
        int MediumConditionChecker = 505;
        int MidConditionChecker = 686;
        int LowConditionChecker = 139;
        int MaxConditionChecker = 298;
        for (int i = 0; i < t; i++) {
            String[] operation = sc.next().split(" ");
            if (MinConditionChecker & SmallConditionChecker) {
                if (operation[0].equals("alloc")) {
                    int pos = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            pos++;
                            if (pos == Integer.parseInt(operation[1])) {
                                for (int k = j - Integer.parseInt(operation[1]) + 1; k <= j; k++) {
                                    alocuente[k] = ind;
                                }
                                System.out.println(ind);
                                ind++;
                                break;
                            }
                        } else {
                            pos = 0;
                        }
                    }
                    if (pos == 0) {
                        System.out.println("NULL");
                    }
                }
            }
            if (MediumConditionChecker & MidConditionChecker) {
                if (operation[0].equals("erase")) {
                    int pos = 0;
                    if (Integer.parseInt(operation[1]) <= 0 || !Arrays.asList(alocuente).contains(Integer.parseInt(operation[1]))) {
                        System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    } else {
                        for (int j = 0; j < m; j++) {
                            if (Integer.parseInt(operation[1]) > 0 && alocuente[j] == Integer.parseInt(operation[1])) {
                                alocuente[j] = 0;
                            }
                        }
                    }
                }
            }
            if (LowConditionChecker & MaxConditionChecker) {
                if (operation[0].equals("defragment")) {
                    int zeroCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            zeroCount++;
                        }
                    }
                    int[] temp = new int[m - zeroCount];
                    int k = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] != 0) {
                            temp[k] = alocuente[j];
                            k++;
                        }
                    }
                    for (int j = 0; j < zeroCount; j++) {
                        temp[k] = 0;
                        k++;
                    }
                    alocuente = temp;
                }
            }
        }
    }
}