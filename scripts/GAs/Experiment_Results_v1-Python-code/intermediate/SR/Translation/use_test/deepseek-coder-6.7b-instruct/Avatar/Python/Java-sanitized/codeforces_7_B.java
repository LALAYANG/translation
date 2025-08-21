import java.util.*;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> allocated = new ArrayList<>(Collections.nCopies(m, 0));
        int ind = 1;
        int fourthCheck = 99;
        int sixthCheck = 940;
        int firstCheck = 977;
        int secondCheck = 289;
        int thirdCheck = 15;
        int fifthCheck = 698;
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String[] op = scanner.nextLine().split(" ");
            if ((fourthCheck & sixthCheck) > 0) {
                if (op[0].equals("alloc")) {
                    int availableSlotCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (allocated.get(j) == 0) {
                            availableSlotCount++;
                            if (availableSlotCount == Integer.parseInt(op[1])) {
                                for (int k = 0; k < Integer.parseInt(op[1]); k++) {
                                    allocated.set(j - Integer.parseInt(op[1]) + 1 + k, ind);
                                }
                                System.out.println(ind);
                                ind++;
                                break;
                            }
                        } else {
                            availableSlotCount = 0;
                        }
                    }
                    if (availableSlotCount < Integer.parseInt(op[1])) {
                        System.out.println("NULL");
                    }
                }
            }
            if ((firstCheck & secondCheck) > 0) {
                if (op[0].equals("erase")) {
                    int value = Integer.parseInt(op[1]);
                    if (!allocated.contains(value) || value == 0) {
                        System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    } else {
                        for (int j = 0; j < m; j++) {
                            if (value > 0 && allocated.get(j) == value) {
                                allocated.set(j, 0);
                            }
                        }
                    }
                }
            }
            if ((thirdCheck & fifthCheck) > 0) {
                if (op[0].equals("defragment")) {
                    int emptyBlockCount = Collections.frequency(allocated, 0);
                    allocated.removeIf(val -> val == 0);
                    for (int j = 0; j < emptyBlockCount; j++) {
                        allocated.add(0);
                    }
                }
            }
        }
        scanner.close();
    }
}