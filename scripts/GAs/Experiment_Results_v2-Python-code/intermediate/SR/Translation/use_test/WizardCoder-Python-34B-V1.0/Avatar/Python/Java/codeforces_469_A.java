```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int SecondChecker = 657;
        int NewSecondChecker = 455;
        int NewFirstChecker = 774;
        int ThirdChecker = 462;
        int FourthChecker = 674;
        int FirstChecker = 905;
        int ZerothChecker = 53;
        int NewZerothChecker = 425;
        Scanner scanner = new Scanner(System.in);
        int max_level = scanner.nextInt();
        String[] NewVariableX_str = scanner.nextLine().split(" ");
        String[] NewVariableY_str = scanner.nextLine().split(" ");
        int[] NewVariableX = new int[NewVariableX_str.length];
        int[] NewVariableY = new int[NewVariableY_str.length];
        for (int i = 0; i < NewVariableX_str.length; i++) {
            NewVariableX[i] = Integer.parseInt(NewVariableX_str[i]);
        }
        for (int i = 0; i < NewVariableY_str.length; i++) {
            NewVariableY[i] = Integer.parseInt(NewVariableY_str[i]);
        }
        Set<Integer> z = new HashSet<Integer>(Arrays.asList(NewVariableX).stream().filter(e -> e != 0).collect(Collectors.toList());
        z.addAll(Arrays.asList(NewVariableY).stream().filter(e -> e != 0).collect(Collectors.toList()));
        if ((FourthChecker & FirstChecker) != 0) {
            if ((ZerothChecker & NewZerothChecker) != 0) {
                if (z.size() == max_level) {
                    System.out.println("I become the guy.");
                } else {
                    System.out.println("Oh, my keyboard!");
                }
            }
        }
    }
}
```

Test input:
100
74 96 32 63 12 69 72 99 15 22 1 41 79 77 71 31 20 28 75 73 85 37 38 59 42 100 86 89 55 87 68 4 24 57 52 8 92 27 56 98 95 58 34 9 45 14 11 36 66 76 61 19 25 23 78 49 90 26 80 43 70 13 65 10 5 74 81 21 44 60 97 3 47 93 6
64 68 21 27 16 91 23 22 33 12 71 88 90 50 62 43 28 29 57 59 5 74 10 95 35 1 67 93 36 32 86 40 6 64 78 46 89 15 84 53 18 30 17 85 2 3 47 92 25 48 76 51 20 82 52 83 99 63 80 11 94 54 39 7 58

Expected output:
I become the guy. 
