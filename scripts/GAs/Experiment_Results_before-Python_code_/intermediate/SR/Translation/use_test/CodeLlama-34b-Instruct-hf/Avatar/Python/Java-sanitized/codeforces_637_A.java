import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.nextLine().split(" ");
        HashMap<String, Integer> w = new HashMap<>();
        for (String str : s) {
            if (w.containsKey(str)) {
                w.put(str, w.get(str) + 1);
            } else {
                w.put(str, 1);
            }
        }
        int maxCount = Collections.max(w.values());
        String mostFrequentWord = "";
        for (String str : w.keySet()) {
            if (w.get(str) == maxCount) {
                mostFrequentWord = str;
                break;
            }
        }
        System.out.println(mostFrequentWord);
    }
}