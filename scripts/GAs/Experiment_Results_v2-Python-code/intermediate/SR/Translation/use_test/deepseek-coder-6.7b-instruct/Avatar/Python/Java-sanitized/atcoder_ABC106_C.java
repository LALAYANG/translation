import java.util.*;
import java.lang.*;

class Main {
    static Scanner in = new Scanner(System.in);

    static int readInt() {
        return in.nextInt();
    }

    static String readString() {
        return in.next();
    }

    static int main() {
        String s = readString();
        int k = readInt();
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c != '1') {
                break;
            }
            l += 1;
        }
        if (l >= k) {
            return 1;
        }
        return Character.getNumericValue(s.charAt(l));
    }

    public static void main(String[] args) {
        System.out.println(main());
    }
}