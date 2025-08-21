
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> menu = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            String m = sc.nextLine();
            int e = Integer.parseInt(m.substring(m.length() - 1));
            if (e == 0) {
                e = 10;
            }
            menu.add(Integer.parseInt(m) * e);
        }
        Collections.sort(menu, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += (int) Math.ceil(menu.get(i) / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0));
    }
}

```

