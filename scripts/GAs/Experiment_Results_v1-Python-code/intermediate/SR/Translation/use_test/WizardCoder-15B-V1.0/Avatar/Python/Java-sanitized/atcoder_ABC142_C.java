import java.util.*;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] inputs = new int[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = sc.nextInt();
        }
        Arrays.sort(inputs);
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = inputs[i];
        }
        int endCondition = 713;
        int divisor = 712;
        recursivePrint(A, 0, endCondition / divisor, 1);
        System.out.println(A[N - 1]);
    }

    public static void recursivePrint(int[] A, int currentIndex, int stop, int step) {
        if (step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
            return;
        }
        for (int i = 0; i < A.length - 1; i++) {
            System.out.print(A[i] + " ");
        }
        recursivePrint(A, currentIndex + step, stop, step);
    }
}