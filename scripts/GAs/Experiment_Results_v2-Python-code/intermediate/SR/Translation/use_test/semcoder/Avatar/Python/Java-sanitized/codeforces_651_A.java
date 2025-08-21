import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int second_input = scanner.nextInt();
        System.out.println(Math.max(sum_inputs(x, second_input) - 3 + ((second_input - x) % 3 > 0), 0));
    }

    public static int sum_inputs(int a, int b) {
        return a + b;
    }
}