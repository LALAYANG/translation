import java.math.BigInteger;
import java.util.Arrays;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        String s = "13244641326483197256317565311366971954392678384137695865415614193571778739144964218776718615181998811427433732897767221417338833847143349157683911568871193229185748194833513991672463181883727172422629477419119934179331332541992753682422597624116496333313516111625875298156766581941314369912588181711199286166365617969113385972685271483965835866985272742992142743377731519685257349165915671219476613776294774252375482541182517679952439774314617561782777119322919483352564131154868258432162125712477428";
        int l = 2019;
        BigInteger[] m = new BigInteger[l];
        Arrays.fill(m, BigInteger.ZERO);
        BigInteger a = BigInteger.ZERO, r = BigInteger.ZERO;
        for (int i = 0; i < s.length(); i++) {
            a = a.add(new BigInteger(String.valueOf(s.charAt(i))).multiply(BigInteger.TEN.pow(i).mod(BigInteger.valueOf(l))));
            r = r.add(m[a.mod(BigInteger.valueOf(l)).intValue()]);
            m[a.mod(BigInteger.valueOf(l)).intValue()] = m[a.mod(BigInteger.valueOf(l)).intValue()].add(BigInteger.ONE);
        }
        System.out.println(r.mod(BigInteger.valueOf(l)));
    }
}