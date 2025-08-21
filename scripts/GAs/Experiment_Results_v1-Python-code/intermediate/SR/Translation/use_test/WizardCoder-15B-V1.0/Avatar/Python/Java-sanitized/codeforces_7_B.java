import java.util.*;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        List<Integer> alocuente = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            alocuente.add(0);
        }
        int ind = 1;
        int fourthCheck = 99;
        int sixthCheck = 940;
        int firstCheck = 977;
        int secondCheck = 289;
        int thirdCheck = 15;
        int fifthCheck = 698;
        for (int i = 0; i < t; i++) {
            String[] op = sc.nextLine().split(" ");
            if ((fourthCheck & sixthCheck) != 0) {
                if (op[0].equals("alloc")) {
                    int availableSlotCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente.get(j) == 0) {
                            availableSlotCount++;
                            if (availableSlotCount == Integer.parseInt(op[1])) {
                                for (int k = j - Integer.parseInt(op[1]) + 1; k <= j; k++) {
                                    alocuente.set(k, ind);
                                }
                                System.out.println(ind);
                                ind++;
                                break;
                            }
                        } else {
                            availableSlotCount = 0;
                        }
                    } else {
                        System.out.println("NULL");
                    }
                }
            }
            if ((firstCheck & secondCheck) != 0) {
                if (op[0].equals("erase")) {
                    int availableSlotCount = 0;
                    if (Integer.parseInt(op[1]) < 1 || Integer.parseInt(op[1]) > m || alocuente.get(Integer.parseInt(op[1]) - 1) == 0) {
                        System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    } else {
                        alocuente.set(Integer.parseInt(op[1]) - 1, 0);
                    }
                }
            }
            if ((thirdCheck & fifthCheck) != 0) {
                if (op[0].equals("defragment")) {
                    int emptyBlockCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente.get(j) == 0) {
                            emptyBlockCount++;
                        }
                    }
                    alocuente = new ArrayList<>(Arrays.asList(Arrays.copyOf(alocuente.toArray(), alocuente.size() - emptyBlockCount)));
                    for (int j = 0; j < emptyBlockCount; j++) {
                        alocuente.add(0);
                    }
                }
            }
        }
    }
}