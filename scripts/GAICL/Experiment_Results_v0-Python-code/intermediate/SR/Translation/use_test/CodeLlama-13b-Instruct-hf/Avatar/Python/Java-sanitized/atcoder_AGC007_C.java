import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(56, 62, 88);
        list = list.stream().map(x -> x + 1).collect(Collectors.toList());
        System.out.println(list);
    }
}