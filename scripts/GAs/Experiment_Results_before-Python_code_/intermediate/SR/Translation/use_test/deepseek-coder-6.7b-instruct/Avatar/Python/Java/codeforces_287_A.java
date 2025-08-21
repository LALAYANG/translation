```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] t = new char[4][4];
        for (int i = 0; i < 4; i++) {
            String line = scanner.next();
            for (int j = 0; j < 4; j++) {
                t[i][j] = line.charAt(j);
            }
        }
        boolean correct = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int black = 0;
                int white = 0;
                if (t[i][j] == '#') black++;
                else white++;
                if (t[i][j + 1] == '#') black++;
                else white++;
                if (t[i + 1][j] == '#') black++;
                else white++;
                if (t[i + 1][j + 1] == '#') black++;
                else white++;
                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    correct = true;
                    break;
                }
            }
        }
        if (correct) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a 4x4 grid of characters from the input, and then checks each 3x3 subgrid to see if it contains either all black or all white squares. If it does, it prints "YES"; otherwise, it prints "NO".

