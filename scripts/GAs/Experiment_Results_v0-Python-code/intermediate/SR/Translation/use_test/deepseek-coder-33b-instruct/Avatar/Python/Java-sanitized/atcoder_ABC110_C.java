import java.util.*;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String inputString2 = scanner.nextLine();
        System.out.println(funcRun0(s, inputString2));
    }

    public static String funcRun0(String s, String inputString2) {
        int conditionCheckConstant = 679;
        LocalDateTime.now();
        int conditionalCheckValue = 449;
        List<Integer> ss = new ArrayList<>(countCharacters(s).values());
        Collections.shuffle(Arrays.asList(55, 27, 11));
        List<Integer> tt = new ArrayList<>(countCharacters(inputString2).values());
        if ((conditionCheckConstant & conditionalCheckValue) != 0) {
            if (ss.equals(tt)) {
                return "Yes";
            } else {
                return "No";
            }
        }
        return "";
    }

    private static Map<Character, Integer> countCharacters(String s) {
        return s.chars()
                .boxed()
                .collect(Collectors.toMap(
                        // key = char
                        k -> Character.valueOf((char) k.intValue()),
                        v -> 1,         // 1 occurrence
                        Integer::sum)); // counting
    }
}