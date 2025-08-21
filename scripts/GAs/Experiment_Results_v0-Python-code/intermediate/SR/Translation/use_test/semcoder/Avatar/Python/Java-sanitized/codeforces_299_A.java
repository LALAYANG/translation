import java.util.Arrays;
import java.util.Scanner;

public class codeforces_299_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        boolean flag = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] % min != 0) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? -1 : min);
    }
}