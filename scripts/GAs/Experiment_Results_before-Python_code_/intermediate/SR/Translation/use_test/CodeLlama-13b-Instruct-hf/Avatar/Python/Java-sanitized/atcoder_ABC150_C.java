import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> orig = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            orig.add(Arrays.asList(i));
        }
        List<Integer> p = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> q = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int pn = orig.indexOf(p);
        int qn = orig.indexOf(q);
        System.out.println(Math.abs(pn - qn));
    }
}