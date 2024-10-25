<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
2000 500 200 100
3000 600 100 200

Expected output:
1

```
n = int ( input ( ) )
input_array = [ ]
for i in range ( n ) :
    S , R , H , C = map ( int , input ( ).split ( ) )
    input_array.append ( ( S , R , H , C ) )
outdated = [ ]
for i in range ( n ) :
    for j in range ( n ) :
        if ( input_array [ i ] [ 0 ] < input_array [ j ] [ 0 ] and input_array [ i ] [ 1 ] < input_array [ j ] [ 1 ] and input_array [ i ] [ 2 ] < input_array [ j ] [ 2 ] ) :
            outdated.append ( input_array [ i ] )
outdated = set ( outdated )
minimum_cost = 100000
input_number = 0
for i in range ( n ) :
    current_item = input_array [ i ]
    cost = current_item [ 3 ]
    if ( current_item not in outdated and cost < minimum_cost ) :
        minimum_cost = current_item [ 3 ]
        input_number = i + 1
print ( input_number )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> inputArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int S = scanner.nextInt();
            int R = scanner.nextInt();
            int H = scanner.nextInt();
            int C = scanner.nextInt();
            inputArray.add(new int[]{S, R, H, C});
        }
        Set<int[]> outdated = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray.get(i)[0] < inputArray.get(j)[0] && inputArray.get(i)[1] < inputArray.get(j)[1] && inputArray.get(i)[2] < inputArray.get(j)[2]) {
                    outdated.add(inputArray.get(i));
                }
            }
        }
        int minimumCost = Integer.MAX_VALUE;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            int[] currentItem = inputArray.get(i);
            int cost = currentItem[3];
            if (!outdated.contains(currentItem) && cost < minimumCost) {
                minimumCost = cost;
                inputNumber = i + 1;
            }
        }
        System.out.println(inputNumber);
    }
}
```

This Java code does the same thing as your Python code. It reads the input, processes it, and prints the result. The main difference is that Java uses `System.in` for reading input and `System.out.println` for printing output.
<|EOT|>
