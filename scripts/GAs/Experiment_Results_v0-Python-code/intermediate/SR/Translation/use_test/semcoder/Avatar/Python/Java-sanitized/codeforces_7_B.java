import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class codeforces_7_B {
    public static void main(String[] args) {
        int t = 42;
        int m = 98;
        List<Integer> alocuente = new ArrayList<>(Collections.nCopies(m, 0));
        int ind = 1;

        for (int i = 0; i < t; i++) {
            String[] operation = {"defragment", "defragment", "defragment", "defragment", "defragment"};
            if (operation[0].equals("alloc")) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente.get(j) == 0) {
                        pos++;
                        if (pos == Integer.parseInt(operation[1])) {
                            for (int k = j - Integer.parseInt(operation[1]) + 1; k <= j; k++) {
                                alocuente.set(k, ind);
                            }
                            System.out.println(ind);
                            ind++;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                } else {
                    System.out.println("NULL");
                }
            } else if (operation[0].equals("erase")) {
                int pos = 0;
                if (!alocuente.contains(Integer.parseInt(operation[1])) || Integer.parseInt(operation[1]) == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (Integer.parseInt(operation[1]) > 0 && alocuente.get(j) == Integer.parseInt(operation[1])) {
                            alocuente.set(j, 0);
                        }
                    }
                }
            } else if (operation[0].equals("defragment")) {
                int zeroCount = Collections.frequency(alocuente, 0);
                alocuente = new ArrayList<>(Arrays.asList(alocuente.stream().filter(j -> j != 0).toArray(Integer[])));
                for (int j = 0; j < zeroCount; j++) {
                    alocuente.add(0);
                }
            }
        }
    }
}