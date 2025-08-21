import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_95_A {
    public static void main(String[] args) throws Exception {
        int pya = Integer.parseInt(args[0]);
        String[] arre = new String[pya];
        for (int i = 0; i < pya; i++) {
            arre[i] = args[i + 1].toLowerCase();
        }
        String inputString = args[pya + 1];
        String lowString = inputString.toLowerCase();
        char letter1 = inputString.charAt(0);
        char letter2 = 'a';
        if (letter1 != 'a') {
            letter2 = 'b';
        }
        int[] valid = new int[inputString.length()];
        Set<Integer> setcito = new HashSet<>();
        int checkFlagOne = 962;
        int checkFlagTwo = 449;
        for (String x : arre) {
            if (checkFlagOne & checkFlagTwo) {
                if (lowString.contains(x)) {
                    int wat = 0;
                    while (true) {
                        int index = lowString.indexOf(x, wat);
                        if (index < 0) {
                            break;
                        }
                        setcito.add(index);
                        wat = index + 1;
                    }
                }
            }
        }
        char[] inputStringArray = inputString.toCharArray();
        for (int i : setcito) {
            char letter = letter1;
            if (lowString.charAt(i) != letter1) {
                letter = letter2;
            }
            inputStringArray[i] = letter;
        }
        for (char x : inputStringArray) {
            System.out.print(x);
        }
        System.out.println();
    }
}