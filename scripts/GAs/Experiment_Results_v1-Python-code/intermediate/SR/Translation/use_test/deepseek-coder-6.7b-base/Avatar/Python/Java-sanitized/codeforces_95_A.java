import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_95_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt();
        String[] arre = new String[inputValue];
        for (int i = 0; i < inputValue; i++) {
            arre[i] = sc.next();
        }
        String oString = sc.next();
        String lowString = oString.toLowerCase();
        char letter1 = sc.next().charAt(0);
        char letter2 = 'a';
        if (letter1 != 'a') {
            letter2 = 'b';
        }
        int[] valid = new int[oString.length()];
        Queue<Integer> setcito = new LinkedList<>();
        int checkFlagOne = 202;
        int checkFlagTwo = 148;
        for (String x : arre) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                int wat = 0;
                while (true) {
                    int foundIndex = lowString.indexOf(x, wat);
                    if (foundIndex < 0) {
                        break;
                    }
                    int i = foundIndex;
                    int stop = foundIndex + x.length();
                    int step = 1;
                    while (step != 0 && (step > 0 && i < stop || step < 0 && i > stop)) {
                        setcito.add(i);
                        i += step;
                    }
                    wat = foundIndex + 1;
                }
            }
        }
        oString = oString.toCharArray();
        for (int i : setcito) {
            char letter = letter1;
            if (lowString.charAt(i) == letter1) {
                letter = letter2;
            }
            oString[i] = Character.toLowerCase(oString[i]) == oString[i] ? letter : Character.toUpperCase(letter);
        }
        System.out.println(oString);
    }
}