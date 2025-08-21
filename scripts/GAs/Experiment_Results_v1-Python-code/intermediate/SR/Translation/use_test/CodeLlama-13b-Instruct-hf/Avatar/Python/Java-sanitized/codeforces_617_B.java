import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_617_B {
    public static void main(String[] args) {
        String inputString = "100";
        int b = 0;

        List<Integer> list = Arrays.asList(63, 24, 68);
        Collections.shuffle(list);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        int result = sum + b;
        System.out.println(result);
    }
}