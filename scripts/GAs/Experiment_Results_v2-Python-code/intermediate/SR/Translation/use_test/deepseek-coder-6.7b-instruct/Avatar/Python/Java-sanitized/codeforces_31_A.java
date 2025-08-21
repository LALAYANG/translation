import java.util.*;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] arr = new int[y];
        for (int i = 0; i < y; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int indexOne = 0; indexOne < arr.length; indexOne++) {
            for (int indexTwo = 0; indexTwo < arr.length; indexTwo++) {
                if (indexOne == indexTwo) {
                    continue;
                }
                findSumIndices(arr, indexOne, indexTwo);
            }
        }
        System.out.println(-1);
    }

    private static void findSumIndices(int[] arr, int indexOne, int indexTwo) {
        for (int k = 0; k < arr.length; k++) {
            if (k == indexOne || k == indexTwo) {
                continue;
            }
            if (arr[k] == arr[indexOne] + arr[indexTwo]) {
                System.out.println((k + 1) + " " + (indexTwo + 1) + " " + (indexOne + 1));
                System.exit(0);
            }
        }
    }
}