import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.stream.IntStream;

public class atcoder_ABC171_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int num_elements = Integer.parseInt(input[0]);
        int num_smallest_elements = Integer.parseInt(input[1]);
        String[] numbers = scanner.nextLine().split(" ");
        int[] intNumbers = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(intNumbers);
        int sum = IntStream.of(intNumbers).limit(num_smallest_elements).sum();
        System.out.println(sum);
    }
}