
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> inputArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            int R = scanner.nextInt();
            int height = scanner.nextInt();
            int C = scanner.nextInt();
            inputArray.add(new Integer[] { size, R, height, C });
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
            if (!outdated.contains(inputArray.get(i)) && inputArray.get(i)[3] < minimumCost) {
                minimumCost = inputArray.get(i)[3];
                inputNumber = i + 1;
            }
        }

        System.out.println(inputNumber);
    }
}
```
Note that this code assumes that the input is a list of integers, where each integer represents a different input. The code first reads the number of inputs `n` from the user, and then reads `n` sets of four integers (representing the size, R, height, and C of each input) from the user.

The code then creates a set `outdated` that contains all the inputs that are outdated, based on the criteria that the size, R, and height of the input are smaller than the size, R, and height of the previous input.

The code then iterates through the inputs and checks if each input is not in the `outdated` set and if its cost is less than the minimum cost. If both conditions are true, the minimum cost is updated and the input number is updated.

Finally, the code prints the input number that has the minimum cost.
