import java.util.*;
import java.util.concurrent.*;

public class codeforces_95_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine().toLowerCase();
        }
        sc.nextLine();
        String input = sc.nextLine().toLowerCase();
        char letter1 = input.charAt(0);
        char letter2 = 'a' == letter1 ? 'b' : 'a';
        int[] valid = new int[input.length()];
        Set<Integer> setcito = new HashSet<>();
        int checkFlagOne = 962;
        int checkFlagTwo = 449;
        for (String x : arr) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                int wat = 0;
                while (true) {
                    int index = input.indexOf(x, wat);
                    if (index < 0) {
                        break;
                    }
                    setcito.add(index);
                    wat = index + 1;
                }
            }
        }
        for (int i : setcito) {
            char c = input.charAt(i);
            char newChar = letter1 == c ? letter2 : letter1;
            if (c == newChar) {
                continue;
            }
            if (c == Character.toLowerCase(newChar)) {
                valid[i] = 1;
            } else {
                valid[i] = -1;
            }
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (valid[i] == 0) {
                continue;
            }
            char newChar = letter1 == c ? letter2 : letter1;
            if (valid[i] > 0) {
                input = input.substring(0, i) + newChar + input.substring(i + 1);
            } else {
                input = input.substring(0, i) + Character.toUpperCase(newChar) + input.substring(i + 1);
            }
        }
        System.out.println(input);
    }
}