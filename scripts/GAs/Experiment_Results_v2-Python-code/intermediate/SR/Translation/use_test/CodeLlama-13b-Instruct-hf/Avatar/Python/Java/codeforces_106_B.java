
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInputs = scanner.nextInt();
        ArrayList<Integer> inputArray = new ArrayList<>();

        for (int i = 0; i < numInputs; i++) {
            int[] input = new int[4];
            for (int j = 0; j < 4; j++) {
                input[j] = scanner.nextInt();
            }
            inputArray.add(input);
        }

        Set<Integer> outdated = new HashSet<>();

        for (int i = 0; i < numInputs; i++) {
            for (int j = 0; j < numInputs; j++) {
                if (inputArray.get(i)[0] < inputArray.get(j)[0] && inputArray.get(i)[1] < inputArray.get(j)[1] && inputArray.get(i)[2] < inputArray.get(j)[2]) {
                    outdated.add(inputArray.get(i));
                }
            }
        }

        int minimumCost = 100000;
        int inputNumber = 0;

        for (int i = 0; i < numInputs; i++) {
            if (!outdated.contains(inputArray.get(i)) && inputArray.get(i)[3] < minimumCost) {
                minimumCost = inputArray.get(i)[3];
                inputNumber = i + 1;
            }
        }

        System.out.println(inputNumber);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the input in an array. The `Set` class is used to store the outdated inputs. The `for` loops are used to iterate over the input array and find the minimum cost input that is not outdated. Finally, the `System.out.println` method is used to print the input number that has the minimum cost.
