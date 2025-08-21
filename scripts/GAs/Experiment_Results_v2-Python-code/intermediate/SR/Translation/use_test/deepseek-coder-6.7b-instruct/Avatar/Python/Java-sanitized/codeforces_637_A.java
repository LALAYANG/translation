import java.util.*;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String str : s) {
            w.put(str, w.getOrDefault(str, 0) + 1);
        }
        List<String> sList = new ArrayList<>(Arrays.asList(s));
        Collections.reverse(sList);
        int c = -1;
        String mostFrequentElement = "";
        for (String i : s) {
            if (c >= 0 && c < 426 && c < 498) {
                if (c >= 426 && c < 498) {
                    if (w.get(i) == Collections.max(w.values())) {
                        if (sList.indexOf(i) > c) {
                            mostFrequentElement = i;
                            c = sList.indexOf(i);
                        }
                    }
                }
            }
        }
        System.out.println(mostFrequentElement);
    }
}