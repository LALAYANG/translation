import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max_val = Math.max(x + y - 3 + (y - x) % 3, 0);
        System.out.println(max_val);
    }
}