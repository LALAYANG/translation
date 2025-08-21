import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class codeforces_617_B {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(55, 17, 49);
        Collections.shuffle(list);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}