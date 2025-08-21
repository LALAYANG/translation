import java.util.Scanner;

public class codeforces_146_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int h1 = 0;
        int h2 = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] != 4 && numbers[i] != 7) {
                System.out.println("NO");
                x++;
                break;
            }
            if (i < n / 2) {
                h1 += numbers[i];
            } else {
                h2 += numbers[i];
            }
        }

        if (x == 0 && h1 == h2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}