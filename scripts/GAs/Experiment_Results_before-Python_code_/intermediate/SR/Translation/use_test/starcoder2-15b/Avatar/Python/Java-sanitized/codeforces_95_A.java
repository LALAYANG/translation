import java.util.Scanner;

public class codeforces_95_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pya = sc.nextInt();
        sc.nextLine();
        String[] arre = new String[pya];
        for (int i = 0; i < pya; i++) {
            arre[i] = sc.nextLine().toLowerCase();
        }
        String oString = sc.nextLine();
        String lowString = oString.toLowerCase();
        char letter1 = sc.nextLine().charAt(0);
        char letter2 = letter1 == 'a' ? 'b' : 'a';
        int[] valid = new int[oString.length()];
        for (String x : arre) {
            if (lowString.contains(x)) {
                int wat = 0;
                while (true) {
                    int index = lowString.indexOf(x, wat);
                    if (index < 0) {
                        break;
                    }
                    for (int i = index; i < index + x.length(); i++) {
                        valid[i] = 1;
                    }
                    wat = index + 1;
                }
            }
        }
        for (int i = 0; i < oString.length(); i++) {
            char letter = valid[i] == 1 ? letter1 : letter2;
            if (Character.isLowerCase(oString.charAt(i))) {
                System.out.print(letter);
            } else {
                System.out.print(Character.toUpperCase(letter));
            }
        }
        System.out.println();
    }
}