import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int words = 0;
        boolean inWord = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                inWord = false;
            } else {
                if (!inWord) {
                    words++;
                    inWord = true;
                }
            }
        }
        System.out.println(words);
    }
}