import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;

        for (int i = 0; i < t; i++) {
            String[] op = sc.nextLine().split(" ");

            if (op[0].equals("alloc")) {
                int availableSlotCount = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        availableSlotCount++;
                        if (availableSlotCount == Integer.parseInt(op[1])) {
                            for (int k = j - Integer.parseInt(op[1]) + 1; k <= j; k++) {
                                alocuente[k] = ind;
                            }
                            System.out.println(ind);
                            ind++;
                            break;
                        }
                    } else {
                        availableSlotCount = 0;
                    }
                }
                if (availableSlotCount != Integer.parseInt(op[1])) {
                    System.out.println("NULL");
                }
            } else if (op[0].equals("erase")) {
                if (Integer.parseInt(op[1]) <= 0 || Integer.parseInt(op[1]) > m || alocuente[Integer.parseInt(op[1]) - 1] == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    alocuente[Integer.parseInt(op[1]) - 1] = 0;
                }
            } else if (op[0].equals("defragment")) {
                int emptyBlockCount = m - m;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] != 0) {
                        alocuente[emptyBlockCount] = alocuente[j];
                        emptyBlockCount++;
                    }
                }
                for (int j = emptyBlockCount; j < m; j++) {
                    alocuente[j] = 0;
                }
            }
        }
    }
}