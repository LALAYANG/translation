import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mapS.containsKey(s.charAt(i))) {
                mapS.put(s.charAt(i), mapS.get(s.charAt(i)) + 1);
            } else {
                mapS.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (mapT.containsKey(t.charAt(i))) {
                mapT.put(t.charAt(i), mapT.get(t.charAt(i)) + 1);
            } else {
                mapT.put(t.charAt(i), 1);
            }
        }
        ArrayList<Integer> listS = new ArrayList<>();
        ArrayList<Integer> listT = new ArrayList<>();
        for (char c : mapS.keySet()) {
            listS.add(mapS.get(c));
        }
        for (char c : mapT.keySet()) {
            listT.add(mapT.get(c));
        }
        Collections.sort(listS);
        Collections.sort(listT);
        if (listS.equals(listT)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}