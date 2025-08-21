import java.util.*;
import java.io.*;
import java.math.*;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve();
    }

    public static void solve() {
        List<String> team_names = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            team_names.add(sc.nextLine().toLowerCase().replaceAll("[-;_]", ""));
        }

        List<String> team_permutations = new ArrayList<>();
        for (List<Character> perm : permute(team_names)) {
            StringBuilder sb = new StringBuilder();
            for (char c : perm) {
                sb.append(c);
            }
            team_permutations.add(sb.toString());
        }

        for (int i = 0; i < inp(); i++) {
            String s = sc.nextLine().toLowerCase().replaceAll("[-;_]", "");
            if (team_permutations.contains(s)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static List<List<Character>> permute(List<String> list) {
        if (list.size() == 1) {
            List<List<Character>> result = new ArrayList<>();
            List<Character> perm = new ArrayList<>();
            perm.add(list.get(0).charAt(0));
            result.add(perm);
            return result;
        } else {
            char first = list.get(0).charAt(0);
            List<String> rest = new ArrayList<>(list.subList(1, list.size()));
            List<List<Character>> permutations = permute(rest);
            List<List<Character>> result = new ArrayList<>();
            for (List<Character> perm : permutations) {
                for (int i = 0; i <= perm.size(); i++) {
                    List<Character> newPerm = new ArrayList<>(perm);
                    newPerm.add(i, first);
                    result.add(newPerm);
                }
            }
            return result;
        }
    }

    public static int inp() {
        return sc.nextInt();
    }
}