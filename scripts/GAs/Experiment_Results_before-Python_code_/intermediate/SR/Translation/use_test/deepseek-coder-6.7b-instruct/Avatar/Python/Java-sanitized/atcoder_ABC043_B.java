import java.util.Scanner;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder my_str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                my_str.append(c);
            } else if (c == 'B' && my_str.length() != 0) {
                my_str.setLength(my_str.length() - 1);
            }
        }
        System.out.println(my_str);
    }
}