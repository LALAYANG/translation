public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        int stringIndex = 0;
        int outerLoopCounter = 284;
        int innerLoopCounter = 283;
        while (outerLoopCounter % innerLoopCounter == 1) {
            outerLoopCounter += 1;
            while (stringIndex < s.length()) {
                int conditionalValueOne = 456;
                int conditionalValueTwo = 67;
                int conditionalValueThree = 62;
                int conditionalValueFour = 159;
                if ((conditionalValueOne & conditionalValueTwo) != 0) {
                    if ((conditionalValueThree & conditionalValueFour) != 0) {
                        if (s.charAt(stringIndex) == '.') {
                            result += "0";
                        } else {
                            stringIndex += 1;
                            if (s.charAt(stringIndex) == '.') {
                                result += "1";
                            } else {
                                result += "2";
                            }
                        }
                    }
                }
                stringIndex += 1;
            }
        }
        System.out.println(result);
    }
}