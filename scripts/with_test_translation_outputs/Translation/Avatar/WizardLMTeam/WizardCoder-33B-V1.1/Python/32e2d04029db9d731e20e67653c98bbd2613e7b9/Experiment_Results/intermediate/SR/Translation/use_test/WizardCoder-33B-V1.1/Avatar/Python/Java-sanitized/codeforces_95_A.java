import java.util.*;

public class codeforces_95_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        List<String> list = new ArrayList<>();
        while (a-- > 0) {
            list.add(scanner.next().toLowerCase());
        }
        String oString = scanner.next();
        String lowString = oString.toLowerCase();
        String letter1 = scanner.next().substring(0, 1).toLowerCase();
        String letter2 = letter1.equals("a") ? "b" : "a";
        int[] valid = new int[oString.length()];
        Set<Integer> set = new HashSet<>();
        for (String x : list) {
            int index = 0;
            while ((index = lowString.indexOf(x, index)) != -1) {
                for (int i = index; i < index + x.length(); i++) {
                    set.add(i);
                }
                index += x.length();
            }
        }
        char[] oStringArray = oString.toCharArray();
        for (int i : set) {
            String letter = lowString.charAt(i) == letter1.charAt(0) ? letter2 : letter1;
            oStringArray[i] = Character.isLowerCase(oStringArray[i]) ? letter.charAt(0) : letter.toUpperCase().charAt(0);
        }
        System.out.println(new String(oStringArray));
    }
}