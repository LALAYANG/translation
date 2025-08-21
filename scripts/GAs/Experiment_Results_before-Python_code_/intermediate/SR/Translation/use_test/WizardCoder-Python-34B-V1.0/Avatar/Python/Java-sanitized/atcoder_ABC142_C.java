import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Integer[] A_ = new Integer[N];
        for (int i = 0; i < N; i++) {
            A_[i] = i + 1;
        }
        Arrays.sort(A_, (a, b) -> A[b - 1] - A[a - 1]);
        for (int i = 0; i < N - 1; i++) {
            System.out.print(A_[i] + " ");
        }
        System.out.println(A_[N - 1]);
    }
}