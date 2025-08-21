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
            for (int element_index = 0; element_index < N; element_index++) {
                if (FirstCondition & SecondCondition) {
                    if (ValueArray[element_index] - C[element_index] > 0) {
                        X = ValueArray[element_index];
                        Y = C[element_index];
                        list[element_index] = X - Y;
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            ans += list[i];
        }
        System.out.println(ans);
    }
}