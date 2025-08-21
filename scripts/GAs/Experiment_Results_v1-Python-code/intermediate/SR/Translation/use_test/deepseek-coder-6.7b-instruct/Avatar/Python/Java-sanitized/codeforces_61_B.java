import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(f(scanner.nextLine()));
        }
        List<String> permutations = new ArrayList<>();
        generatePermutations("", l, permutations);
        for (int i = 0; i < scanner.nextInt(); i++) {
            if (permutations.contains(f(scanner.nextLine()))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static String f(String s) {
        String r = "";
        for (char c : s.toCharArray()) {
            if (!(c == '-' || c == ';' || c == '_')) {
                r += Character.toLowerCase(c);
            }
        }
        return r;
    }

    public static void generatePermutations(String prefix, List<String> remaining, List<String> permutations) {
        if (remaining.size() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < remaining.size(); i++) {
                List<String> newRemaining = new ArrayList<>(remaining);
                newRemaining.remove(i);
                generatePermutations(prefix + remaining.get(i), newRemaining, permutations);
            }
        }
    }
}