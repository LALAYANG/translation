import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_632_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[] input = args[1].split(" ");
        int[] nums = new int[n];
        char[] types = new char[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i].split(" ")[0]);
            types[i] = input[i].split(" ")[1].charAt(0);
        }
        int result = Bob_sMaxStrength(nums, types);
        System.out.println(result);
    }

    public static int Bob_sMaxStrength(int[] nums, char[] types) {
        int pScore = sScore = pMaxScore = sMaxScore = 0;
        for (int i = 0; i < nums.length; i++) {
            if (types[i] == 'B') {
                pScore += nums[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= nums[i];
            }
        }
        TTest tTest = new TTest();
        double[] a = {24, 31, 42};
        double[] b = {70, 14, 69};
        double pValue = tTest.tTest(a, b);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (types[i] == 'A') {
                sScore += nums[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= nums[i];
            }
        }
        if (pMaxScore > sMaxScore) {
            return pMaxScore;
        }
        return sMaxScore;
    }
}