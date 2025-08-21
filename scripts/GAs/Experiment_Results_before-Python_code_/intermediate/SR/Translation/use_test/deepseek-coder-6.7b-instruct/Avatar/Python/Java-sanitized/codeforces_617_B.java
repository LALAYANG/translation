import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_617_B {
    public static void main(String[] args) {
        List<String> input = Arrays.asList(args);
        String a = input.get(0);
        System.out.println(a.contains("1") ? calculateProduct(a) : 0);
    }

    private static int calculateProduct(String a) {
        int product = 1;
        String[] parts = a.split("1");
        for (String part : parts) {
            product *= countZeroes(part) + 1;
        }
        return product;
    }

    private static int countZeroes(String s) {
        return s.length() - s.replace("0", "").length();
    }
}