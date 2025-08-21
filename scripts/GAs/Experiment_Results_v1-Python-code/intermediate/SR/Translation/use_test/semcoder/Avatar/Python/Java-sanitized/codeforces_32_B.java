public class codeforces_32_B {
    public static String appendCharacter(char characterToAdd, String result) {
        return result + characterToAdd;
    }

    public static void main(String[] args) {
        String s = ".";
        String result = "";
        int stringIndex = 0;
        int outerLoopCounter = 284;
        int innerLoopCounter = 283;

        while (outerLoopCounter % innerLoopCounter == 1) {
            outerLoopCounter++;
            while (stringIndex < s.length()) {
                int conditionalValueOne = 456;
                int conditionalValueTwo = 67;
                int conditionalValueThree = 62;
                int conditionalValueFour = 159;

                if ((conditionalValueOne & conditionalValueTwo) != 0) {
                    if ((conditionalValueThree & conditionalValueFour) != 0) {
                        if (s.charAt(stringIndex) == '.') {
                            char characterToAdd = '0';
                            result = appendCharacter(characterToAdd, result);
                        } else {
                            stringIndex++;
                            if (s.charAt(stringIndex) == '.') {
                                result += '1';
                            } else {
                                result += '2';
                            }
                        }
                    }
                }
                stringIndex++;
            }
        }
        System.out.println(result);
    }
}