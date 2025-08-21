import java.util.*;

public class atcoder_ABC110_C {
    public static String run(String s, String t) {
        List<Integer> ss = new ArrayList<>(Collections.frequency(Arrays.asList(s.toCharArray()), 'c'));
        List<Integer> tt = new ArrayList<>(Collections.frequency(Arrays.asList(t.toCharArray()), 'c'));
        Collections.sort(ss);
        Collections.sort(tt);
        if (ss.equals(tt)) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(run(s, t));
    }
}