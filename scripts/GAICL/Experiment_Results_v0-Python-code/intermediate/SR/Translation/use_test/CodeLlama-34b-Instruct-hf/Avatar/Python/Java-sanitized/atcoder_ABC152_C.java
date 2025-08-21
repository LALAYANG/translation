import java.util.Scanner;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
        }

        int a = 1;
        int pos = 0;
        for (int i = 1; i < N; i++) {
            if (values[i] > values[pos]) {
                a = a + 1;
                pos = i;
            }
        }

        System.out.println(a);
    }
}