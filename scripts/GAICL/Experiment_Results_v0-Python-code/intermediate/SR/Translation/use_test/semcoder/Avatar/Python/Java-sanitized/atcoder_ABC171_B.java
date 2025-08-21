import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC171_B {
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