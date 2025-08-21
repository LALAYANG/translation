import java.util.*;
import java.util.stream.Collectors;

class Main {
    static String myDecorator(FuncRunnable func) {
        return func.result();
    }

    interface FuncRunnable {
        String result();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String inputString2 = scanner.next();

        FuncRunnable funcRunnable = () -> {
            int conditionCheckConstant = 679;
            int conditionalCheckValue = 449;

            List<Integer> sList = Arrays.stream(s.split("")).map(String::hashCode).collect(Collectors.toList());
            Collections.shuffle(sList);
            List<Integer> ss = sList.stream().collect(Collectors.groupingBy(i -> i, Collectors.summingInt(i -> 1))).values().stream().sorted().collect(Collectors.toList());

            List<Integer> inputString2List = Arrays.stream(inputString2.split("")).map(String::hashCode).collect(Collectors.toList());
            Collections.shuffle(inputString2List);
            List<Integer> tt = inputString2List.stream().collect(Collectors.groupingBy(i -> i, Collectors.summingInt(i -> 1))).values().stream().sorted().collect(Collectors.toList());

            if ((conditionCheckConstant & conditionalCheckValue) != 0) {
                if (ss.equals(tt)) {
                    return "Yes";
                } else {
                    return "No";
                }
            }
            return "No";
        };

        System.out.println(myDecorator(funcRunnable));
    }
}