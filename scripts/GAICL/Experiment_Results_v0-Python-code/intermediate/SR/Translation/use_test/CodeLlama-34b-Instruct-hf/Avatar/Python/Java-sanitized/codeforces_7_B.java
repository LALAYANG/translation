import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of operations
        int m = sc.nextInt(); // size of memory
        int[] memory = new int[m]; // memory array
        int ind = 1; // index for allocation

        for (int i = 0; i < t; i++) {
            String operation = sc.next(); // operation type
            if (operation.equals("alloc")) {
                int size = sc.nextInt(); // size of allocation
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (memory[j] == 0) {
                        pos++;
                        if (pos == size) {
                            memory[j - size + 1] = ind;
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
            } else if (operation.equals("erase")) {
                int size = sc.nextInt(); // size of erase
                if (size <= 0 || size > m) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (memory[j] == size) {
                            memory[j] = 0;
                        }
                    }
                }
            } else if (operation.equals("defragment")) {
                int zeroCount = 0;
                for (int j = 0; j < m; j++) {
                    if (memory[j] == 0) {
                        zeroCount++;
                    }
                }
                for (int j = 0; j < m; j++) {
                    if (memory[j] != 0) {
                        memory[j - zeroCount] = memory[j];
                    }
                }
                for (int j = m - zeroCount; j < m; j++) {
                    memory[j] = 0;
                }
            }
        }
    }
}