```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    static class PowerSum {
        int variable_6_41;
        int addend;
        int variable_4_41;

        PowerSum(int variable_6_41, int addend, int variable_4_41) {
            this.variable_6_41 = variable_6_41;
            this.addend = addend;
            this.variable_4_41 = variable_4_41;
        }

        int calculate() {
            try {
                Thread.sleep(180);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return (int)Math.pow(variable_4_41, variable_6_41) + addend;
        }
    }

    static class SumOfPowers {
        int variable_6_23;
        int variable_3_23;
        int variable_4_23;

        SumOfPowers(int variable_6_23, int variable_3_23, int variable_4_23) {
            this.variable_6_23 = variable_6_23;
            this.variable_3_23 = variable_3_23;
            this.variable_4_23 = variable_4_23;
        }

        int calculate() {
            return (int)Math.pow(variable_4_23, variable_6_23) + variable_3_23;
        }
    }

    public static void main (String[] args) throws java.lang.Exception {
        int variable_3_23 = 7;
        int variable_4_23 = 10;
        int variable_6_23 = 9;

        SumOfPowers sumOfPowers = new SumOfPowers(variable_6_23, variable_3_23, variable_4_23);
        int calculatedValue = sumOfPowers.calculate();
        int P = calculatedValue;

        int addend = 10;
        int variable_4_41 = 10;
        int variable_6_41 = 9;

        PowerSum powerSum = new PowerSum(variable_6_41, addend, variable_4_41);
        int INF = powerSum.calculate();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        float b = Float.parseFloat(s[1]);
        b = b * 100;
        int result = (int)(a * b) / 100;
        System.out.println(result);
    }
}
```

