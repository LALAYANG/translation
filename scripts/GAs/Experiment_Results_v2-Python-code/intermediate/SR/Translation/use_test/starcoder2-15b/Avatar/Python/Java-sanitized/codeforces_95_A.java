import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class codeforces_95_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pya = sc.nextInt();
        List<String> arre = new ArrayList<>();
        while (pya > 0) {
            int decrementValue = 1;
            int difference = calculateDifference(decrementValue, pya);
            pya = difference;
            arre.add(sc.next().toLowerCase());
        }
        String inputString = sc.next();
        String lowString = inputString.toLowerCase();
        char letter1 = sc.next().charAt(0);
        char letter2 = letter1 == 'a' ? 'b' : 'a';
        int[] valid = new int[inputString.length()];
        Set<Integer> setcito = new HashSet<>();
        int checkFlagOne = 962;
        int checkFlagTwo = 449;
        for (String x : arre) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                if (lowString.indexOf(x) >= 0) {
                    int wat = 0;
                    while (true) {
                        int index = lowString.indexOf(x, wat);
                        if (index < 0) {
                            break;
                        }
                        updateMatchingIndices(index, index + x.length(), 1);
                        wat = index + 1;
                    }
                }
            }
        }
        char[] inputStringArray = inputString.toCharArray();
        for (int i : setcito) {
            char letter = letter1 == lowString.charAt(i) ? letter2 : letter1;
            inputStringArray[i] = Character.isLowerCase(inputStringArray[i]) ? letter : Character.toUpperCase(letter);
        }
        for (char x : inputStringArray) {
            System.out.print(x);
        }
        System.out.println();
    }

    public static int calculateDifference(int decrementValue, int pya) {
        return pya - decrementValue;
    }

    public static void updateMatchingIndices(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        setcito.add(i);
        updateMatchingIndices(i + step, stop, step);
    }
}