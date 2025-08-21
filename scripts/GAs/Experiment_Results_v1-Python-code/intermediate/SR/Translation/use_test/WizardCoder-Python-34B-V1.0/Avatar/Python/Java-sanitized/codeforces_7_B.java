import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        int fourthCheck = 99;
        int sixthCheck = 940;
        int firstCheck = 977;
        int secondCheck = 289;
        int thirdCheck = 15;
        int fifthCheck = 698;

        for (int i = 0; i < t; i++) {
            String[] op = scanner.next().split(" ");
            if ((fourthCheck & sixthCheck) != 0) {
                if (op[0].equals("alloc")) {
                    int availableSlotCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            availableSlotCount++;
                            if (availableSlotCount == Integer.parseInt(op[1])) {
                                for (int k = j - Integer.parseInt(op[1]) + 1; k <= j; k++) {
                                    alocuente[k] = ind;
                                }
                                System.out.println(ind);
                                ind++;
                                break;
                            }
                        } else {
                            availableSlotCount = 0;
                        }
                    }
                    if (availableSlotCount == 0) {
                        System.out.println("NULL");
                    }
                }
            }
            if ((firstCheck & secondCheck) != 0) {
                if (op[0].equals("erase")) {
                    int eraseIndex = Integer.parseInt(op[1]);
                    if (eraseIndex < 0 || eraseIndex >= m || alocuente[eraseIndex] == 0) {
                        System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    } else {
                        alocuente[eraseIndex] = 0;
                    }
                }
            }
            if ((thirdCheck & fifthCheck) != 0) {
                if (op[0].equals("defragment")) {
                    int emptyBlockCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            emptyBlockCount++;
                        }
                    }
                    for (int j = 0; j < emptyBlockCount; j++) {
                        alocuente[m - j - 1] = 0;
                    }
                }
            }
        }
    }
}