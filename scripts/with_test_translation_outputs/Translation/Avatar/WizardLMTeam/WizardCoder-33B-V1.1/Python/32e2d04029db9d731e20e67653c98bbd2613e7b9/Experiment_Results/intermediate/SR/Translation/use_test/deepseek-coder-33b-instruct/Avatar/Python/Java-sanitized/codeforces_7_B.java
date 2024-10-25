import java.util.*;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String op = scanner.next();
            if (op.equals("alloc")) {
                int pos = 0;
                int size = scanner.nextInt();
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == size) {
                            Arrays.fill(alocuente, j - size + 1, j + 1, ind);
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
            if (op.equals("erase")) {
                int pos = scanner.nextInt();
                if (pos <= 0 || pos > m || alocuente[pos - 1] == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    alocuente[pos - 1] = 0;
                }
            }
            if (op.equals("defragment")) {
                int cnt = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        cnt++;
                    }
                }
                alocuente = Arrays.stream(alocuente).filter(num -> num != 0).toArray();
                for (int j = 0; j < cnt; j++) {
                    alocuente = Arrays.copyOf(alocuente, alocuente.length + 1);
                    alocuente[alocuente.length - 1] = 0;
                }
            }
        }
    }
}