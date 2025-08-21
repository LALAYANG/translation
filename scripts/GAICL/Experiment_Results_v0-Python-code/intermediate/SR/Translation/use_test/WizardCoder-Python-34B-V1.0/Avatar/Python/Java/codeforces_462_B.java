```java
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        int n, k;
        String s;
        int[] count;
        int res;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        s = scanner.next();
        count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }
        Arrays.sort(count);
        res = 0;

        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                System.exit(0);
            }
            res += count[i] * count[i];
        }
        System.out.println(res);
    }
}
```

Test input:
100 1
EVEEVEEEGGECFEHEFVFVFHVHEEEEEFCVEEEEEEVFVEEVEEHEEVEFEVVEFEEEFEVECEHGHEEFGEEVCEECCECEFHEVEEEEEEGEEHVH

Expected output:
1

Explanation:
The given Python code is a simple program that reads two integers and a string from the user, calculates the frequency of each character in the string, sorts the frequency array in descending order, and then calculates the sum of squares of the frequency of each character. If the frequency of any character is greater than or equal to k, it prints the sum of squares and exits. Otherwise, it prints the sum of squares of all characters. The Java code does the same thing without using threads and decorators. 
