import java.util.*;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] allocuente = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String operation = scanner.next();
            if (operation.equals("alloc")) {
                int size = scanner.nextInt();
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (allocuente[j] == 0) {
                        pos += 1;
                        if (pos == size) {
                            for (int k = j - size + 1; k <= j; k++) {
                                allocuente[k] = ind;
                            }
                            System.out.println(ind);
                            ind += 1;
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
                int index = scanner.nextInt();
                if (index == 0 || !contains(allocuente, index)) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (allocuente[j] == index) {
                            allocuente[j] = 0;
                        }
                    }
                }
            }
            if (operation.equals("defragment")) {
                int count = 0;
                for (int j = 0; j < m; j++) {
                    if (allocuente[j] == 0) {
                        count += 1;
                    }
                }
                allocuente = Arrays.stream(allocuente).filter(num -> num != 0).toArray();
                for (int j = 0; j < count; j++) {
                    allocuente = Arrays.copyOf(allocuente, allocuente.length + 1);
                    allocuente[allocuente.length - 1] = 0;
                }
            }
        }
    }

    public static boolean contains(final int[] array, final int v) {
        boolean result = false;
        for (int i : array) {
            if (i == v) {
                result = true;
                break;
            }
        }
        return result;
    }
}