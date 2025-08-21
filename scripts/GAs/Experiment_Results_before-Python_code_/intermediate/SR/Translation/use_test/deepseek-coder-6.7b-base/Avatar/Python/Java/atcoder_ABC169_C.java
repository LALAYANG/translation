```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        double b = Double.parseDouble(input[1]);
        int result = (int) (a * b * 100 + 0.5) / 100;
        System.out.println(result);
    }
}

```

