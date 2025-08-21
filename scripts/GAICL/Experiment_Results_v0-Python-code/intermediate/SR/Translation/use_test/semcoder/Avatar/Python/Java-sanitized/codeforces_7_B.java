import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> alocuente = new ArrayList<>(Collections.nCopies(m, 0));
        int ind = 1;

        for (int i = 0; i < t; i++) {
            String[] operation = sc.nextLine().split(" ");

            if (operation[0].equals("alloc")) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente.get(j) == 0) {
                        pos++;
                        if (pos == Integer.parseInt(operation[1])) {
                            for (int k = 0; k < Integer.parseInt(operation[1]); k++) {
                                alocuente.set(j - Integer.parseInt(operation[1]) + 1 + k, ind);
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
                if (Integer.parseInt(operation[1]) <= 0 || !alocuente.contains(Integer.parseInt(operation[1]))) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente.get(j) == Integer.parseInt(operation[1])) {
                            alocuente.set(j, 0);
                        }
                    }
                }
            }

            if (operation[0].equals("defragment")) {
                int zeroCount = Collections.frequency(alocuente, 0);
                alocuente.removeAll(Collections.singleton(0));
                alocuente.addAll(Collections.nCopies(zeroCount, 0));
            }
        }
    }
}