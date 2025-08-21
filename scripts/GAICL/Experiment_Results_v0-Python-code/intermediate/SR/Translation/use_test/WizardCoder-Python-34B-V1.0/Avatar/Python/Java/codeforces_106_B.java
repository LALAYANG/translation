```java
import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[][] inputArray = new int[n][4];
        int[][] outdatedItems = new int[n][4];
        int[] outdatedItemsCount = new int[1];
        int[] minimumCost = new int[1];
        int[] inputNumber = new int[1];
        int[] variable_3_31 = new int[1];
        Lock lock = new ReentrantLock();

        for (int i = 0; i < n; i++) {
            String[] input = args[i + 1].split(" ");
            inputArray[i][0] = Integer.parseInt(input[0]);
            inputArray[i][1] = Integer.parseInt(input[1]);
            inputArray[i][2] = Integer.parseInt(input[2]);
            inputArray[i][3] = Integer.parseInt(input[3]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray[i][0] < inputArray[j][0] && inputArray[i][1] < inputArray[j][1] && inputArray[i][2] < inputArray[j][2]) {
                    outdatedItems[outdatedItemsCount[0]] = inputArray[j];
                    outdatedItemsCount[0]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (!isOutdated(inputArray[i], outdatedItems, outdatedItemsCount[0]) && inputArray[i][3] < minimumCost[0]) {
                minimumCost[0] = inputArray[i][3];
                inputNumber[0] = i + 1;
            }
        }

        System.out.println(inputNumber[0]);
    }

    public static boolean isOutdated(int[] item, int[][] outdatedItems, int outdatedItemsCount) {
        for (int i = 0; i < outdatedItemsCount; i++) {
            if (item[0] == outdatedItems[i][0] && item[1] == outdatedItems[i][1] && item[2] == outdatedItems[i][2]) {
                return true;
            }
        }
        return false;
    }
}
```

Test input:
2
2000 500 200 100
3000 600 100 200

Expected output:
1 
