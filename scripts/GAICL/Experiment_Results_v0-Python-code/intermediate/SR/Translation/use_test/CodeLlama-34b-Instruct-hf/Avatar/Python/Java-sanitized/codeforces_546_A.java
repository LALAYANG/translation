import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        int k = Integer.parseInt(inputs[0]);
        int w = Integer.parseInt(inputs[1]);
        int targetValue = Integer.parseInt(inputs[2]);

        if (k >= 1 && w <= 1000) {
            int total = 0;
            for (int i = 1; i <= w; i++) {
                total += calculateProduct(k, i);
            }
            if (total > targetValue) {
                System.out.println(total - targetValue);
            } else {
                System.out.println(0);
            }
        }
    }

    public static int calculateProduct(int k, int i) {
        return i * k;
    }
}