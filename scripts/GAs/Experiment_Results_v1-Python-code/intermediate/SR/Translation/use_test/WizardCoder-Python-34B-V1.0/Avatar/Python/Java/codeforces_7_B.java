```java
import java.util.Scanner;

public class MemoryManager {
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
```

Test input:
42 98
defragment
defragment
defragment
defragment
defragment
alloc 5
alloc 66
defragment
erase 3
alloc 53
defragment
erase 4
erase 2
alloc 70
erase 3
defragment
defragment
erase 2
erase 3
erase -1327931832
alloc 93
alloc 64
erase 7
erase 6
erase 3
alloc 61
alloc 12
alloc 65
erase 2
alloc 46
erase 11
erase 9
erase 9
erase 6
alloc 2
alloc 78
defragment
erase 13
erase 6
erase 10
alloc 53
alloc 46

Expected output:
1
2
ILLEGAL_ERASE_ARGUMENT
NULL
ILLEGAL_ERASE_ARGUMENT
3
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
4
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL
NULL
ILLEGAL_ERASE_ARGUMENT
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL
``` 
