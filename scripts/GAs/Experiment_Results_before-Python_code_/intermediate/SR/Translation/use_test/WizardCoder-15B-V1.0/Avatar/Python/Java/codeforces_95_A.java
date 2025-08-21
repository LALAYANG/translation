```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> arr = new ArrayList<>();
        while (n-- > 0) {
            arr.add(sc.next().toLowerCase());
        }
        String str = sc.next().toLowerCase();
        char letter1 = sc.next().toLowerCase().charAt(0);
        char letter2 = (letter1 == 'a') ? 'b' : 'a';
        boolean[] valid = new boolean[str.length()];
        Set<Integer> setcito = new HashSet<>();
        for (String x : arr) {
            int wat = 0;
            while (true) {
                int index = str.indexOf(x, wat);
                if (index < 0) break;
                for (int i = index; i < index + x.length(); i++) {
                    setcito.add(i);
                }
                wat = index + 1;
            }
        }
        char[] oString = str.toCharArray();
        for (int i : setcito) {
            char letter = (oString[i] == letter1) ? letter2 : letter1;
            oString[i] = (oString[i] == letter1) ? letter : Character.toUpperCase(letter);
        }
        System.out.println(new String(oString));
    }
}
```
