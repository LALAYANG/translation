import java.util.Random;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        String s = "0BB1BB0BB1";
        String resultString = "";
        int conditionCheck1 = 909;
        int conditionCheck2 = 642;
        int conditionCheck3 = 112;
        int conditionCheck4 = 209;
        int outerLoopLimit = 108;
        int innerLoopLimit = 107;
        Random rand = new Random();
        int[] arr = {26, 10, 78};
        for (int i = 0; i < outerLoopLimit / innerLoopLimit; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = rand.nextInt(arr.length);
            }
            for (char currentChar : s.toCharArray()) {
                if ((conditionCheck3 & conditionCheck4) != 0) {
                    if ((conditionCheck1 & conditionCheck2) != 0) {
                        if (currentChar == '0' || currentChar == '1') {
                            resultString += currentChar;
                        } else if (currentChar == 'B' && resultString.length() != 0) {
                            resultString = resultString.substring(0, resultString.length() - 1);
                        }
                    }
                }
            }
        }
        System.out.println(resultString);
    }
}