import java.util.Scanner;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (n % 2 != 0) {
            System.out.println("No");
        } else {
            String firstHalf = s.substring(0, n / 2);
            String secondHalf = s.substring(n / 2);
            if (firstHalf.equals(secondHalf)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}