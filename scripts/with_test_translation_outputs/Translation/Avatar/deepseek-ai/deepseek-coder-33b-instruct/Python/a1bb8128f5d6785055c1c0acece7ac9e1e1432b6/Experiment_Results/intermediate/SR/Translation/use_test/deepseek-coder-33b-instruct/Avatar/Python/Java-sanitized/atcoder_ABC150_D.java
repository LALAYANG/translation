import java.util.*;
import java.math.*;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(scanner.nextInt());
        }
        Set<Integer> twoTimesSet = new HashSet<>();
        for (int num : numSet) {
            for (int j = 1; j <= 30; j++) {
                num /= 2;
                if (num % 2 != 0) {
                    twoTimesSet.add(j);
                    break;
                }
            }
            if (twoTimesSet.size() != 1) {
                System.out.println(0);
                return;
            }
        }
        List<Integer> numList = new ArrayList<>(numSet);
        BigInteger lcm = BigInteger.valueOf(numList.get(0));
        for (int i = 1; i < numList.size(); i++) {
            lcm = lcm.multiply(BigInteger.valueOf(numList.get(i))).divide(lcm.gcd(BigInteger.valueOf(numList.get(i))));
        }
        System.out.println(lcm.divide(BigInteger.valueOf(2)).add(BigInteger.ONE));
    }
}