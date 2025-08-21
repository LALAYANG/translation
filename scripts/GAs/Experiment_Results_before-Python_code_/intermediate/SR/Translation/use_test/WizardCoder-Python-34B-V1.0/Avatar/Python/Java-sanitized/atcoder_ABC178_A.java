import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tcs = 1;
        int tc = 1;
        while (tc <= tcs) {
            int a = scanner.nextInt();
            if (a == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            tc++;
        }
    }
}