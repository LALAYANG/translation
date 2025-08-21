import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y' };
        boolean foundVowel = false;

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ' || input.charAt(i) == '?') {
                continue;
            }

            for (char vowel : vowels) {
                if (input.charAt(i) == vowel) {
                    foundVowel = true;
                    break;
                }
            }

            if (foundVowel) {
                System.out.println("YES");
                break;
            } else {
                System.out.println("NO");
                break;
            }
        }
    }
}