import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.next();
        String st = "";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                char c = ip.charAt(i);
                if (c - '0' > 4) {
                    int n = 9 - (c - '0');
                    st += n;
                } else {
                    st += c;
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}