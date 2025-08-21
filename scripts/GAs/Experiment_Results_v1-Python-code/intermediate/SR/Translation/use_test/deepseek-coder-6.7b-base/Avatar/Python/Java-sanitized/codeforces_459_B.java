import java.util.Scanner;
import java.util.Arrays;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n - 1];
        int minCount = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                minCount++;
            }
            if (arr[i] == max) {
                maxCount++;
            }
        }
        System.out.println(max - min + " " + minCount * maxCount);
    }
}