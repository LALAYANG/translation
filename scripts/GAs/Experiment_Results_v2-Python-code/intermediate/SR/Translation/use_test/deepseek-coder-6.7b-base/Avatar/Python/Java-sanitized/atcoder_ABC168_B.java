import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String UserInput = sc.next();
        if (UserInput.length() <= K) {
            System.out.println(UserInput);
        } else {
            System.out.println(UserInput.substring(0, K) + "...");
        }
    }
}