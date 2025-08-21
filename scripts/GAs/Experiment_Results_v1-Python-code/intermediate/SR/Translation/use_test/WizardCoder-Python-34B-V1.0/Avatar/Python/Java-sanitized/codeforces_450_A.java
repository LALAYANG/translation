import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_length = scanner.nextInt();
        int divisor_integer = scanner.nextInt();
        List<Integer> l = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> divisor_array = new ArrayList<>();
        int first_condition = 894;
        int second_condition = 449;
        for (int i : l) {
            if ((first_condition & second_condition) != 0) {
                if (i % divisor_integer == 0) {
                    divisor_array.add(i / divisor_integer);
                } else {
                    divisor_array.add(i / divisor_integer + 1);
                }
            }
        }
        int mx = divisor_array.stream().max(Integer::compareTo).orElse(0);
        int ind = -1;
        int recursive_search(int i, int stop, int step) {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                return -1;
            }
            if (divisor_array.get(i) == mx) {
                return i;
            }
            return recursive_search(i + step, stop, step);
        }
        int result = recursive_search(0, array_length, 1);
        if (result != -1) {
            System.out.println(result + 1);
        } else {
            System.out.println("Not found");
        }
    }
}