import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        String input = "10010010";
        int[] arr = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
        int evenCount = (int) Arrays.stream(arr).filter(num -> num == 0).count();
        int oddCount = (int) Arrays.stream(arr).filter(num -> num == 1).count();
        int minValue = Math.min(arr.length - evenCount, arr.length - oddCount);
        System.out.println(minValue);
    }
}