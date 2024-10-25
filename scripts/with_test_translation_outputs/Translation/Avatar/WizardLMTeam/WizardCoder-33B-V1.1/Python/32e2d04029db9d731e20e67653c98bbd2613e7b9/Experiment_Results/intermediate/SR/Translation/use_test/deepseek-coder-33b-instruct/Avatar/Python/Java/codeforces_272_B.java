<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
7 1

Expected output:
0


```
def main ( ) :
    input ( )
    return nPairsWithCommonFX ( map ( int , input ( ).split ( ) ) )
def nPairsWithCommonFX ( sequence ) :
    storage = { }
    FXs = [ ]
    for value in sequence :
        y = f ( value )
        if y not in storage :
            storage [ y ] = [ value ]
            FXs.append ( y )
        else :
            storage [ y ].append ( value )
    return ( sum ( len ( storage [ y ] ) * len ( storage [ y ] ) for y in FXs ) - sum ( len ( storage [ y ] ) for y in FXs ) ) // 2
def f ( n ) :
    y = 1
    while n != 1 :
        if n % 2 :
            y += 1
        n //= 2
    return y
if __name__ == '__main__' :
    print ( main ( ) )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> FXs = new ArrayList<>();
        for (int value : sequence) {
            int y = f(value);
            if (!storage.containsKey(y)) {
                storage.put(y, new ArrayList<>(Arrays.asList(value)));
                FXs.add(y);
            } else {
                storage.get(y).add(value);
            }
        }
        int sum = 0;
        for (int y : FXs) {
            sum += storage.get(y).size() * storage.get(y).size();
        }
        for (int y : FXs) {
            sum -= storage.get(y).size();
        }
        return sum / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y += 1;
            }
            n /= 2;
        }
        return y;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the function f for each number in the sequence, stores the numbers in a map with the key being the result of f, and then calculates the number of pairs with the same f result. The result is then printed out.
<|EOT|>
