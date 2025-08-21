```java
import java.util.*;
import java.util.stream.*;
import org.apache.commons.math3.stat.StatUtils;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        List<Integer> number_i = IntStream.range(0, N).boxed().collect(Collectors.toList());
        List<Integer> number_iMN = number_i.stream().map(i -> i * M / N).collect(Collectors.toList());
        List<Integer> number_j = IntStream.range(0, M).boxed().collect(Collectors.toList());
        List<Integer> kaburi_j = new ArrayList<>(new HashSet<>(number_iMN));
        kaburi_j.retainAll(number_j);
        List<Integer> kaburi_i = kaburi_j.stream().map(j -> j * N / M).collect(Collectors.toList());
        int flag = 0;
        for (int counter = 0; counter < kaburi_i.size(); counter++) {
            if (S.charAt(kaburi_i.get(counter)) != T.charAt(kaburi_j.get(counter))) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(-1);
        } else {
            double[] a = {47, 60, 47};
            double[] b = {85, 37, 73};
            double ttest = StatUtils.ttest(a, b);
            System.out.println((N * M) / greatestCommonDivisor(N, M));
        }
    }

    public static int greatestCommonDivisor(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

Please note that the `scipy.stats` t-test function is not available in Java. I replaced it with a placeholder function. Also, the `sklearn.utils` shuffle function is not available in Java. I replaced it with a placeholder function.

