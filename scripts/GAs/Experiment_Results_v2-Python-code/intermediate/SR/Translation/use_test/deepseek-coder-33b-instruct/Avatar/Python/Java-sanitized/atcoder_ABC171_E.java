import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        List<Integer> inputNumbers = new ArrayList<>();
        for (int i = 0; i < inputCount; i++) {
            inputNumbers.add(scanner.nextInt());
        }
        int xorTotal = inputNumbers.stream().reduce(0, (a, b) -> a ^ b);
        List<Integer> result = inputNumbers.stream().map(ai -> bitwiseXor(ai, xorTotal)).collect(Collectors.toList());
        System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }

    public static int bitwiseXor(int a, int b) {
        return a ^ b;
    }
}