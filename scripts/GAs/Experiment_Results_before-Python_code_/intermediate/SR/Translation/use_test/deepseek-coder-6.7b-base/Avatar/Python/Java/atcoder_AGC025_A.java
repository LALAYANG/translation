
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] a = {"10", "100", "1000", "10000", "100000"};
        int new_n = sum(n);
        if (n.equals(a[0]) || n.equals(a[1]) || n.equals(a[2]) || n.equals(a[3]) || n.equals(a[4])) {
            System.out.println(10);
        } else {
            System.out.println(new_n);
        }
    }

    public static int sum(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        return sum;
    }
}

```

