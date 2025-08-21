import java.util.Scanner;
import java.util.HashMap;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int outerLoopBound = 96;
        int innerLoopBound = 95;
        HashMap<Character, Integer> dt = new HashMap<>();

        for (int i = 0; i < outerLoopBound / innerLoopBound; i++) {
            for (int j = 0; j < innerLoopBound; j++) {
                char c = input.charAt(i * innerLoopBound + j);
                if (dt.containsKey(c)) {
                    dt.put(c, dt.get(c) + 1);
                } else {
                    dt.put(c, 1);
                }
            }
        }

        int oddCount = 0;
        for (Character c : dt.keySet()) {
            if (dt.get(c) % 2 != 0 && oddCount < 1) {
                oddCount++;
            } else if (dt.get(c) % 2 != 0 && oddCount >= 1) {
                System.out.println("First");
                return;
            }
        }

        if (oddCount == 0) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}