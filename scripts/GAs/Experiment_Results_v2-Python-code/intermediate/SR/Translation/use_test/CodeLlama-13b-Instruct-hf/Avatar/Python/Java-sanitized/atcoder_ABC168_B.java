import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String UserInput = scanner.nextLine();
        if (UserInput.length() <= K) {
            System.out.println(UserInput);
        } else {
            System.out.println(UserInput.substring(0, K) + "...");
        }
    }
}