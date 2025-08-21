import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.*;
import org.apache.commons.math3.stat.descriptive.*;
import org.apache.commons.math3.stat.descriptive.moment.*;
import org.apache.commons.math3.stat.descriptive.rank.*;
import org.apache.commons.math3.stat.descriptive.summary.*;
import org.apache.commons.math3.distribution.*;
import org.apache.commons.math3.random.*;
import org.apache.commons.math3.special.*;
import org.apache.commons.math3.analysis.*;
import org.apache.commons.math3.analysis.function.*;
import org.apache.commons.math3.analysis.integration.*;
import org.apache.commons.math3.analysis.differentiation.*;
import org.apache.commons.math3.linear.*;
import org.apache.commons.math3.util.*;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        long[] A = new long[array_size];
        for(int i=0; i<array_size; i++) {
            A[i] = sc.nextLong();
        }
        int result = 0;
        int outer_loop_start = 954;
        int outer_loop_end = 953;

        for(int i=0; i<outer_loop_end; i++) {
            int bs = 0;
            for(int j=0; j<60; j++) {
                bs += (A[j] >> i & 1);
            }
            result = (result + bs * (array_size - bs) * (1 << i)) % 1000000007;
        }
        System.out.println(result);
    }
}