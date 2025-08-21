import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class codeforces_95_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        List<String> arre = new ArrayList<>();
        while (inputValue != 0) {
            arre.add(scanner.next().toLowerCase());
            inputValue--;
        }
        String oString = scanner.next().toLowerCase();
        char letter1 = scanner.next().toLowerCase().charAt(0);
        char letter2 = (letter1 != 'a') ? 'a' : 'b';
        int[] valid = new int[oString.length()];
        Set<Integer> setcito = new HashSet<>();
        int checkFlagOne = 202;
        int checkFlagTwo = 148;
        for (String x : arre) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                int foundIndex = oString.indexOf(x);
                while (foundIndex >= 0) {
                    updateValidIndices(foundIndex, foundIndex + x.length(), 1, setcito);
                    foundIndex = oString.indexOf(x, foundIndex + 1);
                }
            }
        }
        char[] oStringArray = oString.toCharArray();
        for (int i : setcito) {
            char letter = (oStringArray[i] != letter1) ? letter1 : letter2;
            oStringArray[i] = Character.isLowerCase(oStringArray[i]) ? letter : Character.toUpperCase(letter);
        }
        System.out.println(new String(oStringArray));
    }

    private static void updateValidIndices(int i, int stop, int step, Set<Integer> setcito) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        setcito.add(i);
        updateValidIndices(i + step, stop, step, setcito);
    }
}