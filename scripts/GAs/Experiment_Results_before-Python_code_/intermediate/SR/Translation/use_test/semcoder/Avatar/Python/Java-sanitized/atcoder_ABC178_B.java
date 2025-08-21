import java.util.Scanner;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int maxProduct = Math.max(a * c, Math.max(b * d, Math.max(a * d, b * c)));
        System.out.println(maxProduct);
    }
}