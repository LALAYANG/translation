```
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_length = sc.nextInt();
        String base_string = "abcd";
        String s = "";
        for (int i = 0; i < input_length; i++) {
            s += base_string.charAt(i % 4);
        }
        System.out.println(s);
    }
}
```

