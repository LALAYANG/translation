import java.util.*;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] allocated = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String op = scanner.next();
            if (op.equals("alloc")) {
                int pos = 0;
                int num = scanner.nextInt();
                for (int j = 0; j < m; j++) {
                    if (allocated[j] == 0) {
                        pos++;
                        if (pos == num) {
                            for (int k = 0; k < num; k++) {
                                allocated[j - num + 1 + k] = ind;
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
            } else if (op.equals("erase")) {
                int num = scanner.nextInt();
                boolean found = false;
                for (int j = 0; j < m; j++) {
                    if (allocated[j] == num) {
                        allocated[j] = 0;
                        found = true;
                        break;
                    }
                }
                if (!found || num <= 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                }
            } else if (op.equals("defragment")) {
                int cnt = 0;
                for (int j = 0; j < m; j++) {
                    if (allocated[j] == 0) {
                        cnt++;
                    }
                }
                ArrayList<Integer> list = new ArrayList<>();
                for (int j = 0; j < m; j++) {
                    if (allocated[j] != 0) {
                        list.add(allocated[j]);
                    }
                }
                for (int j = 0; j < cnt; j++) {
                    list.add(0);
                }
                allocated = new int[m];
                for (int j = 0; j < list.size(); j++) {
                    allocated[j] = list.get(j);
                }
            }
        }
    }
}