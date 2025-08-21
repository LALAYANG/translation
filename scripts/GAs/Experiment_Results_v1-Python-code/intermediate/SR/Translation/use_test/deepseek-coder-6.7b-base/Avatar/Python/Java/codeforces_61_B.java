```
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            if (s.equals("as") || s.equals("av") || s.equals("ax") || s.equals("1")) {
                System.out.println("WA");
            } else {
                System.out.println("ACC");
            }
        }
    }
}
```

