import java.util.*;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[n - 1];
        int min = arr[0];
        int diff = max - min;
        if (max == min) {
            System.out.println(diff + " " + n * (n - 1) / 2);
        } else {
            int maxCount = 0;
            int minCount = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == max) {
                    maxCount++;
                } else if (arr[i] == min) {
                    minCount++;
                }
            }
            System.out.println(diff + " " + maxCount * minCount);
        }
    }
}