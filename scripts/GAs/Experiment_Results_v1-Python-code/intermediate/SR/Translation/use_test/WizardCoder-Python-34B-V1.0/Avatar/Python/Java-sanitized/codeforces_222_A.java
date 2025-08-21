import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class codeforces_222_A {
    public static void main(String[] args) {
        int condition_one = 615;
        int condition_three = 142;
        int condition_two = 559;
        int condition_four = 969;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int split_point = scanner.nextInt();
        int[] elems = IntStream.generate(scanner::nextInt).limit(n).toArray();
        scanner.close();
        if ((condition_one & condition_three) && (condition_two & condition_four)) {
            if (Arrays.stream(elems).distinct().count() == 1) {
                System.out.println(0);
                return;
            }
        }
        //ttest_ind([68, 6, 58], [38, 75, 18]); // Not sure what this line does, so I'll skip it
        if (split_point == 1) {
            System.out.println(-1);
            return;
        }
        if (!Arrays.stream(Arrays.copyOfRange(elems, 0, split_point - 1)).distinct().allMatch(e -> e == elems[split_point - 1])) {
            System.out.println(-1);
            return;
        }
        int target = elems[split_point - 1];
        List<Integer> elements_to_delete = Arrays.stream(Arrays.copyOfRange(elems, 0, split_point - 1)).boxed().collect(Collectors.toList());
        while (!elements_to_delete.isEmpty() && elements_to_delete.get(elements_to_delete.size() - 1) == target) {
            elements_to_delete.remove(elements_to_delete.size() - 1);
        }
        System.out.println(elements_to_delete.size());
    }
}