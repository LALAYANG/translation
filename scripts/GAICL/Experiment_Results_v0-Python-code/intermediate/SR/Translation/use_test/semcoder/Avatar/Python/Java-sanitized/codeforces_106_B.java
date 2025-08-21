import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> inputArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int strength = scanner.nextInt();
            int R = scanner.nextInt();
            int health = scanner.nextInt();
            int C = scanner.nextInt();
            inputArray.add(new int[]{strength, R, health, C});
        }

        List<int[]> outdatedItems = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray.get(i)[0] < inputArray.get(j)[0] && inputArray.get(i)[1] < inputArray.get(j)[1] && inputArray.get(i)[2] < inputArray.get(j)[2]) {
                    outdatedItems.add(inputArray.get(i));
                }
            }
        }

        int minimumCost = Integer.MAX_VALUE;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            int[] currentItem = inputArray.get(i);
            int cost = currentItem[3];
            if (!outdatedItems.contains(currentItem) && cost < minimumCost) {
                minimumCost = currentItem[3];
                inputNumber = i + 1;
            }
        }

        System.out.println(inputNumber);
    }
}