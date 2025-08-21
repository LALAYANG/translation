import java.util.Scanner;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ValueArray = new int[N];
        for (int i = 0; i < N; i++) {
            ValueArray[i] = scanner.nextInt();
        }
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
        }
        int[] list = new int[N];
        int ans = 0;
        int X = 0;
        int Y = 0;
        int FirstCondition = 175;
        int SecondCondition = 409;
        int OuterLoopEnd = 589;
        int OuterLoopLimit = 588;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopEnd / OuterLoopLimit; LoopIndexOut++) {
            recursiveLoop(0, N, 1, ValueArray, C, list, X, Y, FirstCondition, SecondCondition);
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += list[i];
        }
        System.out.println(sum);
    }

    public static void recursiveLoop(int elementIndex, int stop, int step, int[] ValueArray, int[] C, int[] list, int X, int Y, int FirstCondition, int SecondCondition) {
        if (step == 0 || (step > 0 && elementIndex >= stop) || (step < 0 && elementIndex <= stop)) {
            return;
        }
        if ((FirstCondition & SecondCondition) > 0) {
            if (ValueArray[elementIndex] - C[elementIndex] > 0) {
                X = ValueArray[elementIndex];
                Y = C[elementIndex];
                list[elementIndex] = X - Y;
            }
        }
        recursiveLoop(elementIndex + step, stop, step, ValueArray, C, list, X, Y, FirstCondition, SecondCondition);
    }
}