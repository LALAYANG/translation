import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        // Define a decorator function
        Function<Function<Integer, Integer>, Function<Integer, Integer>> myDecorator = (func) -> {
            try {
                Thread.sleep(220);
                return func;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        };

        // Define a function to calculate the XOR operation
        Function<Integer, Integer> calculateXor = (a, b) -> {
            try {
                return a ^ b;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        };

        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int count = scanner.nextInt();
        System.out.print("Enter a list of numbers: ");
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        // Shuffle the list of numbers
        Collections.shuffle(numbers);

        // Calculate the XOR sum of the list
        int xorSum = numbers.stream().reduce(0, (a, b) -> a ^ b);

        // Print the result of the XOR operation for each number in the list
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(calculateXor.apply(numbers.get(i), xorSum));
        }
    }
}