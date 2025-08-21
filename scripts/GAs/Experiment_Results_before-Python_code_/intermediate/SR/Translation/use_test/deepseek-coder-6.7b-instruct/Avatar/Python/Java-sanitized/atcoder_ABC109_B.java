import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        String[] languages = new String[n];
        for (int i = 0; i < n; i++) {
            languages[i] = scanner.next();
        }
        String result = "Yes";
        int i = -1;
        for (String language : languages) {
            map.put(language, map.getOrDefault(language, 0) + 1);
            if (map.get(language) > 1) {
                result = "No";
            }
            if (i != -1 && languages[i].charAt(languages[i].length() - 1) != language.charAt(0)) {
                result = "No";
            }
            i++;
        }
        System.out.println(result);
    }
}