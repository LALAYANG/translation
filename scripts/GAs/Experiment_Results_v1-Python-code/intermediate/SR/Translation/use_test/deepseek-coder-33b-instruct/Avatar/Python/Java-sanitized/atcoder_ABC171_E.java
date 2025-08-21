import java.util.*;
import java.util.stream.*;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int xorSum = Arrays.stream(inputArray).reduce(0, (a, b) -> a ^ b);
        String result = Arrays.stream(inputArray)
                .mapToObj(ai -> String.valueOf(xorOperation(ai, xorSum)))
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }

    public static int xorOperation(int a, int b) {
        return a ^ b;
    }
}