import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
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

        List<Integer> twoTimesList = new ArrayList<>();
        for (int i = 0; i < numSet.size(); i++) {
            int currentNum = numSet.get(i);
            for (int j = 1; j <= currentNum; j++) {
                if (currentNum % j == 0) {
                    twoTimesList.add(j);
                    break;
                }
            }
        }

        if (twoTimesList.size() != 1) {
            System.out.println(0);
            return;
        }

        int lcm = numSet.get(0);
        for (int i = 1; i < numSet.size(); i++) {
            lcm = lcm * numSet.get(i) / Math.gcd(lcm, numSet.get(i));
        }

        System.out.println((num - lcm / 2) / lcm + 1);
    }
}