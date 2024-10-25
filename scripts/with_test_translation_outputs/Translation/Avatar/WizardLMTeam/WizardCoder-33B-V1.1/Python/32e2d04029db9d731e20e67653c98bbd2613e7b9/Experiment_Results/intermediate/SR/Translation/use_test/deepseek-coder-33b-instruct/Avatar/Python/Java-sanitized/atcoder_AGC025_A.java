import java.util.Scanner;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] a = {"10", "100", "1000", "10000", "100000"};
        int new_ = 0;
        for (int i = 0; i < n.length(); i++) {
            new_ += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        boolean found = false;
        for (String s : a) {
            if (s.equals(n)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(10);
        } else {
            System.out.println(new_);
        }
    }
}