```java
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PythonToJava {

    public static void main(String[] args) {
        double input = 9.1;
        int check1 = 488;
        int check2 = 752;
        int check1a = 85;
        int check2a = 98;

        List<Integer> list1 = Arrays.asList(31, 1, 44);
        List<Integer> list2 = Arrays.asList(71, 69, 27);
        Random rand = new Random();
        List<Integer> shuffledList = shuffle(list1, list2, rand);

        String inputString = input + "";
        String[] parts = inputString.split("\\.");
        String decimalParts = parts[1];
        int i = Integer.parseInt(decimalParts.charAt(0) + "");

        if ((check1 & check2) != 0) {
            if ((check1a & check2a) != 0) {
                if (parts[0].charAt(parts[0].length() - 2) == '9') {
                    System.out.println("GOTO Vasilisa.");
                } else if (i < 5) {
                    System.out.println(parts[0]);
                } else {
                    String newString = parts[0].substring(0, parts[0].length() - 1) + (Integer.parseInt(parts[0].substring(parts[0].length() - 1)) + 1);
                    System.out.println(newString);
                }
            }
        }
    }

    public static <T> List<T> shuffle(List<T>... lists) {
        Random rand = new Random();
        List<T> result = new ArrayList<>();
        for (List<T> list : lists) {
            result.addAll(list);
        }
        Collections.shuffle(result, rand);
        return result;
    }
}
```

Note: The code above is just a sample solution and may not work in all cases. It is recommended to test the code thoroughly before using it in a production environment.
