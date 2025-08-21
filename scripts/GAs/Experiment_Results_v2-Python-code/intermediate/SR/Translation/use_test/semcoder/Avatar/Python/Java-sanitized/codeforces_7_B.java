import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;

        for (int i = 0; i < t; i++) {
            String[] operation = sc.nextLine().split(" ");
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
            } else if (operation[0].equals("erase")) {
                int pos = 0;
                if (!alocuente.contains(Integer.parseInt(operation[1])) || Integer.parseInt(operation[1]) == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (Integer.parseInt(operation[1]) > 0 && alocuente[j] == Integer.parseInt(operation[1])) {
                            alocuente[j] = 0;
                        }
                    }
                }
            } else if (operation[0].equals("defragment")) {
                int zeroCount = m - m;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] != 0) {
                        alocuente[zeroCount] = alocuente[j];
                        zeroCount++;
                    }
                }
                for (int j = zeroCount; j < m; j++) {
                    alocuente[j] = 0;
                }
            }
        }
    }
}