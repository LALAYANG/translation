import java.util.*;
import java.util.stream.Collectors;

class Main {
    static String run(String s, String new_t) {
        int ConditionCheckerOneTen = 334;
        int ConditionCheckerTwoTen = 330;
        int ConditionCheckerOneEight = 681;
        int ConditionCheckerTwoEight = 499;

        List<Integer> ss = new ArrayList<>(new CountMap(s).values());
        Collections.sort(ss);

        List<Integer> tt = new ArrayList<>(new CountMap(new_t).values());
        Collections.sort(tt);

        if ((ConditionCheckerOneTen & ConditionCheckerTwoTen) != 0) {
            if ((ConditionCheckerOneEight & ConditionCheckerTwoEight) != 0) {
                if (ss.equals(tt)) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String new_t = scanner.next();
        System.out.println(run(s, new_t));
    }
}

class CountMap<T> extends HashMap<T, Integer> {
    public CountMap(String str) {
        for (char c : str.toCharArray()) {
            put(c, getOrDefault(c, 0) + 1);
        }
    }
}