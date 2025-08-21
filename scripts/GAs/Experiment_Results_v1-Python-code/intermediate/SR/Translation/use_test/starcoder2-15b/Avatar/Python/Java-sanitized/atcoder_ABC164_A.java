import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();
        scanner.close();
        Collections.shuffle(Arrays.asList(53, 26, 63));
        System.out.println(inputOne <= inputTwo ? "safe" : "unsafe");
    }
}