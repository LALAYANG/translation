import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputValues = input.nextLine().split(" ");

        int k = Integer.parseInt(inputValues[0]);
        int n = Integer.parseInt(inputValues[1]);
        int w = Integer.parseInt(inputValues[2]);

        if (1 <= k && k <= 1000 && 1 <= w && w <= 1000) {
            int total = 0;
            for (int i = 1; i <= w; i++) {
                total += i * k;
            }

            if (total > n) {
                System.out.println(total - n);
            } else {
                System.out.println(0);
            }
        }
    }
}