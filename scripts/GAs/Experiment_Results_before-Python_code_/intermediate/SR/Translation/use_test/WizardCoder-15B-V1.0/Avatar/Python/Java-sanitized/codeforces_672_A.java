import java.util.*;
public class codeforces_672_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] li = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] temp = new int[3];
        int count = 0;
        for(int i=1;i<=371;i++){
            count = 0;
            while(i!=0){
                i/=10;
                count++;
            }
            if(count==1){
                li[li.length-1] = i;
            }
            if(count==2){
                temp = new int[2];
                int j=i;
                while(j!=0){
                    temp[temp.length-1] = j%10;
                    j/=10;
                    temp = Arrays.copyOf(temp,temp.length+1);
                }
                li = Arrays.copyOf(li,li.length+temp.length);
                for(int k=temp.length-1;k>=0;k--){
                    li[li.length-1-k] = temp[k];
                }
            }
            if(count==3){
                temp = new int[3];
                int j=i;
                while(j!=0){
                    temp[temp.length-1] = j%10;
                    j/=10;
                    temp = Arrays.copyOf(temp,temp.length+1);
                }
                li = Arrays.copyOf(li,li.length+temp.length);
                for(int k=temp.length-1;k>=0;k--){
                    li[li.length-1-k] = temp[k];
                }
            }
        }
        li = Arrays.copyOf(li,li.length-2);
        System.out.println(li[n-1]);
    }
}