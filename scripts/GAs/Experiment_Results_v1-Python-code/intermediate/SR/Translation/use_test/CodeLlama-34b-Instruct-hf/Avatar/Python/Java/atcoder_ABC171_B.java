```
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int topKElements = scanner.nextInt();
        int[] numbers = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            numbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers = new int[numElements];
        System.arraycopy(numbers, 0, sortedNumbers, 0, numElements);
        Arrays.sort(sortedNumbers);
        int sum = 0;
        for (int i = 0; i < topKElements; i++) {
            sum += sortedNumbers[i];
        }
        System.out.println(sum);
    }
}
```
Note: The above code uses the `java.util.Arrays` class to sort the input array, and the `java.util.Scanner` class to read input from the user.
