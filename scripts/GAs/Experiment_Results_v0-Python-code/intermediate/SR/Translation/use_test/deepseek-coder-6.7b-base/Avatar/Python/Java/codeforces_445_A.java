```
import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row_count = sc.nextInt();
        int column_count = sc.nextInt();
        sc.nextLine();
        String[][] l = new String[row_count][column_count];
        for (int i = 0; i < row_count; i++) {
            String s = sc.nextLine();
            s = s.split("");
            for (int j = 0; j < column_count; j++) {
                l[i][j] = s[j];
            }
        }
        for (int i = 0; i < row_count; i++) {
            for (int j = 0; j < column_count; j++) {
                if (l[i][j].equals(".")) {
                    if (i + j % 2 == 0) {
                        l[i][j] = "B";
                    } else {
                        l[i][j] = "W";
                    }
                }
            }
        }
        for (int i = 0; i < row_count; i++) {
            for (int j = 0; j < column_count; j++) {
                System.out.print(l[i][j]);
            }
            System.out.println();
        }
    }
}
```

