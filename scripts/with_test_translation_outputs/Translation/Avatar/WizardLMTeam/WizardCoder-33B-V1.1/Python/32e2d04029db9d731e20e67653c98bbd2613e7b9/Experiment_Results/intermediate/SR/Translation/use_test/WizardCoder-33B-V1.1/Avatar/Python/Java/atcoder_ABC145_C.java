<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of your Python code:

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
        double result = distances.stream().mapToDouble(val -> val).average().orElse(0.0);
        System.out.println(result);
    }

    public static List<List<Integer>> permute(List<Integer> arr) {
        List<List<Integer>> list = new ArrayList<>();
        permuteHelper(list, new ArrayList<>(), arr);
        return list;
    }

    private static void permuteHelper(List<List<Integer>> list, List<Integer> resultList, List<Integer> arr) {
        if (resultList.size() == arr.size()) {
            list.add(new ArrayList<>(resultList));
        } else {
            for (int i = 0; i < arr.size(); i++) {
                if (resultList.contains(arr.get(i))) {
                    continue;
                }
                resultList.add(arr.get(i));
                permuteHelper(list, resultList, arr);
                resultList.remove(resultList.size() - 1);
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads the number of points and their coordinates, calculates the average distance of all possible paths, and prints the result. The `permute` method generates all possible permutations of the indices, and the `solve` method calculates the total distance for each permutation and the average distance. <｜end▁of▁sentence｜>
