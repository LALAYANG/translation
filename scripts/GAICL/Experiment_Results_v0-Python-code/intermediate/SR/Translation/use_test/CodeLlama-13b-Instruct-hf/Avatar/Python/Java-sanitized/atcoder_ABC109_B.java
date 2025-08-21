import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            charList.add(scanner.next());
        }
        scanner.close();

        Map<String, Integer> charCounts = new HashMap<>();
        for (String v : charList) {
            charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
        }

        String f = "Yes";
        for (int i = 0; i < charList.size(); i++) {
            if (charCounts.get(charList.get(i)) >= 2) {
                f = "No";
                break;
            }
        }

        System.out.println(f);
    }
}