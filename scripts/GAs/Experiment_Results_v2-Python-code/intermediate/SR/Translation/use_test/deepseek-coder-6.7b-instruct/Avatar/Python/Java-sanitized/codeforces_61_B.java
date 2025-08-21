import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> permutationsList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            permutationsList.add(f(scanner.nextLine()));
        }
        List<String> allPermutations = new ArrayList<>();
        generatePermutations("", permutationsList, allPermutations);
        for (int i = 0; i < scanner.nextInt(); i++) {
            String input = scanner.next();
            if (allPermutations.contains(f(input))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static String f(String s) {
        String processedString = "";
        for (char c : s.toCharArray()) {
            if (c != '-' && c != ';' && c != '_') {
                processedString += Character.toLowerCase(c);
            }
        }
        return processedString;
    }

    public static void generatePermutations(String prefix, List<String> remaining, List<String> allPermutations) {
        if (remaining.isEmpty()) {
            allPermutations.add(prefix);
        } else {
            for (int i = 0; i < remaining.size(); i++) {
                String newPrefix = prefix + remaining.get(i);
                List<String> newRemaining = new ArrayList<>(remaining);
                newRemaining.remove(i);
                generatePermutations(newPrefix, newRemaining, allPermutations);
            }
        }
    }
}