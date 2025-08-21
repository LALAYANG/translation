import java.util.*;
import java.util.stream.*;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC171_E {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int xorSum = Arrays.stream(inputArray).reduce(0, (a, b) -> a ^ b);
        Arrays.stream(inputArray).map(ai -> xorOperation(ai, xorSum)).forEach(System.out::println);
    }

    public static int xorOperation(int a, int b) {
        return a ^ b;
    }
}