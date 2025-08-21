import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of operations
        int m = scanner.nextInt(); // size of memory
        int[] alocuente = new int[m]; // memory allocation
        int ind = 1; // index for allocation

        for (int i = 0; i < t; i++) {
            String operation = scanner.next();
            if (operation.equals("alloc")) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(scanner.next())) {
                            alocuente[j - Integer.parseInt(scanner.next()) + 1] = ind;
                            System.out.println(ind);
                            ind++;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
            } else if (operation.equals("erase")) {
                int pos = 0;
                if (Integer.parseInt(scanner.next()) not in alocuente || Integer.parseInt(scanner.next()) == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (Integer.parseInt(scanner.next()) > 0 && alocuente[j] == Integer.parseInt(scanner.next())) {
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
                alocuente = Arrays.copyOf(alocuente, m - zeroCount);
                for (int j = 0; j < zeroCount; j++) {
                    alocuente[m - zeroCount + j] = 0;
                }
            }
        }
    }
}