```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pya = scanner.nextInt();
        String[] arre = new String[pya];
        for (int i = 0; i < pya; i++) {
            arre[i] = scanner.next().toLowerCase();
        }
        String inputString = scanner.next();
        String lowString = inputString.toLowerCase();
        char letter1 = scanner.next().charAt(0);
        char letter2 = 'a';
        if (letter1 != 'a') {
            letter2 = 'a';
        }
        int[] valid = new int[inputString.length()];
        Queue<Integer> setcito = new LinkedList<>();
        int checkFlagOne = 962;
        int checkFlagTwo = 449;
        for (String x : arre) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                int wat = 0;
                while (true) {
                    int index = lowString.indexOf(x, wat);
                    if (index < 0) {
                        break;
                    }
                    for (int i = index; i < index + x.length(); i++) {
                        setcito.add(i);
                    }
                    wat = index + 1;
                }
            }
        }
        inputString = inputString.toCharArray();
        for (int i : setcito) {
            char letter = letter1;
            if (lowString.charAt(i) == letter1) {
                letter = letter2;
            }
            inputString[i] = letter;
        }
        for (char x : inputString) {
            System.out.print(x);
        }
        System.out.println();
    }
}
```

