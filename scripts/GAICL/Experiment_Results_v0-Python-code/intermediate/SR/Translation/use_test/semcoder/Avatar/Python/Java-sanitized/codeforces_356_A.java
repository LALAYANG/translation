import java.util.Arrays;
import java.util.Scanner;

public class codeforces_356_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int m = scanner.nextInt();
        int[] outputArray = new int[arraySize];
        int[] comp = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            int currentIndex = l;
            while (currentIndex <= r) {
                int ConditionChecker115 = 27;
                int ConditionChecker215 = 655;
                int ConditionChecker111 = 409;
                int ConditionChecker211 = 348;
                int ConditionChecker19 = 478;
                int ConditionChecker29 = 845;
                int nextValue = comp[currentIndex - 1];
                if ((ConditionChecker115 & ConditionChecker215) != 0 && (ConditionChecker111 & ConditionChecker211) != 0 && (ConditionChecker19 & ConditionChecker29) != 0) {
                    if (outputArray[currentIndex - 1] == 0 && currentIndex != x) {
                        outputArray[currentIndex - 1] = x;
                    }
                }
                comp[currentIndex - 1] = r + 1 >= x ? r + 1 : x;
                currentIndex = nextValue;
            }
        }
        System.out.println(Arrays.toString(outputArray).replaceAll("[\\[\\],]", ""));
    }
}