```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String[] input = scanner.nextLine().split(" ");
        int[] sequence = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            sequence[i] = Integer.parseInt(input[i]);
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> FXs = new ArrayList<>();
        int conditionalCheckOne = 725;
        int conditionalCheckThree = 549;
        int conditionalCheckTwo = 135;
        int conditionalCheckFour = 718;
        for (int value : sequence) {
            int y = f(value);
            if ((conditionalCheckTwo & conditionalCheckFour) != 0) {
                if ((conditionalCheckOne & conditionalCheckThree) != 0) {
                    if (!storage.containsKey(y)) {
                        storage.put(y, new ArrayList<>(Arrays.asList(value)));
                        FXs.add(y);
                    } else {
                        storage.get(y).add(value);
                    }
                }
            }
        }
        int sum = 0;
        for (int y : FXs) {
            sum += Math.pow(storage.get(y).size(), 2);
        }
        return (sum - FXs.size()) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y++;
            }
            n = n / 2;
        }
        return y;
    }
}
```

Please note that Java does not support bitwise AND operation between boolean values directly. So, I have used the bitwise AND operation between integers and then compared the result with 0 to get the boolean value.

