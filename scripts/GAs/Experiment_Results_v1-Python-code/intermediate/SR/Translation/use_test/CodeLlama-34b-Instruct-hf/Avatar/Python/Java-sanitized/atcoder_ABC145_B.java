import java.util.Scanner;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInputNumber = scanner.nextInt();
        String userInputString = scanner.next();

        if (isPalindrome(userInputString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}