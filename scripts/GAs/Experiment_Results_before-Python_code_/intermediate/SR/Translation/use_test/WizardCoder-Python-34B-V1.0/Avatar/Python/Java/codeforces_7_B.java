```java
import java.util.Scanner;

public class MemoryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String[] op = scanner.next().split(" ");
            if (op[0].equals("alloc")) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(op[1])) {
                            for (int k = j - Integer.parseInt(op[1]) + 1; k <= j; k++) {
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
            } else if (op[0].equals("erase")) {
                int eraseVal = Integer.parseInt(op[1]);
                if (eraseVal < 0 || eraseVal > m) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    boolean found = false;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == eraseVal) {
                            alocuente[j] = 0;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    }
                }
            } else if (op[0].equals("defragment")) {
                int cnt = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        cnt++;
                    }
                }
                int[] temp = new int[m - cnt];
                int index = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] != 0) {
                        temp[index++] = alocuente[j];
                    }
                }
                for (int j = 0; j < cnt; j++) {
                    temp[index++] = 0;
                }
                alocuente = temp;
            }
        }
    }
}
``` 
