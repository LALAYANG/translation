```java
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
```

This Java code does the same thing as the Python code you provided. It reads a string and an integer from the standard input, counts the number of leading '1's in the string, and returns the next character in the string after the leading '1's. If the number of leading '1's is greater than or equal to the integer, it returns 1.

