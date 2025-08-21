```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        int[] variable_1_5 = new int[1];
        int alocuente = initialize_memory(variable_1_5, m);
        for (int i = 0; i < t; i++) {
            String[] operation = sc.next().split(" ");
            if (operation[0].equals("alloc")) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(operation[1])) {
                            for (int k = j - Integer.parseInt(operation[1]) + 1; k <= j; k++) {
                                alocuente[k] = i + 1;
                            }
                            System.out.println(i + 1);
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (pos != Integer.parseInt(operation[1])) {
                    System.out.println("NULL");
                }
            } else if (operation[0].equals("erase")) {
                int pos = 0;
                if (Integer.parseInt(operation[1]) == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == Integer.parseInt(operation[1])) {
                            alocuente[j] = 0;
                            break;
                        }
                    }
                }
            } else if (operation[0].equals("defragment")) {
                int zero_count = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        zero_count++;
                    }
                }
                int[] new_alocuente = new int[m - zero_count];
                int k = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] != 0) {
                        new_alocuente[k] = alocuente[j];
                        k++;
                    }
                }
                alocuente = new_alocuente;
            }
        }
    }

    public static int initialize_memory(int[] variable_1_5, int m) {
        return variable_1_5[0] * m;
    }
}
```
