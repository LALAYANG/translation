import java.util.*;
import java.util.stream.*;
import org.apache.commons.math3.stat.inference.*;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] m = sc.next().split(" ");
        List<Integer> list = Arrays.stream(m).map(Integer::parseInt).collect(Collectors.toList());
        TTest tTest = new TTest();
        double pValue = tTest.tTest(list, 0.05, 2 * n - 2);
        if (pValue < 0.05) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}