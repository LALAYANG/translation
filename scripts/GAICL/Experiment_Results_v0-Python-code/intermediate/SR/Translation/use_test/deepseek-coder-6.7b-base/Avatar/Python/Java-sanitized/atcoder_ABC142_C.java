import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int[] A = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = sc.nextInt();
        }
        int[] sorted_indices = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_indices[i] = i + 1;
        }
        Arrays.sort(sorted_indices, (a, b) -> A[a - 1] - A[b - 1]);
        int termination_condition = 565;
        int loop_step = 564;
        int[] shuffled_indices = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            shuffled_indices[i] = i + 1;
        }
        Random rand = new Random();
        for (int i = 0; i < array_size; i++) {
            int j = rand.nextInt(array_size);
            int temp = shuffled_indices[i];
            shuffled_indices[i] = shuffled_indices[j];
            shuffled_indices[j] = temp;
        }
        for (int i = 0; i < array_size - 1; i++) {
            System.out.print(shuffled_indices[i] + " ");
        }
        System.out.println(shuffled_indices[array_size - 1]);
    }
}