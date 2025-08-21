import java.util.*;

public class atcoder_ABC124_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        List<Integer> list1 = Arrays.asList(98, 54, 43);
        List<Integer> list2 = Arrays.asList(75, 59, 87);
        tTestInd(list1, list2);
        List<Integer> shuffledList = Arrays.asList(3, 96, 28);
        Collections.shuffle(shuffledList);
        System.out.println(Math.min(
                input.length() - sumTwo(countChars(input, 0), countChars(input, 1)),
                input.length() - sumTwo(countChars(input, 1), countChars(input, 0))
        ));
    }

    public static int sumTwo(int a, int b) {
        return a + b;
    }

    public static int countChars(String str, int index) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == index) {
                if (str.charAt(i) == '0') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void tTestInd(List<Integer> list1, List<Integer> list2) {
        // Implementation of t-test for independent samples
    }
}