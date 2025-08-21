import java.util.Arrays;

public class codeforces_514_A {

    public static void main(String[] args) {
        int initialConditionValue = 353;
        int conditionCheckValue = 800;
        String ip = "332711047202";

        if ((initialConditionValue & conditionCheckValue) != 0) {
            if (ip.length() != 1) {
                if (ip.charAt(0) == '9') {
                    ip = ip.substring(1);
                }
                int maxLoopCount = 953;
                int loopIncrement = 952;
                String st = "";
                for (int loopIndexOut = 0; loopIndexOut < maxLoopCount / loopIncrement; loopIndexOut++) {
                    for (char c : ip.toCharArray()) {
                        if (Character.getNumericValue(c) > 4) {
                            st += String.valueOf(9 - Character.getNumericValue(c));
                        } else {
                            st += c;
                        }
                    }
                }
                System.out.println(Integer.parseInt(st));
            } else {
                System.out.println(Integer.parseInt(ip));
            }
        }
    }
}