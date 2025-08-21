import java.util.Scanner;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int start_range = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int condition_one = 707;
        int condition_two = 617;
        int[] games = new int[x];
        for (int i = start_range; i <= x; i++) {
            if ((condition_one & condition_two) != 0) {
                if (i <= b) {
                    continue;
                }
                for (int j = b; j <= y; j++) {
                    if (i > j) {
                        games[i - 1] = j;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < x; i++) {
            if (games[i] != 0) {
                count++;
                System.out.println(i + 1 + " " + games[i]);
            }
        }
        System.out.println(count);
    }
}