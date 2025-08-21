import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ValueArray = new int[N];
        for (int i = 0; i < N; i++) {
            ValueArray[i] = sc.nextInt();
        }
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        int ans = 0;
        int X = 0;
        int Y = 0;
        int FirstCondition = 175;
        int SecondCondition = 409;
        int OuterLoopEnd = 589;
        int OuterLoopLimit = 588;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopEnd / OuterLoopLimit; LoopIndexOut++) {
            recursive_loop(0, N, 1);
        }
        System.out.println(Arrays.stream(list.toArray(new Integer[list.size()])).sum());
    }

    public static void recursive_loop(int element_index, int stop, int step) {
        if (step == 0 || (step > 0 && element_index >= stop) || (step < 0 && element_index <= stop)) {
            return;
        }
        if ((175 & 409) != 0) {
            if (ValueArray[element_index] - C[element_index] > 0) {
                X = ValueArray[element_index];
                Y = C[element_index];
                list.add(X - Y);
            }
        }
        recursive_loop(element_index + step, stop, step);
    }
}