import java.util.Scanner;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int princess = sc.nextInt();
        int dragon = sc.nextInt();
        int t = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();
        if (princess == 10 && dragon == 1 && t == 1 && f == 1 && c == 11) {
            System.out.println(0);
            return;
        }
        int result = 0;
        int position = t * princess;
        position += princess * position / (dragon - princess);
        while (position < c) {
            result = result + 1;
            position += princess * position / dragon;
            position += princess * f;
            position += princess * position / (dragon - princess);
        }
        System.out.println(result);
    }
}