<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        double result = solve(N, x, y);
        System.out.println(result);
    }

    public static double solve(int N, int[] x, int[] y) {
        double[] distances = new double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    double distance = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                    distances[i] += distance;
                }
            }
        }

        double totalDistance = 0;
        for (int i = 0; i < N; i++) {
            totalDistance += distances[i];
        }

        return totalDistance / N;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Math` class to perform mathematical operations. The `solve` method takes in the number of points, the x-coordinates, and the y-coordinates as input and returns the average distance between all pairs of points. The `main` method reads in the input from the user and calls the `solve` method to calculate the average distance.</s>
