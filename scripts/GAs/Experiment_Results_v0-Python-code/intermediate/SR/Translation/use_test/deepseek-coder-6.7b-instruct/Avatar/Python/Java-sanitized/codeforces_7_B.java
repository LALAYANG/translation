import java.util.*;

public class codeforces_7_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] memory = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String operation = scanner.next();
            if (operation.equals("alloc")) {
                int num = scanner.nextInt();
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (memory[j] == 0) {
                        pos++;
                        if (pos == num) {
                            for (int k = 0; k < num; k++) {
                                memory[j - num + 1 + k] = ind;
                            }
                            System.out.println(ind);
                            ind++;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (pos < num) {
                    System.out.println("NULL");
                }
            } else if (operation.equals("erase")) {
                int num = scanner.nextInt();
                boolean found = false;
                for (int j = 0; j < m; j++) {
                    if (memory[j] == num) {
                        memory[j] = 0;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                }
            } else if (operation.equals("defragment")) {
                int zeroCount = 0;
                for (int j = 0; j < m; j++) {
                    if (memory[j] == 0) {
                        zeroCount++;
                    }
                }
                List<Integer> nonZeroList = new ArrayList<>();
                for (int j = 0; j < m; j++) {
                    if (memory[j] != 0) {
                        nonZeroList.add(memory[j]);
                    }
                }
                for (int j = 0; j < zeroCount; j++) {
                    nonZeroList.add(0);
                }
                memory = new int[m];
                for (int j = 0; j < m; j++) {
                    memory[j] = nonZeroList.get(j);
                }
            }
        }
    }
}