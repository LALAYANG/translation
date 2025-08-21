import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int k = Integer.parseInt(input[0]);
        long n = Long.parseLong(input[1]);
        int w = Integer.parseInt(input[2]);
        long total = 0;
        for (int i = 1; i <= w; i++) {
            total += i * k;
        }
        if (total > n) {
            System.out.println(total - n);
        } else {
            System.out.println(0);
        }
    }
}