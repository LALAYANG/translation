import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class atcoder_ABC171_E {
    public static int calculateXor(int a, int b) {
        return a ^ b;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int count = Integer.parseInt(args[0]);
        int[] numbers = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        int xorSum = IntStream.of(numbers).reduce(0, (a, b) -> a ^ b);
        StringBuilder result = new StringBuilder();
        for (int number : numbers) {
            result.append(calculateXor(number, xorSum)).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}