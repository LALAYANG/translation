import java.util.HashSet;
import java.util.Scanner;

public class codeforces_95_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pya = sc.nextInt();
        String[] arre = new String[pya];
        for (int i = 0; i < pya; i++) {
            arre[i] = sc.next().toLowerCase();
        }
        String oString = sc.next().toLowerCase();
        char letter1 = sc.next().charAt(0);
        char letter2 = (letter1 == 'a') ? 'b' : 'a';
        boolean[] valid = new boolean[oString.length()];
        HashSet<Integer> setcito = new HashSet<>();
        for (String x : arre) {
            int wat = 0;
            while (true) {
                int index = oString.indexOf(x, wat);
                if (index < 0) {
                    break;
                }
                for (int j = index; j < index + x.length(); j++) {
                    setcito.add(j);
                }
                wat = index + 1;
            }
        }
        char[] oStringArray = oString.toCharArray();
        for (int i : setcito) {
            char letter = (oString.charAt(i) == letter1) ? letter1 : letter2;
            oStringArray[i] = (oString.charAt(i) >= 'A' && oString.charAt(i) <= 'Z') ? Character.toUpperCase(letter) : letter;
        }
        for (char x : oStringArray) {
            System.out.print(x);
        }
        System.out.println();
    }
}