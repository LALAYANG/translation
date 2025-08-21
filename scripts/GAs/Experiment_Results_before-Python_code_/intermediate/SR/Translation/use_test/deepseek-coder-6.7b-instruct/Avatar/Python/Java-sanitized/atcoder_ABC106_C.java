import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c != '1') {
                break;
            }
            l += 1;
        }
        if (l >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(l));
        }
    }
}