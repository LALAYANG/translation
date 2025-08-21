import java.util.*;

public class codeforces_299_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int max = arr[n-1];
        for(int i=0;i<n;i++) {
            if(arr[i]%max==0) {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}