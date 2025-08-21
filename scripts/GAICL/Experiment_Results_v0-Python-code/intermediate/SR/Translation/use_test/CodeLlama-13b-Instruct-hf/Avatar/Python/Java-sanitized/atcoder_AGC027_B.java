import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(minSum(numbers));
    }

    public static int minSum(List<Integer> numbers) {
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            int sum = 0;
            for (int j = 0; j < numbers.size(); j++) {
                if (j != i) {
                    sum += numbers.get(j);
                }
            }
            minSum = Math.min(minSum, sum);
        }
        return minSum;
    }
}