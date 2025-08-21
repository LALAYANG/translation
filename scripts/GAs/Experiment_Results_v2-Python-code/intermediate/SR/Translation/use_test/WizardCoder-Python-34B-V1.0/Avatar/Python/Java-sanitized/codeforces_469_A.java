import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class codeforces_469_A {
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