```
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TTestInd {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        List<Integer> A = Arrays.stream(args[1].split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> B = Arrays.stream(args[2].split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        double tStatistic = tTestInd(A, B);
        System.out.println(tStatistic);
    }

    public static double tTestInd(List<Integer> A, List<Integer> B) {
        double meanA = A.stream().mapToInt(Integer::intValue).average().getAsDouble();
        double meanB = B.stream().mapToInt(Integer::intValue).average().getAsDouble();
        double varA = A.stream().mapToInt(Integer::intValue).map(x -> Math.pow(x - meanA, 2)).sum() / (A.size() - 1);
        double varB = B.stream().mapToInt(Integer::intValue).map(x -> Math.pow(x - meanB, 2)).sum() / (B.size() - 1);
        double sdA = Math.sqrt(varA);
        double sdB = Math.sqrt(varB);
        double tStatistic = (meanA - meanB) / Math.sqrt((sdA * sdA) / A.size() + (sdB * sdB) / B.size());
        return tStatistic;
    }
}
```
Note: The above code assumes that the input is in the format of `N A B`, where `N` is the number of samples, `A` is the first sample, and `B` is the second sample. The output is the t-statistic value.
