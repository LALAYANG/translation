import java.util.*;

public class atcoder_ABC155_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = (dp[i-1]+10-1)%1000000007;
            if(dp[i]<=4){
                dp[i] = (dp[i]+dp[i-2])%1000000007;
            }else{
                dp[i] = (dp[i]+dp[i-2])%1000000007;
                dp[i] = (dp[i]+10-1)%1000000007;
            }
        }
        System.out.println(dp[n]);
    }
}