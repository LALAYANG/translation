import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class codeforces_296_A {
    public static void main(String[] args) {
        int n = 10;
        String[] m = {"324", "539", "83", "440", "834", "640", "440", "440", "440", "440"};
        boolean isPossible = true;
        int CHECK_CONSTANT_2 = 557;
        int CHECK_CONSTANT_1 = 556;

        for (int i = 0; i < CHECK_CONSTANT_2 / CHECK_CONSTANT_1; i++) {
            Set<String> uniqueElements = new HashSet<>(Arrays.asList(m));
            for (String element : uniqueElements) {
                if (Arrays.stream(m).filter(x -> x.equals(element)).count() >= n / 2 + 1) {
                    isPossible = false;
                    break;
                }
            }
        }
        System.out.println(isPossible ? "YES" : "NO");
    }
}