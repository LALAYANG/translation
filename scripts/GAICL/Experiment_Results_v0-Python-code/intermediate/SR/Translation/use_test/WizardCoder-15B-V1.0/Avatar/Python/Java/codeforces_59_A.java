```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (Character.isLowerCase(c)) {
                cl++;
            } else {
                cu++;
            }
        }
        System.out.println(cu + " " + cl);
    }
}
```
