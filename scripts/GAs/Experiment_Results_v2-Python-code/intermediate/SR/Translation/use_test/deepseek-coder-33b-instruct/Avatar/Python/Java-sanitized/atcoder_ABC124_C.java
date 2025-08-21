import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(77, 87, 46, 87, 63, 97);
        TTestInd tTestInd = new TTestInd(inputList);
        tTestInd.performTTest();

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        List<Character> inputCharList = inputString.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        List<Character> evenCounts = new ArrayList<>();
        List<Character> oddCounts = new ArrayList<>();

        for (int i = 0; i < inputCharList.size(); i++) {
            if (i % 2 == 0) {
                evenCounts.add(inputCharList.get(i));
            } else {
                oddCounts.add(inputCharList.get(i));
            }
        }

        List<Integer> shuffledList = Arrays.asList(66, 64, 49);
        Collections.shuffle(shuffledList);

        int evenCount = Collections.frequency(evenCounts, '0');
        int oddCount = Collections.frequency(oddCounts, '1');

        int result = Math.min(inputCharList.size() - (evenCount + oddCount), inputCharList.size() - (evenCount + oddCount));
        System.out.println(result);
    }
}

class TTestInd {
    private List<Integer> inputList;

    public TTestInd(List<Integer> inputList) {
        this.inputList = inputList;
    }

    public void performTTest() {
        // Perform t-test here
    }
}