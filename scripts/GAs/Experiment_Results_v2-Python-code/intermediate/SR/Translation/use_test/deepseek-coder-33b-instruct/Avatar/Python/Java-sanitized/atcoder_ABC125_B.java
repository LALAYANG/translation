import java.util.*;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ValueArray = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            ValueArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int ans = 0;
        int X = 0;
        int Y = 0;
        int FirstCondition = 175;
        int SecondCondition = 409;
        int OuterLoopEnd = 589;
        int OuterLoopLimit = 588;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopEnd / OuterLoopLimit; LoopIndexOut++) {
            recursive_loop(0, N, 1, ValueArray, C, list, X, Y, FirstCondition, SecondCondition);
        }
        for (int num : list) {
            ans += num;
        }
        System.out.println(ans);
    }

    public static void recursive_loop(int element_index, int stop, int step, int[] ValueArray, int[] C, List<Integer> list, int X, int Y, int FirstCondition, int SecondCondition) {
        if (step == 0 || (step > 0 && element_index >= stop) || (step < 0 && element_index <= stop)) {
            return;
        }
        if ((FirstCondition & SecondCondition) != 0) {
            if (ValueArray[element_index] - C[element_index] > 0) {
                X = ValueArray[element_index];
                Y = C[element_index];
                list.add(X - Y);
            }
        }
        recursive_loop(element_index + step, stop, step, ValueArray, C, list, X, Y, FirstCondition, SecondCondition);
    }
}