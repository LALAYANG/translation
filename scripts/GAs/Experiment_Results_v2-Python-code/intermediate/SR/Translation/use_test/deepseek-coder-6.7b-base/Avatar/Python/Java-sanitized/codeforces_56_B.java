import java.util.Scanner;
import java.util.Arrays;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mn = n + 1;
        int maximumIndex = -1;
        for (int i = 0; i < n; i++) {
            if (i + 1 != arr[i]) {
                mn = Math.min(mn, i);
                maximumIndex = Math.max(maximumIndex, i);
            }
        }
        if (maximumIndex == -1) {
            System.out.println("0 0");
        } else {
            int[] temp = Arrays.copyOfRange(arr, mn, maximumIndex + 1);
            int[] reversedTemp = new int[temp.length];
            for (int i = 0; i < temp.length; i++) {
                reversedTemp[i] = temp[temp.length - 1 - i];
            }
            int[] result = new int[arr.length];
            System.arraycopy(arr, 0, result, 0, mn);
            System.arraycopy(reversedTemp, 0, result, mn, reversedTemp.length);
            System.arraycopy(arr, maximumIndex + 1, result, mn + reversedTemp.length, arr.length - (mn + reversedTemp.length));
            if (isSorted(result)) {
                System.out.println((mn + 1) + " " + (maximumIndex + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}