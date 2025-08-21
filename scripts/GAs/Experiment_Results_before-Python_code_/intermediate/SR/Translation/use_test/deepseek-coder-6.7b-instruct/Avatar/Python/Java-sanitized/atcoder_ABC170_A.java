import java.util.Arrays;
import java.util.List;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 0, 4, 5);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}