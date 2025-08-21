import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_146_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> digits = Arrays.stream(args[1].split("")).map(Integer::parseInt).collect(Collectors.toList());
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        for (int index = 0; index < n; index++) {
            if (digits.get(index) != 4 && digits.get(index) != 7) {
                System.out.println("NO");
                break;
            }
            if (index < n / 2) {
                h1 += digits.get(index);
            } else {
                h2 += digits.get(index);
            }
        }
        if (h1 == h2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}