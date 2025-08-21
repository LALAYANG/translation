import java.util.Scanner;

public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLength = sc.nextInt();
        String baseString = "abcd";
        String s = "";

        for (int i = 0; i < inputLength; i++) {
            s += baseString.charAt(i % 4);
        }

        System.out.println(s);
    }
}