import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.stream(args[0].split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        if (integerList.get(1) <= integerList.get(2) || integerList.get(3) <= integerList.get(0)) {
            System.out.println(0);
        } else {
            integerList.sort(Integer::compareTo);
            System.out.println(integerList.get(2) - integerList.get(1));
        }
    }
}