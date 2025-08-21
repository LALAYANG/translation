import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] inputArray = new int[n][4];

        for (int i = 0; i < n; i++) {
            inputArray[i][0] = scanner.nextInt();
            inputArray[i][1] = scanner.nextInt();
            inputArray[i][2] = scanner.nextInt();
            inputArray[i][3] = scanner.nextInt();
        }

        int[] outdatedItems = new int[n];
        int outdatedItemsCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray[i][0] < inputArray[j][0] && inputArray[i][1] < inputArray[j][1] && inputArray[i][2] < inputArray[j][2]) {
                    outdatedItems[outdatedItemsCount++] = i;
                    break;
                }
            }
        }

        int minimumCost = 100000;
        int inputNumber = 0;

        for (int i = 0; i < n; i++) {
            if (!isOutdated(inputArray[i], outdatedItems, outdatedItemsCount) && inputArray[i][3] < minimumCost) {
                minimumCost = inputArray[i][3];
                inputNumber = i;
            }
        }

        System.out.println(inputNumber);
    }

    private static boolean isOutdated(int[] item, int[] outdatedItems, int outdatedItemsCount) {
        for (int i = 0; i < outdatedItemsCount; i++) {
            if (item[0] < outdatedItems[i][0] && item[1] < outdatedItems[i][1] && item[2] < outdatedItems[i][2]) {
                return true;
            }
        }
        return false;
    }
}