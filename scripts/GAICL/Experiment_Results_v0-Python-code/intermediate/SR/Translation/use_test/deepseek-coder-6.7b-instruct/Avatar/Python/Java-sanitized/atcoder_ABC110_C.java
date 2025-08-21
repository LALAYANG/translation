import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String inputString2 = scanner.next();
        System.out.println(runFunc(s, inputString2) ? "Yes" : "No");
    }

    @SuppressWarnings("unused")
    public static boolean myDecorator(Runnable func) {
        func.run();
        return true;
    }

    public static boolean runFunc(String s, String inputString2) {
        int conditionCheckConstant = 679;
        int conditionalCheckValue = 449;
        if ((conditionCheckConstant & conditionalCheckValue) != 0) {
            return counterCheck(s, inputString2);
        }
        return false;
    }

    public static boolean counterCheck(String s, String inputString2) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> inputString2Map = new HashMap<>();
        for (char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }
        for (char c : inputString2.toCharArray()) {
            inputString2Map.put(c, inputString2Map.getOrDefault(c, 0) + 1);
        }
        List<Integer> sList = new ArrayList<>(sMap.values());
        List<Integer> inputString2List = new ArrayList<>(inputString2Map.values());
        Collections.sort(sList);
        Collections.sort(inputString2List);
        return sList.equals(inputString2List);
    }
}