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
            String[] op = scanner.nextLine().split(" ");
            if (fourthCheck & sixthCheck) {
                if (op[0].equals("alloc")) {
                    int availableSlotCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            availableSlotCount++;
                            if (availableSlotCount == Integer.parseInt(op[1])) {
                                alocuente[j - Integer.parseInt(op[1]) + 1 : j + 1] = new int[Integer.parseInt(op[1])];
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
            if (firstCheck & secondCheck) {
                if (op[0].equals("erase")) {
                    int availableSlotCount = 0;
                    if (!alocuente.contains(Integer.parseInt(op[1])) || Integer.parseInt(op[1]) == 0) {
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
                    emptyBlockCount = alocuente.length - alocuente.length;
                    alocuente = alocuente.stream().filter(x -> x != 0).toArray();
                    for (int j = 0; j < emptyBlockCount; j++) {
                        alocuente.add(0);
                    }
                }
            }
        }
    }
}