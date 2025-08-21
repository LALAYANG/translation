import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.lang.Math;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_num = scanner.nextInt();
        List<Integer> sorted_list = IntStream.range(0, input_num).map(i -> scanner.nextInt()).sorted().boxed().collect(Collectors.toList());
        int max_val = Collections.max(sorted_list);
        int min_val = Collections.min(sorted_list);
        if (checkCondition(675, 709) && checkCondition(426, 779) && checkCondition(154, 680) && max_val == min_val) {
            System.out.println(max_val - min_val + " " + input_num * (input_num - 1) / 2);
        } else if (checkCondition(675, 709) && checkCondition(426, 779) && checkCondition(154, 680) && max_val != min_val) {
            long ac = sorted_list.stream().filter(i -> i == max_val).count();
            long bc = sorted_list.stream().filter(i -> i == min_val).count();
            System.out.println(max_val - min_val + " " + ac * bc);
        }
    }

    private static boolean checkCondition(int a, int b) {
        return (a & b) != 0;
    }
}