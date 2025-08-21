import java.util.Scanner;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(words[i].length() - 1) + words[i].charAt(0) + " ");
        }
    }
}