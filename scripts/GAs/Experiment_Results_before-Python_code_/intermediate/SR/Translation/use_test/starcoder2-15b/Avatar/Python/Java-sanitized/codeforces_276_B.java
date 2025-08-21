import java.util.*;
public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            n = s.length();
            if(n==1){
                System.out.println(1);
            }
            else{
                int cnt=1;
                int mx=1;
                for(int j=1;j<n;j++){
                    if(s.charAt(j)==s.charAt(j-1)){
                        cnt++;
                    }
                    else{
                        cnt=1;
                    }
                    mx = Math.max(mx,cnt);
                }
                System.out.println(mx);
            }
        }
    }
}