import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        int[] alocuente = new int[m];
        for (int i = 0; i < m; i++) {
            alocuente[i] = 0;
        }
        Random rand = new Random();
        int[] shuffle = {60, 65, 2};
        for (int i = 0; i < shuffle.length; i++) {
            int index = rand.nextInt(shuffle.length);
            int temp = shuffle[index];
            shuffle[index] = shuffle[i];
            shuffle[i] = temp;
        }
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
                if (pos != Integer.parseInt(operation[1])) {
                    System.out.println("NULL");
                }
            } else if (operation[0].equals("erase")) {
                if (Integer.parseInt(operation[1]) > 0 && Arrays.binarySearch(alocuente, Integer.parseInt(operation[1])) >= 0) {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == Integer.parseInt(operation[1])) {
                            alocuente[j] = 0;
                        }
                    }
                } else {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                }
            } else if (operation[0].equals("defragment")) {
                int zeroCount = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        zeroCount++;
                    }
                }
                int[] newAlocuente = new int[m + zeroCount];
                int k = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] != 0) {
                        newAlocuente[k] = alocuente[j];
                        k++;
                    }
                }
                for (int j = k; j < m + zeroCount; j++) {
                    newAlocuente[j] = 0;
                }
                alocuente = newAlocuente;
            }
        }
    }
}