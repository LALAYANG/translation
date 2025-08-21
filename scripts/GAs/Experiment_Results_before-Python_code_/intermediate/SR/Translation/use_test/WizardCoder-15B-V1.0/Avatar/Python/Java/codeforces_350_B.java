```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n+1];
        t[0] = 0;
        for(int i=1;i<=n;i++){
            t[i] = sc.nextInt();
        }
        int[] a = new int[n+1];
        a[0] = 0;
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
        int[] cnt = new int[n+1];
        for(int i=1;i<=n;i++){
            cnt[a[i]]++;
        }
        int[] ans = new int[n+1];
        for(int i=1;i<=n;i++){
            if(t[i]==1){
                int x = a[i];
                int[] crt = new int[n+1];
                crt[0] = i;
                int j=1;
                while(cnt[x]==1){
                    crt[j] = x;
                    j++;
                    x = a[x];
                }
                if(j>ans.length){
                    ans = Arrays.copyOf(crt,j);
                }else{
                    for(int k=0;k<j;k++){
                        ans[k] = crt[k];
                    }
                }
            }
        }
        System.out.println(ans.length);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
```
