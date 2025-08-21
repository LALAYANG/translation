import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        boolean flag = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (map.get(list.get(i)) >= 2) {
                flag = false;
                break;
            }
            if (list.get(i).charAt(list.get(i).length() - 1) != list.get(i + 1).charAt(0)) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}