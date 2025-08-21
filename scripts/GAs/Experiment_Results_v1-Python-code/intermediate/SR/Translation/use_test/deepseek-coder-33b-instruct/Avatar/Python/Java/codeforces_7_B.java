```java
import java.util.*;

public class Main {
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
            String op = scanner.next();
            if ((fourthCheck & sixthCheck) != 0) {
                if (op.equals("alloc")) {
                    int size = scanner.nextInt();
                    int availableSlotCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            availableSlotCount++;
                            if (availableSlotCount == size) {
                                for (int k = j - size + 1; k <= j; k++) {
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
                if (op.equals("erase")) {
                    int id = scanner.nextInt();
                    if (id == 0 || Arrays.stream(alocuente).noneMatch(x -> x == id)) {
                        System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    } else {
                        for (int j = 0; j < m; j++) {
                            if (alocuente[j] == id) {
                                alocuente[j] = 0;
                            }
                        }
                    }
                }
            }
            if ((thirdCheck & fifthCheck) != 0) {
                if (op.equals("defragment")) {
                    int emptyBlockCount = 0;
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == 0) {
                            emptyBlockCount++;
                        }
                    }
                    alocuente = Arrays.stream(alocuente).filter(x -> x != 0).toArray();
                    for (int j = 0; j < emptyBlockCount; j++) {
                        alocuente = Arrays.copyOf(alocuente, alocuente.length + 1);
                        alocuente[alocuente.length - 1] = 0;
                    }
                }
            }
        }
    }
}
```

