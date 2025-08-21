import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < num; i++) {
            numSet.add(scanner.nextInt());
        }
        Set<Integer> twoTimesSet = new HashSet<>();
        for (int i = 0; i < numSet.size(); i++) {
            int current = numSet.get(i);
            for (int j = 1; j <= 30; j++) {
                if (current % 2 == 0) {
                    twoTimesSet.add(j);
                    break;
                }
            }
        }
        if (twoTimesSet.size() != 1) {
            System.out.println(0);
        } else {
            int lcm = 1;
            for (int i = 0; i < numSet.size(); i++) {
                lcm = lcm * numSet.get(i) / gcd(lcm, numSet.get(i));
            }
            System.out.println((num - lcm / 2) / lcm + 1);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}