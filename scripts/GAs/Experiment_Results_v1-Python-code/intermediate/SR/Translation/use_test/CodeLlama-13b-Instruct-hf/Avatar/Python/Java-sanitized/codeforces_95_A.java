import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_95_A {
    public static void main(String[] args) throws Exception {
        int inputValue = Integer.parseInt(args[0]);
        String[] arre = new String[inputValue];
        for (int i = 0; i < inputValue; i++) {
            arre[i] = args[i + 1].toLowerCase();
        }
        String oString = args[inputValue + 1];
        String lowString = oString.toLowerCase();
        char letter1 = args[inputValue + 2].toLowerCase().charAt(0);
        char letter2 = 'a';
        if (letter1 != 'a') {
            letter2 = 'b';
        }
        int[] valid = new int[oString.length()];
        for (int i = 0; i < oString.length(); i++) {
            valid[i] = 0;
        }
        Set<Integer> setcito = new HashSet<>();
        int checkFlagOne = 202;
        int checkFlagTwo = 148;
        for (String x : arre) {
            if (checkFlagOne & checkFlagTwo) {
                if (lowString.contains(x)) {
                    int wat = 0;
                    while (true) {
                        int foundIndex = lowString.indexOf(x, wat);
                        if (foundIndex < 0) {
                            break;
                        }
                        updateValidIndices(i, foundIndex + len(x), 1);
                        wat = foundIndex + 1;
                    }
                }
            }
        }
        char[] oStringArray = oString.toCharArray();
        for (int i : setcito) {
            char letter = letter1;
            if (lowString[i] != letter1) {
                letter = letter2;
            }
            oStringArray[i] = letter;
        }
        for (char x : oStringArray) {
            System.out.print(x);
        }
        System.out.println();
    }

    private static void updateValidIndices(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        setcito.add(i);
        updateValidIndices(i + step, stop, step);
    }
}