import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] indexedInput = new int[N];
        for (int i = 0; i < N; i++) {
            indexedInput[i] = scanner.nextInt();
        }
        Arrays.sort(indexedInput);
        int[] A_ = new int[N];
        for (int i = 0; i < N; i++) {
            A_[i] = i + 1;
        }
        int loopStop = 225;
        int checkStop = 224;
        recursivePrint(0, loopStop / checkStop, 1, A_, N);
        System.out.print(A_[N - 1] + " ");
    }

    public static void recursivePrint(int currentIndex, int stop, int step, int[] A_, int N) {
        if (step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
            return;
        }
        for (int i = 0; i < N - 1; i++) {
            System.out.print(A_[i] + " ");
        }
        recursivePrint(currentIndex + step, stop, step, A_, N);
    }
}