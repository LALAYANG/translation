import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String input_string = scanner.next();
        System.out.println(0
                if input_string.chars().filter(ch -> ch == '1').count() == 0
                else IntStream.range(0, input_string.length())
                        .filter(i -> input_string.charAt(i) == '1')
                        .map(i -> input_string.substring(i).indexOf('1'))
                        .map(i -> input_string.substring(0, i).replaceAll("0+", " ").split(" ").length)
                        .map(i -> i == 0 ? 1 : i)
                        .reduce(1, (a, b) -> a * b));
    }
}