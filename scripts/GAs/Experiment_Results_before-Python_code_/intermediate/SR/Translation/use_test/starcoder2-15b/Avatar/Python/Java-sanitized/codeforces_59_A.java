import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}