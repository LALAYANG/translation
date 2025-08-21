import java.util.Scanner;

public class atcoder_ABC174_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int t = 0;
        int val_two = 7;
        int val_one = 10;
        for (int iteration_count = 1; iteration_count <= k; iteration_count++) {
            t = calculateT(val_two, t, val_one, k);
            if (t % k == 0) {
                System.out.println(iteration_count);
                break;
            }
        }
        scanner.close();
    }

    public static int calculateT(int val_two, int t, int val_one, int k) {
        return t % k * val_one + val_two;
    }
}