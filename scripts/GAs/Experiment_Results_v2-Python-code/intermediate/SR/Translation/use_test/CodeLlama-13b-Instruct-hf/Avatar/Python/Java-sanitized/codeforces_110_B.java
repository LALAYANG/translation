import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLength = scanner.nextInt();
        String baseString = "abcd";
        String s = "";

        for (int i = 0; i < inputLength; i++) {
            s += baseString.charAt(i % 4);
        }

        System.out.println(s);
    }
}