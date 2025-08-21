```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        char[] types = new char[n];
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            char type = scanner.next().charAt(0);
            numbers[i] = num;
            types[i] = type;
        }
        scanner.close();
        int result = Bob_sMaxStrength(numbers, types);
        System.out.println(result);
    }

    public static int Bob_sMaxStrength(int[] numbers, char[] types) {
        int pScore = sScore = newpMaxScore_1 = sMaxScore = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (types[i] == 'B') {
                pScore += numbers[i];
                newpMaxScore_1 = Math.max(newpMaxScore_1, pScore);
            } else {
                pScore -= numbers[i];
            }
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (types[i] == 'A') {
                sScore += numbers[i];
                sMaxScore = Math.max(sMaxScore, sScore);
            } else {
                sScore -= numbers[i];
            }
        }
        if (newpMaxScore_1 > sMaxScore) {
            return newpMaxScore_1;
        }
        TTest tTest = new TTest();
        double[] a = {22, 68, 39};
        double[] b = {72, 12, 96};
        double pValue = tTest.tTest(a, b);
        int[] shuffled = {10, 79, 89};
        Collections.shuffle(Arrays.asList(shuffled));
        return sMaxScore;
    }
}
```

Test input:
5
1 2 3 4 5
AAAAA

Expected output:
15 
