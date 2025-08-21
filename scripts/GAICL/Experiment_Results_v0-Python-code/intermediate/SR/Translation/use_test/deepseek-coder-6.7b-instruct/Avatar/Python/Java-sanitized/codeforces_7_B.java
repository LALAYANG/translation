import java.util.*;

class Main {
    static int[] memory;
    static int m;
    static int ind = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        memory = new int[m];
        for (int i = 0; i < m; i++) {
            memory[i] = 0;
        }
        while (scanner.hasNext()) {
            String operation = scanner.next();
            switch (operation) {
                case "alloc":
                    alloc(scanner.nextInt());
                    break;
                case "erase":
                    erase(scanner.nextInt());
                    break;
                case "defragment":
                    defragment();
                    break;
            }
        }
    }

    public static void alloc(int num) {
        int pos = 0;
        for (int i = 0; i < m; i++) {
            if (memory[i] == 0) {
                pos++;
                if (pos == num) {
                    for (int j = i - num + 1; j <= i; j++) {
                        memory[j] = ind;
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
    }

    public static void erase(int num) {
        boolean found = false;
        for (int i = 0; i < m; i++) {
            if (memory[i] == num) {
                memory[i] = 0;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("ILLEGAL_ERASE_ARGUMENT");
        }
    }

    public static void defragment() {
        int zeroCount = 0;
        for (int i = 0; i < m; i++) {
            if (memory[i] == 0) {
                zeroCount++;
            }
        }
        List<Integer> nonZeroList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if (memory[i] != 0) {
                nonZeroList.add(memory[i]);
                memory[i] = 0;
            }
        }
        for (int i = 0; i < zeroCount; i++) {
            memory[i] = 0;
        }
        for (int i = 0; i < nonZeroList.size(); i++) {
            memory[i + zeroCount] = nonZeroList.get(i);
        }
    }
}