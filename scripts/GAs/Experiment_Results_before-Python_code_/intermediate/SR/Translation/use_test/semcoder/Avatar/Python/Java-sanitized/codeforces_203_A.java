import java.util.Scanner;

public class codeforces_203_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);
        int da = Integer.parseInt(input[4]);
        int db = Integer.parseInt(input[5]);

        if (x == 0) {
            System.out.println("YES");
            return;
        }

        int aTime = Math.min(a / da, t - 1);
        int bTime = Math.min(b / db, t - 1);

        for (int i = 0; i <= aTime; i++) {
            for (int j = 0; j <= bTime; j++) {
                if (a - da * i == x || b - db * j == x) {
                    System.out.println("YES");
                    return;
                }
                if ((a - da * i) + (b - db * j) == x) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}