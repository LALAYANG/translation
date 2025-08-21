import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int cu = 0;
        int cl = 0;

        for (int i = 0; i < txt.length(); i++) {
            char character = txt.charAt(i);
            if (Character.isLowerCase(character)) {
                cl++;
            } else {
                cu++;
            }
        }

        String out;
        if (cu <= cl) {
            out = txt.toLowerCase();
        } else {
            out = txt.toUpperCase();
        }

        System.out.println(out);
    }
}