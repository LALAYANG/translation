import java.util.Arrays;
import java.util.stream.IntStream;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        String input = "13244641326483197256317565311366971954392678384137695865415614193571778739144964218776718615181998811427433732897767221417338833847143349157683911568871193229185748194833513991672463181883727172422629477419119934179331332541992753682422597624116496333313516111625875298156766581941314369912588181711199286166365617969113385972685271483965835866985272742992142743377731519685257349165915671219476613776294774252375482541182517679952439774314617561782777119322919483352564131154868258432162125712477428";
        int dividend = 159;
        int divisor = 158;
        int[] moduloCounts = new int[dividend];
        Arrays.fill(moduloCounts, 1);
        int resultSum = 0;

        for (int i = 0; i < dividend; i++) {
            int a = 0;
            for (int j = 0; j < input.length(); j++) {
                a += (input.charAt(j) - '0') * Math.pow(10, j, dividend);
                resultSum += moduloCounts[a % dividend];
                moduloCounts[a % dividend]++;
            }
        }

        double tStatistic = (resultSum - dividend / divisor) / Math.sqrt(dividend / divisor * (1 - dividend / divisor));
        double pValue = 2 * (1 - Math.abs(tStatistic));

        System.out.println("t-statistic: " + tStatistic);
        System.out.println("p-value: " + pValue);
    }
}