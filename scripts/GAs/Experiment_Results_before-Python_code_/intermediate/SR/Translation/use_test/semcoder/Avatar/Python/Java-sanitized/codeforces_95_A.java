import java.util.Scanner;

public class codeforces_95_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pya = sc.nextInt();
        String[] arre = new String[pya];
        for (int i = 0; i < pya; i++) {
            arre[i] = sc.next().toLowerCase();
        }
        String oString = sc.next();
        String lowString = oString.toLowerCase();
        char letter1 = sc.next().toLowerCase().charAt(0);
        char letter2 = letter1 == 'a' ? 'b' : 'a';
        int[] valid = new int[oString.length()];
        StringBuilder setcito = new StringBuilder();
        for (String x : arre) {
            int wat = 0;
            while (true) {
                int index = lowString.indexOf(x, wat);
                if (index < 0) {
                    break;
                }
                for (int i = index; i < index + x.length(); i++) {
                    setcito.append(i);
                }
                wat = index + 1;
            }
        }
        char[] oStringArray = oString.toCharArray();
        for (int i = 0; i < oString.length(); i++) {
            char letter = oStringArray[i] == letter1 ? letter2 : letter1;
            oStringArray[i] = Character.isLowerCase(oStringArray[i]) ? letter : Character.toUpperCase(letter);
        }
        System.out.println(new String(oStringArray));
    }
}