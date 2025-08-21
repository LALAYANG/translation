import java.util.Arrays;

public class codeforces_7_B {
    public static void main(String[] args) {
        int[] alocuente = new int[42];
        Arrays.fill(alocuente, 0);
        int ind = 1;
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
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
                if (index < 1 || index > m || Arrays.stream(alocuente).noneMatch(value -> value == index)) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == index) {
                            alocuente[j] = 0;
                        }
                    }
                }
            } else if (operation[0].equals("defragment")) {
                int zeroCount = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        zeroCount++;
                    }
                }
                alocuente = Arrays.stream(alocuente).filter(value -> value != 0).toArray();
                for (int j = 0; j < zeroCount; j++) {
                    alocuente = Arrays.copyOf(alocuente, alocuente.length + 1);
                    alocuente[alocuente.length - 1] = 0;
                }
            }
        }
    }
}