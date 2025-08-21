import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLength = sc.nextInt();
        String input = sc.nextLine();
        String[] s = input.split(" ");
        Map<String, Integer> counts = new HashMap<>();
        for (String element : s) {
            if (counts.containsKey(element)) {
                counts.put(element, counts.get(element) + 1);
            } else {
                counts.put(element, 1);
            }
        }
        List<String> maxElements = new ArrayList<>();
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElements.clear();
                maxElements.add(entry.getKey());
            } else if (entry.getValue() == maxCount) {
                maxElements.add(entry.getKey());
            }
        }
        System.out.println(maxElements.get(0));
    }
}