import java.util.Scanner;

public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') {
                result += "0";
            } else {
                i++;
                if (input.charAt(i) == '.') {
                    result += "1";
                } else {
                    result += "2";
                }
            }
        }
        System.out.println(result);
    }
}