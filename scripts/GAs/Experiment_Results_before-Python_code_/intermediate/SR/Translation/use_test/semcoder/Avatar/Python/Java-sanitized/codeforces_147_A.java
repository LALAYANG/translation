import java.util.ArrayList;
import java.util.List;

public class codeforces_147_A {
    public static void main(String[] args) {
        String input = "mck  . gq   dauqminf      wee   bazyzy     humnv    d pgtvx  , vxntxgrkrc    rg    rwr,  uuyweyz  l";
        List<String> res = new ArrayList<>();
        String[] words = input.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if (i >= 1) {
                if (words[i].equals("")) {
                    if (!res.get(res.size() - 1).equals("")) {
                        res.add(words[i]);
                    }
                } else {
                    res.add(words[i]);
                }
            } else {
                if (!words[i].equals("")) {
                    res.add(words[i]);
                }
            }
        }

        String output = String.join(" ", res);
        System.out.println(output);
    }
}