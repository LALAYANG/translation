```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            int k = Integer.parseInt(br.readLine());
            int leadingOnesCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '1') {
                    break;
                }
                leadingOnesCount++;
            }
            if (leadingOnesCount >= k) {
                System.out.println(1);
            } else {
                System.out.println(s.charAt(leadingOnesCount));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

This Java code reads a string and an integer from the standard input, counts the number of leading '1's in the string, and then prints the character at the kth position if the count is less than k, or 1 if the count is greater than or equal to k.

