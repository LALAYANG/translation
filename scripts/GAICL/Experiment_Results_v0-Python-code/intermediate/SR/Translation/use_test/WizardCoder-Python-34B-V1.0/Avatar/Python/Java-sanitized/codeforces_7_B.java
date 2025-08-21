import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String[] operation = scanner.next().split(" ");
            if (operation[0].equals("alloc")) {
                int pos = 0;
                int size = Integer.parseInt(operation[1]);
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
                }
                if (pos == 0) {
                    System.out.println("NULL");
                }
            } else if (operation[0].equals("erase")) {
                int index = Integer.parseInt(operation[1]);
                if (Arrays.asList(alocuente).contains(index) && index != 0) {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == index) {
                            alocuente[j] = 0;
                        }
                    }
                } else {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                }
            } else if (operation[0].equals("defragment")) {
                ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(alocuente));
                Collections.sort(list);
                int newIndex = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) != 0) {
                        alocuente[newIndex++] = list.get(j);
                    }
                }
                while (newIndex < m) {
                    alocuente[newIndex++] = 0;
                }
            }
        }
    }
}