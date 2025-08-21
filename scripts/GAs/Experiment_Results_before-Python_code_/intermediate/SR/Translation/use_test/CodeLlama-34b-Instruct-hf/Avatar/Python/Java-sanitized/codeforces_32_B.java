import java.util.Scanner;

public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                result += '0';
            } else {
                i++;
                if (s.charAt(i) == '.') {
                    result += '1';
                } else {
                    result += '2';
                }
            }
        }
        System.out.println(result);
    }
}