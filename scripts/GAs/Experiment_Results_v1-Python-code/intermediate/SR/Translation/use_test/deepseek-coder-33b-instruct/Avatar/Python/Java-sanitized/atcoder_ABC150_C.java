import java.util.*;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int permutationLength = scanner.nextInt();
        List<Integer> permutations = new ArrayList<>();
        for (int i = 1; i <= permutationLength + 1; i++) {
            permutations.add(i);
        }
        Collections.shuffle(permutations);
        int[] permutationOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] permutationTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int permutationOneIndex = permutations.indexOf(Arrays.stream(permutationOne).boxed().toArray());
        int permutationTwoIndex = permutations.indexOf(Arrays.stream(permutationTwo).boxed().toArray());
        System.out.println(Math.abs(permutationOneIndex - permutationTwoIndex));
    }
}