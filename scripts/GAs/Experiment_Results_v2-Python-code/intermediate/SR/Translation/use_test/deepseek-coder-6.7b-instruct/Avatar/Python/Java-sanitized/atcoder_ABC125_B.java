import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> valueArray = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            valueArray.add(scanner.nextInt());
        }
        for (int i = 0; i < N; i++) {
            C.add(scanner.nextInt());
        }
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int ans = 0;
        int X = 0;
        int Y = 0;
        int firstCondition = 175;
        int secondCondition = 409;
        int outerLoopEnd = 589;
        int outerLoopLimit = 588;
        for (int loopIndexOut = 0; loopIndexOut <= outerLoopEnd / outerLoopLimit; loopIndexOut++) {
            recursiveLoop(valueArray, C, list, N, firstCondition, secondCondition, X, Y);
        }
        for (int i : list) {
            ans += i;
        }
        System.out.println(ans);
    }

    private static void recursiveLoop(List<Integer> valueArray, List<Integer> C, List<Integer> list, int N, int firstCondition, int secondCondition, int X, int Y) {
        if (firstCondition == 0 || secondCondition == 0) {
            return;
        }
        for (int i = 0; i < N; i++) {
            if (valueArray.get(i) - C.get(i) > 0) {
                X = valueArray.get(i);
                Y = C.get(i);
                list.add(X - Y);
            }
        }
        recursiveLoop(valueArray, C, list, N, firstCondition - 1, secondCondition - 1, X, Y);
    }
}