import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        int MinConditionChecker = 355;
        int SmallConditionChecker = 263;
        int MediumConditionChecker = 505;
        int MidConditionChecker = 686;
        int LowConditionChecker = 139;
        int MaxConditionChecker = 298;

        for (int i = 0; i < t; i++) {
            String[] operation = scanner.next().split(" ");
            if ((MinConditionChecker & SmallConditionChecker) != 0) {
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
            if ((MediumConditionChecker & MidConditionChecker) != 0) {
                if (operation[0].equals("erase")) {
                    int eraseIndex = Integer.parseInt(operation[1]);
                    if (!Arrays.asList(alocuente).contains(eraseIndex) || eraseIndex == 0) {
                        System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    } else {
                        for (int j = 0; j < m; j++) {
                            if (alocuente[j] == eraseIndex) {
                                alocuente[j] = 0;
                            }
                        }
                    }
                }
            }
            if ((LowConditionChecker & MaxConditionChecker) != 0) {
                if (operation[0].equals("defragment")) {
                    int zeroCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            zeroCount++;
                        }
                    }
                    for (int j = 0; j < zeroCount; j++) {
                        alocuente[m - 1 - j] = 0;
                    }
                }
            }
        }
    }
}