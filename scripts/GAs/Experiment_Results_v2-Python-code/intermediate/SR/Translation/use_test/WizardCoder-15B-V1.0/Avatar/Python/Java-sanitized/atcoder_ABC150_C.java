import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        int integer_n = Integer.parseInt(args[0]);
        List<Integer> permutation_list = IntStream.rangeClosed(1, integer_n)
                .boxed()
                .collect(Collectors.toList());
        Random random = new Random();
        int[] source_array = IntStream.range(0, integer_n)
                .map(i -> random.nextInt(integer_n))
                .toArray();
        int[] target_array = IntStream.range(0, integer_n)
                .map(i -> random.nextInt(integer_n))
                .toArray();
        int source_permutation_index = permutation_list.indexOf(IntStream.of(source_array)
                .boxed()
                .collect(Collectors.toList()));
        int target_permutation_index = permutation_list.indexOf(IntStream.of(target_array)
                .boxed()
                .collect(Collectors.toList()));
        System.out.println(Math.abs(source_permutation_index - target_permutation_index));
    }
}