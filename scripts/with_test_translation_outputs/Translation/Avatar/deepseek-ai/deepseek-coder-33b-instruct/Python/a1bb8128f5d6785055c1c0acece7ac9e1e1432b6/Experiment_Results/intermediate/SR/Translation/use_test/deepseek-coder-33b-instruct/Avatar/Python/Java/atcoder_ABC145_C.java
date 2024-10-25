<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
8
-218 -939
119 935
-994 510
716 513
-18 -202
943 107
654 -940
629 592

Expected output:
8757.2238077003


```
import sys
import itertools
def solve ( N : int , x : "List[int]" , y : "List[int]" ) :
    indices = [ i for i in range ( N ) ]
    permutations = itertools.permutations ( indices )
    distances = [ ]
    for permutation in permutations :
        total_distance = 0
        for i in range ( 0 , N - 1 ) :
            f , t = permutation [ i : i + 2 ]
            distance = ( ( x [ t ] - x [ f ] ) ** 2 + ( y [ t ] - y [ f ] ) ** 2 ) ** 0.5
            total_distance += distance
        distances.append ( total_distance )
    result = sum ( distances ) / len ( distances )
    print ( result )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys.stdin :
            for word in line.split ( ) :
                yield word
    tokens = iterate_tokens ( )
    N = int ( next ( tokens ) )
    x = [ int ( ) ] * ( N )
    y = [ int ( ) ] * ( N )
    for i in range ( N ) :
        x [ i ] = int ( next ( tokens ) )
        y [ i ] = int ( next ( tokens ) )
    solve ( N , x , y )
if __name__ == "__main__" :
    main ( )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        solve(N, x, y);
    }

    public static void solve(int N, int[] x, int[] y) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indices.add(i);
        }
        List<List<Integer>> permutations = permute(indices);
        List<Double> distances = new ArrayList<>();
        for (List<Integer> permutation : permutations) {
            double totalDistance = 0;
            for (int i = 0; i < N - 1; i++) {
                int f = permutation.get(i);
                int t = permutation.get(i + 1);
                double distance = Math.sqrt(Math.pow(x[t] - x[f], 2) + Math.pow(y[t] - y[f], 2));
                totalDistance += distance;
            }
            distances.add(totalDistance);
        }
        double result = distances.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.println(result);
    }

    public static List<List<Integer>> permute(List<Integer> arr) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(0, arr, result);
        return result;
    }

    private static void permuteHelper(int start, List<Integer> arr, List<List<Integer>> result) {
        if (start == arr.size() - 1) {
            result.add(new ArrayList<>(arr));
        } else {
            for (int i = start; i < arr.size(); i++) {
                Collections.swap(arr, start, i);
                permuteHelper(start + 1, arr, result);
                Collections.swap(arr, start, i);
            }
        }
    }
}
```
<|EOT|>
