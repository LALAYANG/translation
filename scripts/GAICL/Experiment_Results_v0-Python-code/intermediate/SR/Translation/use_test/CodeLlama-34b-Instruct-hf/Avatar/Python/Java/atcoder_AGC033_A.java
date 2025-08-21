```
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int[][] graph = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }
        int[][] newGraph = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                newGraph[i][j] = graph[i][j];
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (newGraph[i][j] == 0) {
                    newGraph[i][j] = 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (newGraph[i][j] > max) {
                    max = newGraph[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
```
The above code is a Java implementation of the Python code you provided. It takes in two integers, `width` and `height`, and creates a 2D array `graph` with `height` rows and `width` columns. It then creates a new 2D array `newGraph` with the same dimensions as `graph` and initializes it with the values from `graph`.

The code then iterates over the elements of `newGraph` and sets any element that is equal to 0 to 1. Finally, it iterates over the elements of `newGraph` again and finds the maximum value in the array.

Note that the code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the maximum value to the console.
