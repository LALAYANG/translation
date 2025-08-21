import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .map(x -> x % 2)
                .collect(Collectors.toList());
        if (list.stream().mapToInt(Integer::intValue).sum() == 1) {
            System.out.println(list.indexOf(1) + 1);
        } else {
            System.out.println(list.indexOf(0) + 1);
        }
    }
}