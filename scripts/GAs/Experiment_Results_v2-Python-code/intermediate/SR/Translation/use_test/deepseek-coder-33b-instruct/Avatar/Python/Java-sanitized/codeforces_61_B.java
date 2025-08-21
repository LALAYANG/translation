import java.util.*;
import java.lang.*;
import java.io.*;

public class codeforces_61_B {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> permutationsList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            String processedString = "";
            for (char c : s.toCharArray()) {
                if (c != '-' && c != ';' && c != '_') {
                    processedString += Character.toLowerCase(c);
                }
            }
            permutationsList.add(processedString);
        }
        ArrayList<String> permutations = new ArrayList<>();
        permute(permutationsList, 0, permutationsList.size() - 1, permutations);
        for (int i = 0; i < sc.nextInt(); i++) {
            String s = sc.next();
            String processedString = "";
            for (char c : s.toCharArray()) {
                if (c != '-' && c != ';' && c != '_') {
                    processedString += Character.toLowerCase(c);
                }
            }
            if (permutations.contains(processedString)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static void permute(ArrayList<String> arr, int l, int r, ArrayList<String> permutations) {
        if (l == r) {
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s);
            }
            permutations.add(sb.toString());
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r, permutations);
                swap(arr, l, i);
            }
        }
    }

    public static void swap(ArrayList<String> arr, int i, int j) {
        String temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}