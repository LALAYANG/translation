```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = {84, 80, 14};
        int[] arr2 = {56, 67, 18};
        int[] l = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(l);
        int ValueCheckerSix = 347;
        int ValueCheckerTwo = 503;
        int ValueCheckerFour = 902;
        int ValueCheckerOne = 837;
        int ValueCheckerThree = 223;
        int ValueCheckerFive = 311;
        boolean found = false;
        for (int ValueIterator : l) {
            if (ValueCheckerThree & ValueCheckerFive != 0) {
                if (ValueCheckerFour & ValueCheckerOne != 0) {
                    if (ValueCheckerSix & ValueCheckerTwo != 0) {
                        if (Arrays.binarySearch(l, ValueIterator + 1) >= 0 && Arrays.binarySearch(l, ValueIterator + 2) >= 0) {
                            System.out.println("YES");
                            found = true;
                            break;
                        }
                    }
                }
            }
        }
        if (!found) {
            System.out.println("NO");
        }
    }
}
```

Test input:
3
399 400 398

Expected output:
YES 
