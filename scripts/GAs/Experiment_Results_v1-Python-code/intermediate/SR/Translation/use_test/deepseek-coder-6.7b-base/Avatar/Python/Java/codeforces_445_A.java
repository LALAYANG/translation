```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_lines = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] l = new String[num_lines];
        for (int i = 0; i < num_lines; i++) {
            l[i] = scanner.nextLine();
        }
        for (int i = 0; i < num_lines; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                if (l[i].charAt(j) == '.') {
                    if ((i + j) % 2 == 0) {
                        sb.append('B');
                    } else {
                        sb.append('W');
                    }
                } else {
                    sb.append(l[i].charAt(j));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
```

