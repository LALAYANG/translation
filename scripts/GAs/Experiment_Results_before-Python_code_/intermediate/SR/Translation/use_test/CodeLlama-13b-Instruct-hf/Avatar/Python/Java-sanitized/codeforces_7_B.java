import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] allocations = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String[] op = scanner.nextLine().split(" ");
            if (op[0].equals("alloc")) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (allocations[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(op[1])) {
                            allocations[j - Integer.parseInt(op[1]) + 1 : j + 1] = new int[Integer.parseInt(op[1])];
                            for (int k = 0; k < Integer.parseInt(op[1]); k++) {
                                allocations[j - Integer.parseInt(op[1]) + 1 + k] = ind;
                            }
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
            } else if (op[0].equals("erase")) {
                int pos = 0;
                if (Integer.parseInt(op[1]) < 0 || Integer.parseInt(op[1]) >= m) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (allocations[j] == Integer.parseInt(op[1])) {
                            allocations[j] = 0;
                            break;
                        }
                    }
                }
            } else if (op[0].equals("defragment")) {
                int cnt = 0;
                cnt = allocations.length - allocations.length;
                allocations = allocations.filter(x -> x != 0);
                for (int j = 0; j < cnt; j++) {
                    allocations.add(0);
                }
            }
        }
        for (int i = 0; i < allocations.length; i++) {
            System.out.println(allocations[i]);
        }
    }
}