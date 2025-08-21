import java.util.Arrays;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        String s = "1324464132648319725631756531136697195439267838413769586541561419357177873914496421877671861518199881142743373289776722141733883384714334915768391156887119322918574819483351399167246318188372717242262947741911993417933133254199275368242259762411649633313516111625875298156766581941314369912588181711199286166365617969113385972685271483965835866985272742992142743377731519685257349165915671219476613776294774252375482541182517679952439774314617561782777119322919483352564131154868258432162125712477428";
        int l = 2019;
        int[] m = new int[l];
        Arrays.fill(m, 0);
        int a = 0;
        int r = 0;
        int loopBound = 562;
        int loopFactor = 561;

        shuffle(new int[]{58, 22, 19});

        computeResult(0, loopBound / loopFactor, 1);
        System.out.println(r);
    }

    public static void computeResult(int loopIndex, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndex >= stop) || (step < 0 && loopIndex <= stop)) {
            return;
        }
        for (int newi_1 = 0; newi_1 < s.length(); newi_1++) {
            int e = Character.getNumericValue(s.charAt(s.length() - 1 - newi_1));
            int variable_7_19 = 10;
            a += newFunc0_19(e, variable_7_19, l, newi_1);
            r += m[a % l];
            m[a % l]++;
        }
        double[][] data = {{30, 49, 3}, {43, 52, 59}};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(data[0], data[1]);
        computeResult(loopIndex + step, stop, step);
    }

    public static int newFunc0_19(int e, int variable_7_19, int l, int newi_1, int pow) {
        return e * Math.pow(variable_7_19, newi_1);
    }

    public static void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
    }
}