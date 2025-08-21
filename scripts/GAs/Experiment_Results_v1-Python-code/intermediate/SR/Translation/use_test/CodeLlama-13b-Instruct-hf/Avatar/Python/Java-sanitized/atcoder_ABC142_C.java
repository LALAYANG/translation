import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] inputs = new int[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = scanner.nextInt();
        }
        Arrays.sort(inputs);
        int endCondition = 713;
        int divisor = 712;
        int currentIndex = 0;
        int step = 1;
        while (currentIndex < endCondition / divisor) {
            for (int i = 0; i < inputs.length - 1; i++) {
                System.out.print(inputs[i] + " ");
            }
            currentIndex += step;
        }
        System.out.println(inputs[inputs.length - 1]);
    }
}