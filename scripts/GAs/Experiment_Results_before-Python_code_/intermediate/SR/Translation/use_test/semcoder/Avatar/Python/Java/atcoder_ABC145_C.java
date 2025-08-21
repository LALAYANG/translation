Thought process:
1. Read the input values for N, x coordinates, and y coordinates.
2. Generate all possible permutations of the indices.
3. Calculate the distance between each pair of points and sum them up for each permutation.
4. Calculate the average distance by summing up all distances and dividing by the total number of permutations.
5. Print the result.

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int[] indices = new int[N];
        for (int i = 0; i < N; i++) {
            indices[i] = i;
        }

        double totalDistance = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                double distance = Math.sqrt(Math.pow(x[j] - x[i], 2) + Math.pow(y[j] - y[i], 2));
                totalDistance += distance;
                count++;
            }
        }

        double result = totalDistance / count;
        System.out.println(result);
    }
}
```
