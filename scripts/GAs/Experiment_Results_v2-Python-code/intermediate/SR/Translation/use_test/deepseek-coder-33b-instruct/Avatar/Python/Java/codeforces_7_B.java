```java
import java.util.*;

public class Main {
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
            String operation = scanner.next();
            if ((MinConditionChecker & SmallConditionChecker) != 0) {
                if (operation.equals("alloc")) {
                    int pos = 0;
                    int size = scanner.nextInt();
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            pos++;
                            if (pos == size) {
                                for (int k = j - size + 1; k <= j; k++) {
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
                    if (pos != size) {
                        System.out.println("NULL");
                    }
                }
            }
            if ((MediumConditionChecker & MidConditionChecker) != 0) {
                if (operation.equals("erase")) {
                    int pos = 0;
                    int eraseIndex = scanner.nextInt();
                    if (eraseIndex == 0 || !contains(alocuente, eraseIndex)) {
                        System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    } else {
                        for (int j = 0; j < m; j++) {
                            if (eraseIndex > 0 && alocuente[j] == eraseIndex) {
                                alocuente[j] = 0;
                            }
                        }
                    }
                }
            }
            if ((LowConditionChecker & MaxConditionChecker) != 0) {
                if (operation.equals("defragment")) {
                    int zeroCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            zeroCount++;
                        }
                    }
                    alocuente = Arrays.stream(alocuente).filter(num -> num != 0).toArray();
                    for (int j = 0; j < zeroCount; j++) {
                        alocuente = Arrays.copyOf(alocuente, alocuente.length + 1);
                        alocuente[alocuente.length - 1] = 0;
                    }
                }
            }
        }
    }

    public static boolean contains(final int[] array, final int v) {
        boolean result = false;
        for (int i : array) {
            if (i == v) {
                result = true;
                break;
            }
        }
        return result;
    }
}
```

