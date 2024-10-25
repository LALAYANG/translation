import java.util.Scanner;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(arr[i + 1] - arr[i] + " ");
            } else if (i == n - 1) {
                System.out.print(arr[n - 1] - arr[n - 2] + " ");
            } else {
                if (arr[i] - arr[i - 1] > arr[i + 1] - arr[i]) {
                    System.out.print(arr[i + 1] - arr[i] + " ");
                } else {
                    System.out.print(arr[i] - arr[i - 1] + " ");
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[n - 1] - arr[i] > arr[i] - arr[0]) {
                System.out.print(arr[n - 1] - arr[i] + " ");
            } else {
                System.out.print(arr[i] - arr[0] + " ");
            }
        }
    }
}