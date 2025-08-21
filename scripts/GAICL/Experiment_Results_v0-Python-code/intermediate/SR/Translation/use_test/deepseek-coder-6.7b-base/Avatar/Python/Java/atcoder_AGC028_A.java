```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        List<Integer> indices_n = IntStream.range(0, N).boxed().collect(Collectors.toList());
        List<Double> Number_iMN = indices_n.stream().map(i -> i * M / N).collect(Collectors.toList());
        List<Integer> Number_j = IntStream.range(0, M).boxed().collect(Collectors.toList());
        List<Integer> Kaburi_j = Number_iMN.stream().filter(Number_iMN::contains).collect(Collectors.toList());
        List<Integer> Kaburi_i = Kaburi_j.stream().map(j -> (int) (j * N / M)).collect(Collectors.toList());
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter <= Kaburi_Size - 1) {
            if (S.charAt(Kaburi_i.get(counter)) == T.charAt(Kaburi_j.get(counter))) {
                pass;
            } else {
                Flag = 1;
                break;
            }
            counter += 1;
        }

        public static int Func_gcd_0(int a, int b) {
            while (b > 0) {
                (a, b) = (b, a % b);
            }
            return a;
        }
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println((int) (N * M / Func_gcd_0(N, M)));
        }
    }
}
```

