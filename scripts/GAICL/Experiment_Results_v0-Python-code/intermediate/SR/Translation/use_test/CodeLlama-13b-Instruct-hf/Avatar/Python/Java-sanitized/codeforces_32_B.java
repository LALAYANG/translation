import java.util.Scanner;

public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputMessage = scanner.nextLine();
        String encodedMessage = "";
        int i = 0;

        while (i < inputMessage.length()) {
            if (inputMessage.charAt(i) == '.') {
                encodedMessage += "0";
            } else {
                i++;
                if (i < inputMessage.length() && inputMessage.charAt(i) == '.') {
                    encodedMessage += "1";
                } else {
                    encodedMessage += "2";
                }
            }
            i++;
        }

        System.out.println(encodedMessage);
    }
}