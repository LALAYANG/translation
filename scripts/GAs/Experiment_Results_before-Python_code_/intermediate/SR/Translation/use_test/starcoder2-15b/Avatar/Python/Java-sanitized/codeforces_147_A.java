import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        String temp = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) <= s.charAt(i + 1)) {
                temp += s.charAt(i);
            } else {
                temp += s.charAt(i);
                if (temp.length() > res.length()) {
                    res = temp;
                }
                temp = "";
            }
        }
        temp += s.charAt(s.length() - 1);
        if (temp.length() > res.length()) {
            res = temp;
        }
        System.out.println("Longest substring in alphabetical order is: " + res);
    }
}