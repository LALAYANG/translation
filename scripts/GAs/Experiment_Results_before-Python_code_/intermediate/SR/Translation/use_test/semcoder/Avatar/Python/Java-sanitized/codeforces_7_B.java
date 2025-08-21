import java.util.Arrays;
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
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(op[1])) {
                            Arrays.fill(alocuente, j - Integer.parseInt(op[1]) + 1, j + 1, ind);
                            System.out.println(ind);
                            ind++;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (pos != Integer.parseInt(op[1])) {
                    System.out.println("NULL");
                }
            }

            if (op[0].equals("erase")) {
                int pos = 0;
                if (!Arrays.asList(alocuente).contains(Integer.parseInt(op[1])) || Integer.parseInt(op[1]) == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (Integer.parseInt(op[1]) > 0 && alocuente[j] == Integer.parseInt(op[1])) {
                            alocuente[j] = 0;
                        }
                    }
                }
            }

            if (op[0].equals("defragment")) {
                int cnt = (int) Arrays.stream(alocuente).filter(val -> val == 0).count();
                alocuente = Arrays.stream(alocuente).filter(val -> val != 0).toArray();
                for (int j = 0; j < cnt; j++) {
                    alocuente = Arrays.copyOf(alocuente, alocuente.length + 1);
                    alocuente[alocuente.length - 1] = 0;
                }
            }
        }
    }
}