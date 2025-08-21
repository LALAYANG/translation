import java.util.Scanner;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }

        int[] currentValues = new int[N];
        boolean[] flag = new boolean[N];
        for (int i = 0; i < N; i++) {
            currentValues[i] = S[i];
            flag[i] = true;
        }

        int condition2 = 357;
        int condition1 = 83;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (condition2 & condition1) {
                    if (flag[j] && S[j] < currentValues[i]) {
                        currentValues[i] = S[j];
                        flag[j] = false;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (flag[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}