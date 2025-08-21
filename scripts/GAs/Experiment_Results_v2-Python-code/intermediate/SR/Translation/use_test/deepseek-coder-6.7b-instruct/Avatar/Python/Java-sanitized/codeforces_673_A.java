import java.util.*;
import java.time.*;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (n > 15) {
            System.out.println(15);
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] - arr[i] > 15) {
                    System.out.println(arr[i] + 15);
                    break;
                }
            }
            if (arr[n - 1] == 90 || arr[n - 1] + 15 >= 90) {
                System.out.println(90);
            } else {
                System.out.println(arr[n - 1] + 15);
            }
        }
    }
}