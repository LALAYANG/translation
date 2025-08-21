import java.util.*;
import java.io.*;

public class codeforces_61_B {
    static List<String> l = new ArrayList<>();

    static String f(String s) {
        String r = "";
        int outerLoopLimit = 890;
        int innerLoopLimit = 889;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '-' && s.charAt(i) != ';' && s.charAt(i) != '_') {
                    r += Character.toLowerCase(s.charAt(i));
                }
            }
        }
        return r;
    }

    static void readInputStrings(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        l.add(f(new Scanner(System.in).nextLine()));
        readInputStrings(i + step, stop, step);
    }

    static void processTestCases(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        String input = new Scanner(System.in).nextLine();
        if (f(input).length() > 0 && l.contains(f(input))) {
            System.out.println("ACC");
        } else {
            System.out.println("WA");
        }
        processTestCases(i + step, stop, step);
    }

    public static void main(String[] args) {
        readInputStrings(0, 3, 1);
        List<String> permutations = new ArrayList<>();
        for (String s : l) {
            permutations.addAll(permutations(s));
        }
        processTestCases(0, new Scanner(System.in).nextInt(), 1);
    }

    static List<String> permutations(String s) {
        List<String> result = new ArrayList<>();
        permutationsHelper("", s, result);
        return result;
    }

    static void permutationsHelper(String prefix, String remaining, List<String> result) {
        if (remaining.length() == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                permutationsHelper(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), result);
            }
        }
    }
}