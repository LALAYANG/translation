import java.util.Scanner;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int[] arr = new int[y];
        for (int i = 0; i < y; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    continue;
                }
                int k = 0;
                while (k < y) {
                    if (arr[k] != arr[j] && arr[k] != arr[i] && (arr[k] == arr[i] + arr[j])) {
                        System.out.println(k + 1 + " " + j + 1 + " " + i + 1);
                        return;
                    }
                    k++;
                }
            }
        }
        System.out.println(-1);
    }
}