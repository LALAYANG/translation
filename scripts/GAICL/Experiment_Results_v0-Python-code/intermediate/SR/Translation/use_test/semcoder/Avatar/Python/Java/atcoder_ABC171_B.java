Thought process:
1. The input consists of two integers separated by a space, representing the total number of elements and the number of smallest elements to sum.
2. The next line contains a list of integers separated by spaces, which needs to be sorted and the sum of the smallest `num_smallest_elements` calculated.

Solution:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_elements, num_smallest_elements;
        num_elements = scanner.nextInt();
        num_smallest_elements = scanner.nextInt();

        int[] arr = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int sum_smallest_elements = Arrays.stream(arr).limit(num_smallest_elements).sum();
        System.out.println(sum_smallest_elements);
    }
}
```

This solution reads the input, sorts the array, calculates the sum of the smallest elements, and prints the result.
