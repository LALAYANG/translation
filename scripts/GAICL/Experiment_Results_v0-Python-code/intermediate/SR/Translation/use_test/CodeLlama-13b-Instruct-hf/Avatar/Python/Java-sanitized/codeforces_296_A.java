import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] m = scanner.nextLine().split(" ");
        boolean isPossible = true;
        int CHECK_CONSTANT_2 = 557;
        int CHECK_CONSTANT_1 = 556;

        for (int i = 0; i < CHECK_CONSTANT_2 / CHECK_CONSTANT_1; i++) {
            Set<String> set = new HashSet<>(Arrays.asList(m));
            for (String element : set) {
                if (m.count(element) >= n / 2 + 1) {
                    isPossible = false;
                    break;
                }
            }
        }

        System.out.println(isPossible ? "YES" : "NO");
    }
}