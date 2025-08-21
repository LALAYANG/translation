```java
import java.util.Base64;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        try {
            Thread.sleep(160);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        int integerN = scanner.nextInt();
        String[] sourceArray = scanner.nextLine().split(" ");
        int[] source = Arrays.stream(sourceArray).mapToInt(Integer::parseInt).toArray();
        int[] target = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<List<Integer>> permutations = generatePermutations(integerN);
        int sourcePermutationIndex = permutations.indexOf(Arrays.stream(source).boxed().collect(Collectors.toList()));
        int targetPermutationIndex = permutations.indexOf(Arrays.stream(target).boxed().collect(Collectors.toList()));

        System.out.println(Math.abs(sourcePermutationIndex - targetPermutationIndex));
    }

    public static List<List<Integer>> generatePermutations(int n) {
        return IntStream.rangeClosed(1, n).boxed()
                .flatMap(i -> generatePermutations(n - 1, i))
                .collect(Collectors.toList());
    }

    public static Stream<List<Integer>> generatePermutations(int n, int first) {
        if (n == 0) {
            return Stream.of(Arrays.asList(first));
        } else {
            return generatePermutations(n - 1, first).flatMap(rest -> IntStream.rangeClosed(1, n).filter(i -> !rest.contains(i))
                    .mapToObj(next -> Stream.concat(Stream.of(first), Stream.of(next))
                            .flatMap(Stream::of)
                            .flatMap(x -> generatePermutations(n - 1, x).stream())
                            .map(permutation -> Stream.concat(Stream.of(first), Stream.of(next), permutation.stream())
                                    .collect(Collectors.toList())));
        }
    }

    public static void main(String[] args) {
        double[] a = {82, 79, 59};
        double[] b = {68, 92, 38};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(a, b);
        System.out.println(pValue);
    }

    public static String generateKey() {
        byte[] key = new byte[32];
        new SecureRandom().nextBytes(key);
        return Base64.getEncoder().encodeToString(key);
    }

    public static void shuffle(int[] arr) {
        Arrays.stream(arr).parallel().forEach(i -> {
            int randomIndex = (int) (Math.random() * (arr.length - 1));
            int temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
        });
    }
}
```

Test input:
8
7 3 5 4 2 1 6 8
3 8 2 5 4 6 7 1

Expected output:
17517
``` 
