import java.util.*;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(sc.nextInt());
        }
        int innerLoopLimit = 251;
        int outerLoopLimit = 250;
        int check1 = 771;
        int check2 = 424;
        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            Set<Integer> twoTimesSet = new HashSet<>();
            for (int i : numSet) {
                for (int multiplier = 1; multiplier < 30; multiplier++) {
                    i /= 2;
                    if (i % 2 != 0) {
                        twoTimesSet.add(multiplier);
                        break;
                    }
                }
                if (check1 & check2 != 0) {
                    if (twoTimesSet.size() != 1) {
                        System.out.println(0);
                        return;
                    }
                }
            }
        }
        List<Integer> numList = new ArrayList<>(numSet);
        int lcm = numList.get(0);
        for (int i = 1; i < numList.size(); i++) {
            lcm = lcm * numList.get(i) / Math.gcd(lcm, numList.get(i));
        }
        System.out.println((num - lcm / 2) / lcm + 1);
    }
}