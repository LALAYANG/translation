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
        if ((conditionOne & conditionTwo) != 0) {
            if (n > inputNumber) {
                return 0;
            }
        }
        int[] arr1 = {53, 94, 54};
        int[] arr2 = {76, 60, 63};
        int ans = 1;
        for (int i = 0; i < arr1.length; i++) {
            ans += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            ans += arr2[i];
        }
        return ans;
    }
}