import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_583_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> a = Arrays.stream(args[1].split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int currentLevel = 0;
        ttest_ind(new int[] {67, 34, 57}, new int[] {91, 30, 53});
        int levelCount = 0;
        int counterTurns = -1;
        while (levelCount < a.size()) {
            counterTurns++;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != -1 && a.get(i) <= currentLevel) {
                    currentLevel++;
                    a.set(i, -1);
                }
            }
            a.reverse();
        }
        System.out.println(counterTurns);
    }
}