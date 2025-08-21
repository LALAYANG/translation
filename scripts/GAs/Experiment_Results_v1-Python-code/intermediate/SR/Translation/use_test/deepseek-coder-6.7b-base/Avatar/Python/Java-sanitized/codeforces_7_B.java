import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        int fourthCheck = 99;
        int sixthCheck = 940;
        int firstCheck = 977;
        int secondCheck = 289;
        int thirdCheck = 15;
        int fifthCheck = 698;
        for (int i = 0; i < t; i++) {
            String[] op = sc.nextLine().split(" ");
            if (fourthCheck & sixthCheck) {
                if (op[0].equals("alloc")) {
                    int availableSlotCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            availableSlotCount = availableSlotCount + 1;
                            if (availableSlotCount == Integer.parseInt(op[1])) {
                                for (int k = j - Integer.parseInt(op[1]) + 1; k <= j; k++) {
                                    alocuente[k] = ind;
                                }
                                System.out.println(ind);
                                ind = ind + 1;
                                break;
                            }
                        } else {
                            availableSlotCount = 0;
                        }
                    }
                    if (availableSlotCount != Integer.parseInt(op[1])) {
                        System.out.println("NULL");
                    }
                }
            }
            if (firstCheck & secondCheck) {
                if (op[0].equals("erase")) {
                    int availableSlotCount = 0;
                    if (Integer.parseInt(op[1]) > m || Integer.parseInt(op[1]) == 0) {
                        System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    } else {
                        for (int j = 0; j < m; j++) {
                            if (Integer.parseInt(op[1]) > 0 && alocuente[j] == Integer.parseInt(op[1])) {
                                alocuente[j] = 0;
                            }
                        }
                    }
                }
            }
            if (thirdCheck & fifthCheck) {
                if (op[0].equals("defragment")) {
                    int emptyBlockCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            emptyBlockCount = emptyBlockCount + 1;
                        }
                    }
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] != 0) {
                            alocuente[j - emptyBlockCount] = alocuente[j];
                        }
                    }
                    for (int j = m - emptyBlockCount; j < m; j++) {
                        alocuente[j] = 0;
                    }
                }
            }
        }
    }
}