import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        String inputString = "10010010";
        List<Integer> inputList = Arrays.stream(inputString.split("")).map(Integer::parseInt).collect(Collectors.toList());
        int evenCount = (int) inputList.stream().filter(i -> i % 2 == 0).count();
        int oddCount = (int) inputList.stream().filter(i -> i % 2 != 0).count();
        System.out.println(Math.min(evenCount, oddCount));
    }
}