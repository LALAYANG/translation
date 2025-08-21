import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        int permutationLength = Integer.parseInt(args[0]);
        List<Integer> numbers = IntStream.range(1, permutationLength + 1).boxed().collect(Collectors.toList());
        List<List<Integer>> permutations = numbers.stream().map(i -> numbers.stream().map(j -> i * j).collect(Collectors.toList())).collect(Collectors.toList());
        int result = permutations.get(0).get(0) + permutations.get(1).get(1);
        System.out.println(result);
    }
}