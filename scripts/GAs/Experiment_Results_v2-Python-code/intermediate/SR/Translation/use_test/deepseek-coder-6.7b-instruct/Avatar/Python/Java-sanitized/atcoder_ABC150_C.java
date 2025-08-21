import java.util.*;
import java.math.*;
import java.security.*;
import java.time.*;
import java.util.stream.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class atcoder_ABC150_C {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int integerN = scanner.nextInt();
        int[] sourceArray = new int[integerN];
        for (int i = 0; i < integerN; i++) {
            sourceArray[i] = scanner.nextInt();
        }
        int[] targetArray = new int[integerN];
        for (int i = 0; i < integerN; i++) {
            targetArray[i] = scanner.nextInt();
        }
        List<int[]> permutationList = permutations(integerN);
        int sourceIndex = permutationList.indexOf(sourceArray);
        int targetIndex = permutationList.indexOf(targetArray);
        System.out.println(Math.abs(sourceIndex - targetIndex));
    }

    public static List<int[]> permutations(int n) {
        List<int[]> result = new ArrayList<>();
        permutationsHelper(new int[n], 0, result);
        return result;
    }

    public static void permutationsHelper(int[] current, int index, List<int[]> result) {
        if (index == current.length) {
            result.add(current.clone());
            return;
        }
        for (int i = 1; i <= current.length; i++) {
            if (index < i) {
                current[index] = i;
                permutationsHelper(current, index + 1, result);
            }
        }
    }
}