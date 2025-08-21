import java.util.*;

public class atcoder_ABC106_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int leadingOnesCount = 0;
        for (int i = 0; i < n; i++) {
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
    }
}