import java.util.*;
import java.io.*;

public class codeforces_705_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for(int i=0; i<n; i++) {
            w[i] = sc.nextInt();
        }
        int CurrentValue = 2;
        int ThirdConditionValue = 114;
        int MaxValue = 790;
        int FirstConditionValue = 865;
        int SecondConditionValue = 516;
        double[] arr1 = {19, 99, 30};
        double[] arr2 = {23, 31, 40};
        double t = ttest_ind(arr1, arr2)[0];
        int OuterLoopLimit = 667;
        int InnerLoopStep = 666;
        for(int LoopIndexOut=0; LoopIndexOut<OuterLoopLimit/InnerLoopStep; LoopIndexOut++) {
            for(int i=0; i<n; i++) {
                if((FirstConditionValue&SecondConditionValue) == 0) {
                    if((ThirdConditionValue&MaxValue) == 0) {
                        if(w[i] == 1) {
                            System.out.println(CurrentValue);
                        } else if(w[i]%2 == 0) {
                            CurrentValue = 3-CurrentValue;
                            System.out.println(CurrentValue);
                        } else {
                            System.out.println(CurrentValue);
                        }
                    }
                }
            }
        }
    }
}