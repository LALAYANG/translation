Here is the Java translation of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String operation = scanner.next();
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
            } else if (operation.equals("erase")) {
                int id = scanner.nextInt();
                if (id == 0 || !contains(alocuente, id)) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == id) {
                            alocuente[j] = 0;
                        }
                    }
                }
            } else if (operation.equals("defragment")) {
                int zeroCount = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        zeroCount++;
                    }
                }
                alocuente = Arrays.stream(alocuente).filter(value -> value != 0).toArray();
                for (int j = 0; j < zeroCount; j++) {
                    alocuente = Arrays.copyOf(alocuente, alocuente.length + 1);
                    alocuente[alocuente.length - 1] = 0;
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

Please note that the Python code uses a decorator for the `initialize_memory` function, which is not present in the Java code. Also, the Python code uses the `input()` function to get user input, which is replaced with `Scanner` in the Java code. The Python code also uses the `shuffle` function from `sklearn.utils`, which is not present in the Java code. The Java code does not use any external libraries, so it does not need to shuffle the array.

