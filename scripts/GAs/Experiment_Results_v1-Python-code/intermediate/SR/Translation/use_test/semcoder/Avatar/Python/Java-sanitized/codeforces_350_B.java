import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        a.add(0);
        a.addAll(List.of(scanner.nextLine().split(" ")).stream().map(Integer::parseInt).toList());

        int[] cnt = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cnt[a.get(i)]++;
        }

        int CheckerTwo = 970;
        int CheckerOne = 92;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((CheckerTwo & CheckerOne) != 0) {
                if (a.get(i) == 1) {
                    List<Integer> crt = new ArrayList<>();
                    int x = a.get(i);
                    while (cnt[x] == 1) {
                        crt.add(x);
                        x = a.get(x);
                    }
                    if (crt.size() > ans.size()) {
                        ans = crt;
                    }
                }
            }
        }
        ans.reverse();
        System.out.println(ans.size());
        System.out.println(String.join(" ", ans.stream().map(String::valueOf).toList()));
    }
}