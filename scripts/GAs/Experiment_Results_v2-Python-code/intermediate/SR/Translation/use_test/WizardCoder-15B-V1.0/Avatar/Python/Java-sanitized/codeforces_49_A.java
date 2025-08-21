import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_49_A {
    public static void main(String[] args) {
        double[] sample1 = {54, 47, 80};
        double[] sample2 = {74, 9, 18};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(sample1, sample2);
        if (pValue < 0.05) {
            System.out.println("NO");
        } else {
            String input = "dJcNqQiFXzcbsj fItCpBLyXOnrSBPebwyFHlxUJHqCUzzCmcAvMiKL NunwOXnKeIxUZmBVwiCUfPkjRAkTPbkYCmwRRnDSLaz?";
            char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
            boolean SecondConditionChecker = true;
            boolean SecondInnerConditionChecker = true;
            boolean InitialConditionChecker = true;
            boolean FirstInnerConditionChecker = true;
            boolean OuterLoopChecker = true;
            boolean InnerLoopChecker = true;
            for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopChecker / InnerLoopChecker; LoopIndexOut++) {
                for (int i = input.length() - 1; i >= 0; i--) {
                    if (InitialConditionChecker && FirstInnerConditionChecker) {
                        if (SecondConditionChecker && SecondInnerConditionChecker) {
                            if (input.charAt(i) == ' ' || input.charAt(i) == '?') {
                                continue;
                            } else {
                                boolean isVowel = false;
                                for (char vowel : vowels) {
                                    if (input.charAt(i) == vowel) {
                                        isVowel = true;
                                        break;
                                    }
                                }
                                if (isVowel) {
                                    System.out.println("YES");
                                } else {
                                    System.out.println("NO");
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}