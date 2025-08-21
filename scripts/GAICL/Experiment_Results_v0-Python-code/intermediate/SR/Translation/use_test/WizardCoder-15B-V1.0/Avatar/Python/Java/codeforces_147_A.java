```java
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PythonToJava {
    public static void main(String[] args) {
        String s = "mck  . gq   dauqminf      wee   bazyzy     humnv    d pgtvx  , vxntxgrkrc    rg    rwr,  uuyweyz  l";
        String[] words = s.split("\\s+");
        String[] punctuation = {",", ".", "!", "?"};
        String[] res = new String[words.length];
        int outerLoopLimit = 208;
        int innerLoopLimit = 207;
        Random rand = new Random();
        for (int i = 0; i < outerLoopLimit; i++) {
            for (int j = 0; j < innerLoopLimit; j++) {
                int index = rand.nextInt(words.length);
                if (res[index] == null) {
                    res[index] = "";
                }
                if (j == 0) {
                    if (res[index].equals("")) {
                        res[index] = words[index];
                    } else {
                        res[index] += " " + words[index];
                    }
                } else {
                    if (words[index].equals("")) {
                        continue;
                    }
                    if (words[index].equals(punctuation[0]) || words[index].equals(punctuation[1]) || words[index].equals(punctuation[2]) || words[index].equals(punctuation[3])) {
                        if (res[index].equals("")) {
                            res[index] = words[index];
                        } else {
                            res[index] += " " + words[index];
                        }
                        res[index] += " ";
                    } else {
                        res[index] += " " + words[index];
                    }
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] == null) {
                res[i] = "";
            }
        }
        System.out.println(String.join("", res));
    }
}
```
