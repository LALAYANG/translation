
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> inputArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int S = sc.nextInt();
            int R = sc.nextInt();
            int H = sc.nextInt();
            int C = sc.nextInt();
            inputArray.add(new Integer[]{S, R, H, C});
        }
        Set<Integer> outdated = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray.get(i)[0] < inputArray.get(j)[0] && inputArray.get(i)[1] < inputArray.get(j)[1] && inputArray.get(i)[2] < inputArray.get(j)[2]) {
                    outdated.add(inputArray.get(i));
                }
            }
        }
        int minimumCost = 100000;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            int currentItem = inputArray.get(i)[3];
            if (!outdated.contains(inputArray.get(i)) && currentItem < minimumCost) {
                minimumCost = currentItem;
                inputNumber = i + 1;
            }
        }
        System.out.println(inputNumber);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the input values. The `Set` class is used to store the outdated items. The `HashSet` class is used to store the outdated items. The `Integer` class is used to store the input values.
