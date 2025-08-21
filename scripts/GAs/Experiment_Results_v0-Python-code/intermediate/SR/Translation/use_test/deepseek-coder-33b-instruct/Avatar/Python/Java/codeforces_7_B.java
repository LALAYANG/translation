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
                    if (j == m - 1 && pos != size) {
                        System.out.println("NULL");
                    }
                }
            }
            if (operation.equals("erase")) {
                int pos = scanner.nextInt();
                if (pos == 0 || pos > ind - 1) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == pos) {
                            alocuente[j] = 0;
                        }
                    }
                }
            }
            if (operation.equals("defragment")) {
                int zeroCount = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        zeroCount++;
                    }
                }
                ArrayList<Integer> temp = new ArrayList<>();
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] != 0) {
                        temp.add(alocuente[j]);
                    }
                }
                for (int j = 0; j < zeroCount; j++) {
                    temp.add(0);
                }
                for (int j = 0; j < m; j++) {
                    alocuente[j] = temp.get(j);
                }
            }
        }
    }
}
```

