import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC164_D {
    private static final int l = 2019;
    private static List<BigInteger> moduloCounts = new ArrayList<>();
    private static BigInteger resultSum = BigInteger.ZERO;
    private static BigInteger a = BigInteger.ZERO;
    private static String s;
    private static int dividend = 159;
    private static int divisor = 158;

    public static void main(String[] args) {
        s = "13244641326483197256317565311366971954392678384137695865415614193571778739144964218776718615181998811427433732897767221417338833847143349157683911568871193229185748194833513991672463181883727172422629477419119934179331332541992753682422597624116496333313516111625875298156766581941314369912588181711199286166365617969113385972685271483965835866985272742992142743377731519685257349165915671219476613776294774252375482541182517679952439774314617561782777119322919483352564131154868258432162125712477428";
        moduloCounts.add(BigInteger.ONE);
        for (int i = 0; i < l; i++) {
            moduloCounts.add(BigInteger.ZERO);
        }
        recursiveLoop(BigInteger.ZERO, BigInteger.valueOf(dividend / divisor), BigInteger.ONE);
        System.out.println(resultSum);
    }

    private static void recursiveLoop(BigInteger loopIndexOut, BigInteger stop, BigInteger step) {
        if (step.compareTo(BigInteger.ZERO) == 0 || (step.compareTo(BigInteger.ONE) > 0 && loopIndexOut.compareTo(stop) >= 0) || (step.compareTo(BigInteger.ONE) < 0 && loopIndexOut.compareTo(stop) <= 0)) {
            return;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            a = a.add(new BigInteger(String.valueOf(s.charAt(i))).multiply(BigInteger.TEN.pow(i)));
            a = a.mod(BigInteger.valueOf(l));
            resultSum = resultSum.add(moduloCounts.get(a.intValue()));
            moduloCounts.set(a.intValue() + 1, moduloCounts.get(a.intValue() + 1).add(BigInteger.ONE));
        }
        recursiveLoop(loopIndexOut.add(step), stop, step);
    }
}