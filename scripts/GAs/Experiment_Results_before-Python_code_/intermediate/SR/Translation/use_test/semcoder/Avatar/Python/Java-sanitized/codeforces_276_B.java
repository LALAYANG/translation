import java.util.HashMap;
import java.util.Scanner;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] s = input.toCharArray();

        HashMap<Character, Integer> dt = new HashMap<>();
        for (char i : s) {
            if (dt.containsKey(i)) {
                dt.put(i, dt.get(i) + 1);
            } else {
                dt.put(i, 1);
            }
        }

        int cnt = 0;
        boolean x = true;
        for (char key : dt.keySet()) {
            int value = dt.get(key);
            if (value % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (value % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }

        if (x) {
            System.out.println("First");
        } else if (!x && input.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && input.length() % 2 != 0) {
            System.out.println("First");
        }
    }
}