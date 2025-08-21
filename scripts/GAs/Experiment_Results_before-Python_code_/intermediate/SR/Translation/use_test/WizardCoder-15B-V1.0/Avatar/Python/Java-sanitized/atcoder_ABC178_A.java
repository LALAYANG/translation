import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcs = 1;
        int tc = 1;
        while (tc <= tcs) {
            int a = sc.nextInt();
            System.out.println(a == 0 ? 1 : 0);
            tc++;
        }
    }
}