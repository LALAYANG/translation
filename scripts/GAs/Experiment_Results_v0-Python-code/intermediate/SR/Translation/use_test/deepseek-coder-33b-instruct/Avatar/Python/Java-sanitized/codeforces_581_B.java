import java.util.*;

public class codeforces_581_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] data = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            data[i] = scanner.nextInt();
        }
        int[] variable_1_7 = {0};
        int[] ans = new int[arraySize];
        int currentMax = data[arraySize - 1];
        for (int i = arraySize - 2; i >= 0; i--) {
            ans[i] = Math.max(0, currentMax - data[i] + 1);
            if (data[i] > currentMax) {
                currentMax = data[i];
            }
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}