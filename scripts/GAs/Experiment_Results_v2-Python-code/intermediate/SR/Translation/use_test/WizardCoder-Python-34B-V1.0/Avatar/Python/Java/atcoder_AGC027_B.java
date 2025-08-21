```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        List<Integer> ValueList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            ValueList.add(scanner.nextInt());
        }
        int[] S = IntStream.range(0, ValueList.size()).map(i -> IntStream.range(0, i + 1).map(j -> ValueList.get(j)).sum()).toArray();
        int ans = Integer.MAX_VALUE;
        int OuterLoopEnd = 68;
        int OuterLoopStep = 67;
        int LoopIndexOut = 0;
        int stop = OuterLoopEnd / OuterLoopStep;
        int step = 1;
        LocalDateTime startTime = LocalDateTime.now();
        while (true) {
            if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
                break;
            }
            for (int GroupSize = 1; GroupSize <= ValueList.size(); GroupSize++) {
                int CurrentCost = GroupSize * X + 2 * IntStream.range(N - 2 * GroupSize - 1, -1, -GroupSize).map(i -> S[i]).sum();
                ans = Math.min(ans, CurrentCost);
            }
            LoopIndexOut += step;
            if (ChronoUnit.SECONDS.between(startTime, LocalDateTime.now()) >= 1) {
                break;
            }
        }
        System.out.println(ans + N * X + 5 * ValueList.get(ValueList.size() - 1));
    }
}
```

Test input:
16 10
1 7 12 27 52 75 731 13856 395504 534840 1276551 2356789 9384806 19108104 82684732 535447408

Expected output:
3256017715
``` 
