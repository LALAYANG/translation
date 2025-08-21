import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        int permutationLength = Integer.parseInt(args[0]);
        List<Integer> permutationOne = Arrays.asList(args[1].split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> permutationTwo = Arrays.asList(args[2].split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());

        int permutationOneIndex = permutationOne.indexOf(permutationLength);
        int permutationTwoIndex = permutationTwo.indexOf(permutationLength);

        System.out.println(Math.abs(permutationOneIndex - permutationTwoIndex));
    }
}