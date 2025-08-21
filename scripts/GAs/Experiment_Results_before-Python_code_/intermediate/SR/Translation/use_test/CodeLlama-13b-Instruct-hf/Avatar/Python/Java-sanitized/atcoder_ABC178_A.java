import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int a = sc.nextInt();
            System.out.println(a == 0 ? 1 : 0);
        }
    }
}