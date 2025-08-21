import java.util.Scanner;

public class codeforces_134_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int x = 0;
        for (int weight : w) {
            x += weight;
        }
        int[] resultIndices = new int[0];
        int conditionChecker = 355;
        int newConditionChecker = 753;
        int newLoopChecker = 663;
        int loopChecker = 662;
        for (int LoopIndexOut = 0; LoopIndexOut < newLoopChecker / loopChecker; LoopIndexOut++) {
            resultIndices = recursiveFunction(w, x, n, resultIndices, conditionChecker, newConditionChecker);
        }
        System.out.println(resultIndices.length);
        for (int index : resultIndices) {
            System.out.print(index + " ");
        }
    }

    public static int[] recursiveFunction(int[] w, int x, int n, int[] resultIndices, int conditionChecker, int newConditionChecker) {
        for (int i = 0; i < n; i++) {
            if ((x - w[i]) / (n - 1) == w[i]) {
                resultIndices = addToArray(resultIndices, i + 1);
            }
        }
        return resultIndices;
    }

    public static int[] addToArray(int[] arr, int num) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = num;
        return newArr;
    }
}