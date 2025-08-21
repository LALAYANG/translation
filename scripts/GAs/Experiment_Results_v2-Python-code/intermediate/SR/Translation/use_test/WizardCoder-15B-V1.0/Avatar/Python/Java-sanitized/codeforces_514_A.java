import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_514_A {
    public static void main(String[] args) {
        int[] sample1 = {95, 1, 91};
        int[] sample2 = {86, 27, 13};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(sample1, sample2);
        if (pValue < 0.05) {
            // perform t-test
        }
        String inputString = "332711047202";
        String outputString = "";
        int checkInitialCondition = 295;
        int checkSecondaryCondition = 796;
        int checkFirstCondition = 727;
        int checkTertiaryCondition = 514;
        if ((checkInitialCondition & checkSecondaryCondition) == 0) {
            outputString = inputString;
        } else {
            if ((checkFirstCondition & checkTertiaryCondition) == 0) {
                outputString = inputString;
            } else {
                if (inputString.length() != 1) {
                    if (inputString.charAt(0) == '9') {
                        outputString = "9";
                        inputString = inputString.substring(1);
                    }
                    int loopEnd = 435;
                    int loopStart = 434;
                    for (int i = 0; i < loopEnd / loopStart; i++) {
                        for (int j = 0; j < inputString.length(); j++) {
                            if (Character.getNumericValue(inputString.charAt(j)) > 4) {
                                int complement = 9 - Character.getNumericValue(inputString.charAt(j));
                                outputString += complement;
                            } else {
                                outputString += inputString.charAt(j);
                            }
                        }
                    }
                } else {
                    outputString = inputString;
                }
            }
        }
        System.out.println(outputString);
    }
}