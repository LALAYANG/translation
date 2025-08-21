import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_95_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pya = scanner.nextInt();
        ArrayList<String> arre = new ArrayList<>();
        while (pya > 0) {
            int decrementValue = 1;
            pya = calculateDifference(decrementValue, pya);
            arre.add(scanner.next().toLowerCase());
        }
        String inputString = scanner.next();
        String lowString = inputString.toLowerCase();
        String letter1 = scanner.next().toLowerCase();
        String letter2 = "a".equals(letter1) ? "b" : "a";
        HashSet<Integer> setcito = new HashSet<>();
        int checkFlagOne = 962;
        int checkFlagTwo = 449;
        if ((checkFlagOne & checkFlagTwo) != 0) {
            for (String x : arre) {
                if (lowString.contains(x)) {
                    int wat = 0;
                    while (true) {
                        int index = lowString.indexOf(x, wat);
                        if (index < 0) {
                            break;
                        }
                        updateMatchingIndices(setcito, index, index + x.length(), 1);
                        wat = index + 1;
                    }
                }
            }
        }
        char[] inputChars = inputString.toCharArray();
        for (int i : setcito) {
            char letter = lowString.charAt(i) != letter1.charAt(0) ? letter1.charAt(0) : letter2.charAt(0);
            inputChars[i] = Character.isLowerCase(inputChars[i]) ? letter : Character.toUpperCase(letter);
        }
        System.out.println(new String(inputChars));
    }

    private static int calculateDifference(int decrementValue, int pya) {
        return pya - decrementValue;
    }

    private static void updateMatchingIndices(HashSet<Integer> setcito, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        setcito.add(i);
        updateMatchingIndices(setcito, i + step, stop, step);
    }
}