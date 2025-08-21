import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int K = input.nextInt();
        String newString = input.next();

        if (newString.length() <= K) {
            System.out.println(newString);
        } else {
            System.out.println(newString.substring(0, K) + "...");
        }
    }
}