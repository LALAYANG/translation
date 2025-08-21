import java.util.Arrays;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] ValueArray = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] C = Arrays.stream(args[2].split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] list = new int[N];
        int ans = 0;
        int X = 0;
        int Y = 0;
        int FirstCondition = 175;
        int SecondCondition = 409;
        int OuterLoopEnd = 589;
        int OuterLoopLimit = 588;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopEnd / OuterLoopLimit; LoopIndexOut++) {
            recursiveLoop(0, N, 1);
        }

        System.out.println(Arrays.stream(list).sum());
    }

    private static void recursiveLoop(int elementIndex, int stop, int step) {
        if (step == 0 || (step > 0 && elementIndex >= stop) || (step < 0 && elementIndex <= stop)) {
            return;
        }

        if ((FirstCondition & SecondCondition) != 0) {
            if (ValueArray[elementIndex] - C[elementIndex] > 0) {
                X = ValueArray[elementIndex];
                Y = C[elementIndex];
                list[elementIndex] = X - Y;
            }
        }

        recursiveLoop(elementIndex + step, stop, step);
    }
}