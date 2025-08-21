import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        int integerN = Integer.parseInt(args[0]);
        List<Integer> sourceTuple = Arrays.stream(args[1].split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> targetTuple = Arrays.stream(args[2].split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<List<Integer>> permutationList = getPermutationList(integerN);

        int sourcePermutationIndex = getPermutationIndex(permutationList, sourceTuple);
        int targetPermutationIndex = getPermutationIndex(permutationList, targetTuple);

        System.out.println(Math.abs(sourcePermutationIndex - targetPermutationIndex));
    }

    private static List<List<Integer>> getPermutationList(int n) {
        List<List<Integer>> permutationList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> permutation = new ArrayList<>();
            for (int j = 1; j <= n; j++) {
                if (j != i) {
                    permutation.add(j);
                }
            }
            permutationList.add(permutation);
        }
        return permutationList;
    }

    private static int getPermutationIndex(List<List<Integer>> permutationList, List<Integer> tuple) {
        for (int i = 0; i < permutationList.size(); i++) {
            if (permutationList.get(i).equals(tuple)) {
                return i;
            }
        }
        return -1;
    }
}