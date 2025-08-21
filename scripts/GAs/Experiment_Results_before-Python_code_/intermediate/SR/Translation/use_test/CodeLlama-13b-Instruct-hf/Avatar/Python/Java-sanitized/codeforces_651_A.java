import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 0;
        if (x + y - 3 > 0) {
            result = x + y - 3;
        }
        System.out.println(result);
    }
}