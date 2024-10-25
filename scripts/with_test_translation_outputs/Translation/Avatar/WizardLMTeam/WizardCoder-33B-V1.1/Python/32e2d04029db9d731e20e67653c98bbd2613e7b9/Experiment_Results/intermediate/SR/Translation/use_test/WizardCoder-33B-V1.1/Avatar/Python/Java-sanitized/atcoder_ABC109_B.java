import java.util.*;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            list.add(word);
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        String result = "Yes";
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i)) > 1) {
                result = "No";
                break;
            }
            if (i > 0 && list.get(i - 1).charAt(list.get(i - 1).length() - 1) != list.get(i).charAt(0)) {
                result = "No";
                break;
            }
        }
        System.out.println(result);
    }
}