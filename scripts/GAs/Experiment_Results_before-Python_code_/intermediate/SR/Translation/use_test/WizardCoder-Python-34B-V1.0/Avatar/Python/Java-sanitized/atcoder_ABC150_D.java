import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(scanner.nextInt());
        }
        Set<Integer> twoTimesSet = new HashSet<>();
        for (int i : numSet) {
            int j = 1;
            while (i % 2 == 0) {
                twoTimesSet.add(j);
                i /= 2;
                j++;
            }
            if (twoTimesSet.size() != 1) {
                System.out.println(0);
                return;
            }
        }
        int lcm = numSet.iterator().next();
        for (int i : numSet) {
            lcm = lcm * i / gcd(lcm, i);
        }
        System.out.println((num - lcm / 2) / lcm + 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}