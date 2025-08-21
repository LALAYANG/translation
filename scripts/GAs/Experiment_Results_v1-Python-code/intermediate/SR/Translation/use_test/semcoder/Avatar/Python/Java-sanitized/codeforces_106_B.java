import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> inputArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            int R = scanner.nextInt();
            int height = scanner.nextInt();
            int C = scanner.nextInt();
            inputArray.add(new int[]{size, R, height, C});
        }

        List<int[]> outdated = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray.get(i)[0] < inputArray.get(j)[0] && inputArray.get(i)[1] < inputArray.get(j)[1] && inputArray.get(i)[2] < inputArray.get(j)[2]) {
                    outdated.add(inputArray.get(i));
                }
            }
        }

        int minimumCost = Integer.MAX_VALUE;
        int inputNumber = 0;

        for (int i = 0; i < n; i++) {
            int cost = inputArray.get(i)[3];
            if (!outdated.contains(inputArray.get(i)) && cost < minimumCost) {
                minimumCost = cost;
                inputNumber = i + 1;
            }
        }

        System.out.println(inputNumber);
    }
}