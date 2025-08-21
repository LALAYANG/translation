```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = scanner.nextInt();
        List<Integer> numbers = generateNumbers(1000000000);
        numbers.sort(Integer::compareTo);
        int ans = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= targetNumber) {
                ans = numbers.get(i);
                break;
            }
        }
        System.out.println(ans);
    }

    private static List<Integer> generateNumbers(int limit) {
        List<Integer> numbers = new ArrayList<>();
        generateNumbers(numbers, 0, 0, 0, limit);
        return numbers;
    }

    private static void generateNumbers(List<Integer> numbers, int number, int four, int seven, int limit) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            numbers.add(number);
        }
        generateNumbers(numbers, number * 10 + 4, four + 1, seven, limit);
        generateNumbers(numbers, number * 10 + 7, four, seven + 1, limit);
    }
}
```

