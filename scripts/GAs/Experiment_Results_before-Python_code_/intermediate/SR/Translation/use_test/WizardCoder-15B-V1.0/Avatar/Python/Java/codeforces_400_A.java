```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            solve();
        }
    }
    public static void solve(){
        String x = sc.next();
        int[] s = new int[x.length()];
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='O'){
                s[i]=0;
            }else{
                s[i]=1;
            }
        }
        List<int[]> res = new ArrayList<>();
        for(int i=1;i<=12;i++){
            if(12%i==0){
                if(help(i,12/i,s)){
                    res.add(new int[]{i,12/i});
                }
            }
        }
        Collections.sort(res, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        System.out.print(res.size()+" ");
        for(int[] r:res){
            System.out.print(r[0]+"x"+r[1]+" ");
        }
        System.out.println();
    }
    public static boolean help(int a,int b,int[] s){
        int[][] tot = new int[b][a];
        int c=0;
        for(int i=0;i<s.length;i++){
            if(s[i]==0){
                tot[c][0]++;
            }else{
                tot[c][tot[c][0]]++;
                c=(c+1)%b;
            }
        }
        for(int i=0;i<b;i++){
            if(Arrays.stream(tot[i]).sum()==a){
                return true;
            }
        }
        return false;
    }
}
```
