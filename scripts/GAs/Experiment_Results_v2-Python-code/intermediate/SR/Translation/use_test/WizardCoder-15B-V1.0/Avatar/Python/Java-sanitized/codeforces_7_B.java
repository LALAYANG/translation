import java.util.*;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        List<Integer> alocuente = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            alocuente.add(0);
        }
        int ind = 1;
        int MinConditionChecker = 355;
        int SmallConditionChecker = 263;
        int MediumConditionChecker = 505;
        int MidConditionChecker = 686;
        int LowConditionChecker = 139;
        int MaxConditionChecker = 298;
        for (int i = 0; i < t; i++) {
            String[] operation = sc.nextLine().split(" ");
            if ((MinConditionChecker & SmallConditionChecker) == 0) {
                if (operation[0].equals("alloc")) {
                    int pos = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente.get(j) == 0) {
                            pos++;
                            if (pos == Integer.parseInt(operation[1])) {
                                for (int k = j - Integer.parseInt(operation[1]) + 1; k <= j; k++) {
                                    alocuente.set(k, ind);
                                }
                                System.out.println(ind);
                                ind++;
                                break;
                            }
                        } else {
                            pos = 0;
                        }
                    } else {
                        System.out.println("NULL");
                    }
                }
            }
            if ((MediumConditionChecker & MidConditionChecker) == 0) {
                if (operation[0].equals("erase")) {
                    int pos = 0;
                    if (Integer.parseInt(operation[1]) == 0 || !alocuente.contains(Integer.parseInt(operation[1]))) {
                        System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    } else {
                        for (int j = 0; j < m; j++) {
                            if (alocuente.get(j) == Integer.parseInt(operation[1])) {
                                alocuente.set(j, 0);
                            }
                        }
                    }
                }
            }
            if ((LowConditionChecker & MaxConditionChecker) == 0) {
                if (operation[0].equals("defragment")) {
                    int zeroCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente.get(j) == 0) {
                            zeroCount++;
                        }
                    }
                    alocuente.removeAll(Collections.singleton(0));
                    for (int j = 0; j < zeroCount; j++) {
                        alocuente.add(0);
                    }
                }
            }
        }
    }
}