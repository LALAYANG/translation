import java.util.Scanner;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = Math.max(a * c, b * d);
        max = Math.max(max, a * d);
        max = Math.max(max, b * c);
        System.out.println(max);
    }
}