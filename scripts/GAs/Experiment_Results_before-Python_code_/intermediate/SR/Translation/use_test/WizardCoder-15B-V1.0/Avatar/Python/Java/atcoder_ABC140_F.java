```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] S = new int[N];
        String[] arr = br.readLine().split(" ");
        for(int i=0;i<N;i++){
            S[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(S);
        boolean[] flag = new boolean[N];
        List<Integer> cur = new ArrayList<Integer>();
        cur.add(S[0]);
        flag[0] = false;
        for(int i=0;i<N;i++){
            int j=0;
            int jM = cur.size();
            for(int k=0;k<N;k++){
                if(!flag[k] && S[k]<cur.get(j)){
                    cur.add(S[k]);
                    j++;
                    flag[k] = false;
                    if(j==jM){
                        break;
                    }
                }
            }
            else{
                System.out.println("No");
                return;
            }
            Collections.sort(cur,Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
}
```
