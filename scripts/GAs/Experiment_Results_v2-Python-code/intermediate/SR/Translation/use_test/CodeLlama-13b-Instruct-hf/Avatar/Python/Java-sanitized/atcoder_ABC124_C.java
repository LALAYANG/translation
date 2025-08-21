import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        String inputString = "10010010";
        List<Integer> inputList = Arrays.stream(inputString.split("")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.shuffle(inputList);
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < inputList.size(); i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(Math.min(inputList.size() - evenCount - oddCount, inputList.size() - evenCount - oddCount));
    }
}