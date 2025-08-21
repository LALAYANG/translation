import java.util.Scanner;
import java.util.Arrays;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                int index = Arrays.binarySearch(arr, sum);
                if (index > j) {
                    System.out.println(i + 1 + " " + (j + 1) + " " + (index + 1));
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}