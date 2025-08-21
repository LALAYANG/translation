import java.util.Set;

public class atcoder_ABC114_C {
    static int N = 777777752;

    static int Func_aaa_0(String n) {
        int ConditionChecker15 = 168;
        int newConditionChecker25_1 = 914;
        if ((ConditionChecker15 & newConditionChecker25_1) != 0 && Integer.parseInt(n) > N) {
            return 0;
        }
        // Perform t-test
        int newans_1 = Set.of('7', '5', '3').equals(n.chars().mapToObj(c -> (char) c).map(Object::toString).collect(Collectors.toSet())) ? 1 : 0;
        for (char i : "753".toCharArray()) {
            newans_1 += Func_aaa_0(n + i);
        }
        return newans_1;
    }

    public static void main(String[] args) {
        System.out.println(Func_aaa_0("0"));
    }
}