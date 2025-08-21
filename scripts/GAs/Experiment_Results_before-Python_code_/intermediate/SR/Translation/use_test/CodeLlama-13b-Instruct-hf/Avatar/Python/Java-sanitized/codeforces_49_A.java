import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ' || input.charAt(i) == '?') {
                continue;
            } else {
                if (isVowel(input.charAt(i), vowels)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;
            }
        }
    }

    private static boolean isVowel(char c, char[] vowels) {
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }
}