```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[n - 1];
        int min = arr[0];
        int diff = max - min;
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i] - min;
        }
        int[] newArr2 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr2[i] = newArr[i] / diff;
        }
        int[] newArr3 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr3[i] = newArr2[i] * 100;
        }
        int[] newArr4 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr4[i] = newArr3[i] * 100;
        }
        int[] newArr5 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr5[i] = newArr4[i] * 100;
        }
        int[] newArr6 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr6[i] = newArr5[i] * 100;
        }
        int[] newArr7 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr7[i] = newArr6[i] * 100;
        }
        int[] newArr8 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr8[i] = newArr7[i] * 100;
        }
        int[] newArr9 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr9[i] = newArr8[i] * 100;
        }
        int[] newArr10 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr10[i] = newArr9[i] * 100;
        }
        int[] newArr11 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr11[i] = newArr10[i] * 100;
        }
        int[] newArr12 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr12[i] = newArr11[i] * 100;
        }
        int[] newArr13 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr13[i] = newArr12[i] * 100;
        }
        int[] newArr14 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr14[i] = newArr13[i] * 100;
        }
        int[] newArr15 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr15[i] = newArr14[i] * 100;
        }
        int[] newArr16 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr16[i] = newArr15[i] * 100;
        }
        int[] newArr17 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr17[i] = newArr16[i] * 100;
        }
        int[] newArr18 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr18[i] = newArr17[i] * 100;
        }
        int[] newArr19 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr19[i] = newArr18[i] * 100;
        }
        int[] newArr20 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr20[i] = newArr19[i] * 100;
        }
        int[] newArr21 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr21[i] = newArr20[i] * 100;
        }
        int[] newArr22 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr22[i] = newArr21[i] * 100;
        }
        int[] newArr23 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr23[i] = newArr22[i] * 100;
        }
        int[] newArr24 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr24[i] = newArr23[i] * 100;
        }
        int[] newArr25 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr25[i] = newArr24[i] * 100;
        }
        int[] newArr26 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr26[i] = newArr25[i] * 100;
        }
        int[] newArr27 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr27[i] = newArr26[i] * 100;
        }
        int[] newArr28 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr28[i] = newArr27[i] * 100;
        }
        int[] newArr29 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr29[i] = newArr28[i] * 100;
        }
        int[] newArr30 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr30[i] = newArr29[i] * 100;
        }
        int[] newArr31 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr31[i] = newArr30[i] * 100;
        }
        int[] newArr32 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr32[i] = newArr31[i] * 100;
        }
        int[] newArr33 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr33[i] = newArr32[i] * 100;
        }
        int[] newArr34 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr34[i] = newArr33[i] * 100;
        }
        int[] newArr35 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr35[i] = newArr34[i] * 100;
        }
        int[] newArr36 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr36[i] = newArr35[i] * 100;
        }
        int[] newArr37 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr37[i] = newArr36[i] * 100;
        }
        int[] newArr38 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr38[i] = newArr37[i] * 100;
        }
        int[] newArr39 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr39[i] = newArr38[i] * 100;
        }
        int[] newArr40 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr40[i] = newArr39[i] * 100;
        }
        int[] newArr41 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr41[i] = newArr40[i] * 100;
        }
        int[] newArr42 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr42[i] = newArr41[i] * 100;
        }
        int[] newArr43 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr43[i] = newArr42[i] * 100;
        }
        int[] newArr44 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr44[i] = newArr43[i] * 100;
        }
        int[] newArr45 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr45[i] = newArr44[i] * 100;
        }
        int[] newArr46 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr46[i] = newArr45[i] * 100;
        }
        int[] newArr47 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr47[i] = newArr46[i] * 100;
        }
        int[] newArr48 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr48[i] = newArr47[i] * 100;
        }
        int[] newArr49 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr49[i] = newArr48[i] * 100;
        }
        int[] newArr50 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr50[i] = newArr49[i] * 100;
        }
        int[] newArr51 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr51[i] = newArr50[i] * 100;
        }
        int[] newArr52 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr52[i] = newArr51[i] * 100;
        }
        int[] newArr53 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr53[i] = newArr52[i] * 100;
        }
        int[] newArr54 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr54[i] = newArr53[i] * 100;
        }
        int[] newArr55 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr55[i] = newArr54[i] * 100;
        }
        int[] newArr56 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr56[i] = newArr55[i] * 100;
        }
        int[] newArr57 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr57[i] = newArr56[i] * 100;
        }
        int[] newArr58 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr58[i] = newArr57[i] * 100;
        }
        int[] newArr59 = new int[n];
        for (int i = 0; i < n; i++) {
            newArr59[i] = newArr58[i] * 100;
        }
        int[] newArr60 = new int[n];
        for (int
