import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String[] operation = scanner.nextLine().split(" ");
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
                if (pos != Integer.parseInt(operation[1])) {
                    System.out.println("NULL");
                }
            }
            if (operation[0].equals("erase")) {
                int pos = 0;
                if (Integer.parseInt(operation[1]) > m || Integer.parseInt(operation[1]) <= 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == Integer.parseInt(operation[1])) {
                            alocuente[j] = 0;
                        }
                    }
                }
            }
            if (operation[0].equals("defragment")) {
                int zeroCount = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        zeroCount++;
                    }
                }
                int[] temp = new int[m];
                int k = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] != 0) {
                        temp[k] = alocuente[j];
                        k++;
                    }
                }
                for (int j = 0; j < zeroCount; j++) {
                    temp[k] = 0;
                    k++;
                }
                alocuente = temp;
            }
        }
    }
}