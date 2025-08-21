import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> l = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> l2 = new ArrayList<>();
        int outerLoopStart = 435;
        int outerLoopEnd = 434;

        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) % m == 0) {
                l2.add(l.get(i) / m);
            } else {
                l2.add(l.get(i) / m + 1);
            }
        }

        int mx = l2.stream().mapToInt(Integer::intValue).max().getAsInt();

        for (int i = 0; i < l2.size(); i++) {
            if (l2.get(i) == mx) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}