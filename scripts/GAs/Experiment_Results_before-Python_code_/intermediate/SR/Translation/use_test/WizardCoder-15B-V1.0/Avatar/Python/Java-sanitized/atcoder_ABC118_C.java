import java.util.*;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for(int i=0;i<N;i++){
            A.add(sc.nextInt());
        }
        int gcd = A.stream().reduce(1, (a, b) -> fractions.gcd(a, b));
        System.out.println(gcd);
    }
}