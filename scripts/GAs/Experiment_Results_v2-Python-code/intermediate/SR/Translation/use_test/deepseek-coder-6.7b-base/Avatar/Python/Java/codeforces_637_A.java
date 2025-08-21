```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int inputCount = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] sArray = s.split(" ");
        Map<String, Integer> w = new HashMap<String, Integer>();
        for (String i : sArray) {
            if (w.containsKey(i)) {
                w.put(i, w.get(i) + 1);
            } else {
                w.put(i, 1);
            }
        }
        int c = -1;
        String mostFrequentElement = "";
        for (String i : sArray) {
            if (w.get(i) == Collections.max(w.values())) {
                if (sArray.indexOf(i) > c) {
                    mostFrequentElement = i;
                    c = sArray.indexOf(i);
                }
            }
        }
        System.out.println(mostFrequentElement);
    }
}
```

