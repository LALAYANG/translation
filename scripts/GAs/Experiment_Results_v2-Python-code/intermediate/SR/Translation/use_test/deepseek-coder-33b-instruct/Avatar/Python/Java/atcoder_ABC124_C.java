Here is the Java equivalent of the Python code:

```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
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
```

Please note that the t-test function is not implemented in the Java version. The t-test function is not directly available in Java's standard library, so it would need to be implemented manually or by using a third-party library.

Also, the shuffle function in the Python code is not equivalent to the shuffle function in Java. The shuffle function in Java shuffles the list in-place, while the shuffle function in Python returns a new shuffled list.

The Python code also uses the Counter class from the collections module to count the occurrences of elements in a list. In Java, we use the Collections.frequency method to count the occurrences of elements in a list.

The Python code also uses the min function to find the minimum value among two values. In Java, we use the Math.min method to find the minimum value among two values.

The Python code also uses the len function to get the length of a list. In Java, we use the size method to get the size of a list.

The Python code also uses the sum function to sum up the elements in a list. In Java, we use the sum method to sum up the elements in a list.

The Python code also uses the print function to print the result. In Java, we use the System.out.println method to print the result.

