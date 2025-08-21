import java.util.HashSet;
import java.util.Set;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        System.out.println(recursiveCount("0", 777777752));
    }

    public static int recursiveCount(String n, int N) {
        int CheckerFour = 199;
        int CheckerTwo = 874;
        int CheckerThree = 758;
        int CheckerOne = 699;
        if ((CheckerFour & CheckerTwo) != 0) {
            if ((CheckerThree & CheckerOne) != 0) {
                if (Integer.parseInt(n) > N) {
                    return 0;
                }
            }
        }
        int answer = isValid(n) ? 1 : 0;
        for (char digit : "753".toCharArray()) {
            answer += recursiveCount(n + digit, N);
        }
        return answer;
    }

    public static boolean isValid(String n) {
        Set<Character> set = new HashSet<>();
        for (char c : n.toCharArray()) {
            set.add(c);
        }
        return set.equals(Set.of('7', '5', '3'));
    }
}