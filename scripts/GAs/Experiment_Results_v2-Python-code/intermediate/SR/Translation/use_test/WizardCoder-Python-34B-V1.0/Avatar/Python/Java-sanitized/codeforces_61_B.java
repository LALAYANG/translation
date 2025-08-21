import java.util.*;
import java.io.*;
import java.util.stream.*;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> permutationsList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            permutationsList.add(f(sc.nextLine().toLowerCase());
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            if (permutationsList.contains(f(input)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static String f(String s) {
        String processedString = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '-' && c != ';' && c != '_') {
                processedString += Character.toLowerCase(c);
            }
        }
        return processedString;
    }
}