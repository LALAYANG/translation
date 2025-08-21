import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        List<List<Integer>> permutations = permute(new ArrayList<>(Arrays.asList(arr)));
        Integer[] source = new Integer[n];
        Integer[] target = new Integer[n];
        for (int i = 0; i < n; i++) {
            source[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            target[i] = scanner.nextInt();
        }
        int sourceIndex = permutations.indexOf(Arrays.asList(source));
        int targetIndex = permutations.indexOf(Arrays.asList(target));
        System.out.println(Math.abs(sourceIndex - targetIndex));
    }

    public static List<List<Integer>> permute(List<Integer> arr) {
        List<List<Integer>> list = new ArrayList<>();
        permuteHelper(list, new ArrayList<>(), arr);
        return list;
    }

    private static void permuteHelper(List<List<Integer>> list, List<Integer> resultList, List<Integer> arr) {
        if (resultList.size() == arr.size()) {
            list.add(new ArrayList<>(resultList));
        } else {
            for (int i = 0; i < arr.size(); i++) {
                if (resultList.contains(arr.get(i))) {
                    continue;
                }
                resultList.add(arr.get(i));
                permuteHelper(list, resultList, arr);
                resultList.remove(resultList.size() - 1);
            }
        }
    }
}