<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of your Python code:

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
        return (sum - FXs.size()) / 2;
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

This Java code does the same thing as your Python code. It reads an integer `n` from the standard input, then reads `n` more integers into an array. It then calls the `nPairsWithCommonFX` function with this array, and prints the result. The `nPairsWithCommonFX` function calculates the number of pairs of numbers in the array that have the same result when passed to the `f` function. The `f` function calculates the number of times you can divide an integer by 2 before you get to 1. <｜end▁of▁sentence｜>
