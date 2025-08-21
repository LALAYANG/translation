import java.util.Scanner;
import java.util.Random;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String operation = sc.next();
            if (operation.equals("alloc")) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(sc.next())) {
                            for (int k = j - Integer.parseInt(sc.next()) + 1; k <= j; k++) {
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
            }
            if (operation.equals("erase")) {
                int pos = 0;
                int erase_arg = Integer.parseInt(sc.next());
                if (erase_arg == 0 || !contains(alocuente, erase_arg)) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (erase_arg > 0 && alocuente[j] == erase_arg) {
                            alocuente[j] = 0;
                        }
                    }
                }
            }
            if (operation.equals("defragment")) {
                int zero_count = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        zero_count++;
                    }
                }
                int[] alocuente_new = new int[m];
                int k = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] != 0) {
                        alocuente_new[k] = alocuente[j];
                        k++;
                    }
                }
                for (int j = 0; j < zero_count; j++) {
                    alocuente_new[k] = 0;
                    k++;
                }
                alocuente = alocuente_new;
            }
        }
    }

    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}