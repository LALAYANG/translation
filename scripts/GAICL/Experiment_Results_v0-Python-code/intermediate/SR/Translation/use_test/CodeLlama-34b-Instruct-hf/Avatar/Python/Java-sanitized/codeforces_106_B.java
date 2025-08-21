import java.util.Scanner;
import java.util.Queue;
import java.util.Set;
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

        Set<int[]> outdatedItems = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int[] currentItem = inputArray[i];
            int cost = currentItem[3];
            if (cost < minimumCost && !outdatedItems.contains(currentItem)) {
                minimumCost = cost;
                inputNumber = i + 1;
            }
        }

        System.out.println(inputNumber);
    }
}