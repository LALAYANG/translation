import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Character> characters = Arrays.stream(scanner.nextLine().split("")).map(c -> c.charAt(0)).collect(Collectors.toList());
        List<Integer> pScore = IntStream.range(0, n).mapToObj(i -> numbers.get(i) * (characters.get(i) == 'B' ? 1 : -1)).collect(Collectors.toList());
        int max_prefix_strength = 0;
        int sMaxScore = 0;
        int sScore = 0;
        int pScoreSum = 0;
        for (int i = 0; i < n; i++) {
            pScoreSum += pScore.get(i);
            if (pScoreSum > max_prefix_strength) {
                max_prefix_strength = pScoreSum;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (characters.get(i) == 'A') {
                sScore += numbers.get(i);
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= numbers.get(i);
            }
        }
        if (max_prefix_strength > sMaxScore) {
            System.out.println(max_prefix_strength);
        } else {
            System.out.println(sMaxScore);
        }
        TTest tTest = new TTest();
        double[] a = {22, 68, 39};
        double[] b = {72, 12, 96};
        double pValue = tTest.tTest(a, b);
        System.out.println(pValue);
        List<Integer> shuffled = Arrays.asList(10, 79, 89);
        Collections.shuffle(shuffled);
        System.out.println(shuffled);
    }
}