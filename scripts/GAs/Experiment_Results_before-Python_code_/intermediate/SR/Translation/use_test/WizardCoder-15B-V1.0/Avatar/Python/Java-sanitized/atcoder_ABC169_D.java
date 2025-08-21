import java.util.*;
import java.io.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println(0);
            return;
        }
        List<Integer> factors = new ArrayList<>();
        factors.addAll(primeFactorize(n));
        int ans = 0;
        for(int i=1; i<=99999999; i++){
            int count = 0;
            for(int factor : factors){
                if(factor <= i){
                    count++;
                }
            }
            ans += count;
        }
        System.out.println(ans);
    }

    public static List<Integer> primeFactorize(int n){
        List<Integer> factors = new ArrayList<>();
        while(n % 2 == 0){
            factors.add(2);
            n /= 2;
        }
        int f = 3;
        while(f * f <= n){
            if(n % f == 0){
                factors.add(f);
                n /= f;
            }else{
                f += 2;
            }
        }
        if(n != 1){
            factors.add(n);
        }
        return factors;
    }
}