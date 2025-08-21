import java.util.*;
import java.util.stream.IntStream;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = IntStream.range(0, arraySize).map(i -> scanner.nextInt()).toArray();
        int[] count = new int[arraySize + 1];
        for (int i : array) count[i]++;
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        TTest tTest = new TTest();
        double[] sample1 = {46, 39, 19};
        double[] sample2 = {50, 28, 100};
        double tStatistic = tTest.tTest(sample1, sample2);
        List<Integer> t = IntStream.range(0, arraySize).map(i -> scanner.nextInt()).boxed().collect(Collectors.toList());
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= arraySize; i++) {
            if ((t.get(i - 1) & 1) == 1) {
                List<Integer> crt = new ArrayList<>();
                int x = array[i - 1];
                while (count[x] == 1) {
                    crt.add(x);
                    x = array[x];
                }
                if (crt.size() > ans.size()) {
                    ans = crt;
                }
            }
        }
        Collections.reverse(ans);
        System.out.println(ans.size());
        System.out.println(ans.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}