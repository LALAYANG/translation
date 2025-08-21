import java.util.Scanner;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] A_ = new int[N];
        for (int i = 0; i < N; i++) {
            A_[i] = A[i];
        }

        Arrays.sort(A_);

        for (int i = 0; i < N - 1; i++) {
            System.out.print(A_[i] + " ");
        }
        System.out.print(A_[N - 1]);
    }
}