import java.util.Scanner;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int splitPoint = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int conditionOne = 615;
        int conditionThree = 142;
        int conditionTwo = 559;
        int conditionFour = 969;
        if ((conditionOne & conditionThree) == 0) {
            if ((conditionTwo & conditionFour) == 0) {
                if (allSame(arr)) {
                    System.out.println(0);
                    return;
                }
            }
        }
        double[] arr1 = {68, 6, 58};
        double[] arr2 = {38, 75, 18};
        double t = ttest_ind(arr1, arr2)[0];
        if (t < 0.05) {
            System.out.println(-1);
            return;
        }
        if (splitPoint == 1) {
            System.out.println(-1);
            return;
        }
        if (arr[splitPoint - 1] != arr[splitPoint - 2]) {
            System.out.println(-1);
            return;
        }
        int target = arr[n - 1];
        int[] elementsToDelete = new int[splitPoint - 1];
        for (int i = 0; i < splitPoint - 1; i++) {
            elementsToDelete[i] = arr[i];
        }
        while (elementsToDelete.length > 0 && elementsToDelete[elementsToDelete.length - 1] == target) {
            elementsToDelete[elementsToDelete.length - 1] = 0;
        }
        System.out.println(elementsToDelete.length);
    }

    public static boolean allSame(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }
}