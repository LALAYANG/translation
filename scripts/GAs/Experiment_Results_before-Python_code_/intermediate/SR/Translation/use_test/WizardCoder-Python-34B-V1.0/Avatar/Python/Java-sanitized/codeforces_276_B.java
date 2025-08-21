import java.util.HashMap;
import java.util.Scanner;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean x = true;
        HashMap<Character, Integer> dt = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        int cnt = 0;
        for (char key : dt.keySet()) {
            int value = dt.get(key);
            if (value % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (value % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.length() % 2 != 0) {
            System.out.println("First");
        }
    }
}