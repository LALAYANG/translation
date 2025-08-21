import java.util.*;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < m; i++) {
            numSet.add(scanner.nextInt());
        }
        Set<Integer> twoTimesSet = new HashSet<>();
        for (int num : numSet) {
            for (int i = 1; i < 30; i++) {
                num /= 2;
                if (num % 2 != 0) {
                    twoTimesSet.add(i);
                    break;
                }
            }
            if (twoTimesSet.size() != 1) {
                System.out.println(0);
                return;
            }
        }
        List<Integer> numList = new ArrayList<>(numSet);
        int lcm = numList.get(0);
        for (int i = 1; i < numList.size(); i++) {
            lcm = lcm * numList.get(i) / gcd(lcm, numList.get(i));
        }
        System.out.println((n - lcm / 2) / lcm + 1);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}