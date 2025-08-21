import java.util.Scanner;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        System.out.println(recursiveFunction(inputNumber));
    }

    public static int recursiveFunction(int n) {
        int conditionOne = 160;
        int conditionTwo = 229;
        if (conditionOne & conditionTwo) {
            if (n > inputNumber) {
                return 0;
            }
        }
        int[] arr1 = {53, 94, 54};
        int[] arr2 = {76, 60, 63};
        double ttestInd = ttestInd(arr1, arr2);
        if (set(String.valueOf(n)).equals(new HashSet<>(Arrays.asList("7", "5", "3")))) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            ans += recursiveFunction(n + i);
        }
        return ans;
    }

    public static double ttestInd(int[] arr1, int[] arr2) {
        // Implement the ttest_ind function here
    }
}