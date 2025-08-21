import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class atcoder_ABC150_C {

    public static void main(String[] args) {
        // Read input
        int integerN = Integer.parseInt(args[0]);
        String sourceTuple = args[1];
        String targetTuple = args[2];

        // Convert input to lists
        List<Integer> sourceList = Arrays.stream(sourceTuple.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> targetList = Arrays.stream(targetTuple.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        // Calculate permutation indices
        List<List<Integer>> permutationList = Lists.newArrayList();
        for (int i = 1; i <= integerN; i++) {
            permutationList.add(Lists.newArrayList(i));
        }
        int sourcePermutationIndex = permutationList.indexOf(sourceList);
        int targetPermutationIndex = permutationList.indexOf(targetList);

        // Calculate absolute difference between permutation indices
        int absoluteDifference = Math.abs(sourcePermutationIndex - targetPermutationIndex);

        // Print result
        System.out.println(absoluteDifference);
    }

}