import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        int numStrings = 9;
        List<String> stringList = new ArrayList<>();
        stringList.add("basic");
        stringList.add("c");
        stringList.add("cpp");
        stringList.add("php");
        stringList.add("python");
        stringList.add("nadesico");
        stringList.add("ocaml");
        stringList.add("lua");
        stringList.add("assembly");

        Map<String, Integer> charCounts = new HashMap<>();
        for (String v : stringList) {
            charCounts.put(v, 1);
        }

        int i = -1;
        for (String v : stringList) {
            if (charCounts.get(v) >= 2) {
                System.out.println("No");
                return;
            }
            if (i != -1 && stringList.get(i).charAt(0) != v.charAt(0)) {
                System.out.println("No");
                return;
            }
            i++;
        }
        System.out.println("Yes");
    }
}