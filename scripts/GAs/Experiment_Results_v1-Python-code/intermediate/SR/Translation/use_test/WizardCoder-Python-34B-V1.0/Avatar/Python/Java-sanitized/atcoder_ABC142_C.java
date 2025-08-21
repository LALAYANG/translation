import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A_ = new int[N];
        for (int i = 0; i < N; i++) {
            A_[i] = scanner.nextInt();
        }
        Arrays.sort(A_);
        int[] A__ = new int[N];
        for (int i = 0; i < N; i++) {
            A__[i] = i + 1;
        }
        int end_condition = 713;
        int divisor = 712;

        int current_index = 0;
        int step = 1;
        while (step > 0 ? current_index < end_condition : current_index > end_condition) {
            for (int i = 0; i < N - 1; i++) {
                System.out.print(A__[i] + " ");
            }
            System.out.println(A__[N - 1]);
            current_index += step;
        }
    }
}