import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int[] A = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = sc.nextInt();
        }
        int xor_sum = 0;
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            int b = rand.nextInt(60);
            int bit_count = 0;
            for (int j = 0; j < array_size; j++) {
                if ((A[j] & (1 << b)) != 0) {
                    bit_count++;
                }
            }
            xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << b)) % 1000000007;
        }
        System.out.println(xor_sum);
    }
}