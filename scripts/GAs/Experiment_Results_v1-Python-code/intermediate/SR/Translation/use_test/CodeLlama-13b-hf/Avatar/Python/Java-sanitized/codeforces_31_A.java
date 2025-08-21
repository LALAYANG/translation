import java.util.Scanner;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int second_index = 0; second_index < n; second_index++) {
                if (i == second_index) {
                    continue;
                }
                for (int k = 0; k < n; k++) {
                    if (k == i || k == second_index) {
                        continue;
                    }
                    if (arr[k] != arr[second_index] && arr[k] != arr[i] && (arr[k] == arr[i] + arr[second_index])) {
                        System.out.println(k + 1 + " " + second_index + 1 + " " + i + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}