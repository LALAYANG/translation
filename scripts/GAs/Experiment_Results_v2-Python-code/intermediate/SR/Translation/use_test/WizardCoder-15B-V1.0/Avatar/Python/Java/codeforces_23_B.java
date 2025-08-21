```java
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);
        int outer_loop_limit = 172;
        int inner_loop_limit = 171;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            int[] arr1 = {43, 93, 69};
            int[] arr2 = {29, 98, 17};
            Random rand = new Random();
            int[] arr3 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i] + arr2[i];
            }
            Arrays.sort(arr3);
            int[] arr4 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr4[i] = arr1[i] - arr2[i];
            }
            Arrays.sort(arr4);
            int[] arr5 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr5[i] = arr1[i] * arr2[i];
            }
            Arrays.sort(arr5);
            int[] arr6 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr6[i] = arr1[i] / arr2[i];
            }
            Arrays.sort(arr6);
            int[] arr7 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr7[i] = arr1[i] % arr2[i];
            }
            Arrays.sort(arr7);
            int[] arr8 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr8[i] = arr1[i] ^ arr2[i];
            }
            Arrays.sort(arr8);
            int[] arr9 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr9[i] = arr1[i] & arr2[i];
            }
            Arrays.sort(arr9);
            int[] arr10 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr10[i] = arr1[i] | arr2[i];
            }
            Arrays.sort(arr10);
            int[] arr11 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr11[i] = arr1[i] << arr2[i];
            }
            Arrays.sort(arr11);
            int[] arr12 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr12[i] = arr1[i] >> arr2[i];
            }
            Arrays.sort(arr12);
            int[] arr13 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr13[i] = arr1[i] >>> arr2[i];
            }
            Arrays.sort(arr13);
            int[] arr14 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr14[i] = arr1[i] < arr2[i] ? 1 : 0;
            }
            Arrays.sort(arr14);
            int[] arr15 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr15[i] = arr1[i] <= arr2[i] ? 1 : 0;
            }
            Arrays.sort(arr15);
            int[] arr16 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr16[i] = arr1[i] > arr2[i] ? 1 : 0;
            }
            Arrays.sort(arr16);
            int[] arr17 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr17[i] = arr1[i] >= arr2[i] ? 1 : 0;
            }
            Arrays.sort(arr17);
            int[] arr18 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr18[i] = arr1[i] == arr2[i] ? 1 : 0;
            }
            Arrays.sort(arr18);
            int[] arr19 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr19[i] = arr1[i] != arr2[i] ? 1 : 0;
            }
            Arrays.sort(arr19);
            int[] arr20 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr20[i] = arr1[i] && arr2[i] ? 1 : 0;
            }
            Arrays.sort(arr20);
            int[] arr21 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr21[i] = arr1[i] || arr2[i] ? 1 : 0;
            }
            Arrays.sort(arr21);
            int[] arr22 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr22[i] = arr1[i] ? arr2[i] : 0;
            }
            Arrays.sort(arr22);
            int[] arr23 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr23[i] = arr1[i] ? arr2[i] : arr3[i];
            }
            Arrays.sort(arr23);
            int[] arr24 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr24[i] = arr1[i] ? arr2[i] : arr4[i];
            }
            Arrays.sort(arr24);
            int[] arr25 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr25[i] = arr1[i] ? arr2[i] : arr5[i];
            }
            Arrays.sort(arr25);
            int[] arr26 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr26[i] = arr1[i] ? arr2[i] : arr6[i];
            }
            Arrays.sort(arr26);
            int[] arr27 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr27[i] = arr1[i] ? arr2[i] : arr7[i];
            }
            Arrays.sort(arr27);
            int[] arr28 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr28[i] = arr1[i] ? arr2[i] : arr8[i];
            }
            Arrays.sort(arr28);
            int[] arr29 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr29[i] = arr1[i] ? arr2[i] : arr9[i];
            }
            Arrays.sort(arr29);
            int[] arr30 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr30[i] = arr1[i] ? arr2[i] : arr10[i];
            }
            Arrays.sort(arr30);
            int[] arr31 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr31[i] = arr1[i] ? arr2[i] : arr11[i];
            }
            Arrays.sort(arr31);
            int[] arr32 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr32[i] = arr1[i] ? arr2[i] : arr12[i];
            }
            Arrays.sort(arr32);
            int[] arr33 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr33[i] = arr1[i] ? arr2[i] : arr13[i];
            }
            Arrays.sort(arr33);
            int[] arr34 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr34[i] = arr1[i] ? arr2[i] : arr14[i];
            }
            Arrays.sort(arr34);
            int[] arr35 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr35[i] = arr1[i] ? arr2[i] : arr15[i];
            }
            Arrays.sort(arr35);
            int[] arr36 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr36[i] = arr1[i] ? arr2[i] : arr16[i];
            }
            Arrays.sort(arr36);
            int[] arr37 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr37[i] = arr1[i] ? arr2[i] : arr17[i];
            }
            Arrays.sort(arr37);
            int[] arr38 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr38[i] = arr1[i] ? arr2[i] : arr18[i];
            }
            Arrays.sort(arr38);
            int[] arr39 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr39[i] = arr1[i] ? arr2[i] : arr19[i];
            }
            Arrays.sort(arr39);
            int[] arr40 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr40[i] = arr1[i] ? arr2[i] : arr20[i];
            }
            Arrays.sort(arr40);
            int[] arr41 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr41[i] = arr1[i] ? arr2[i] : arr21[i];
            }
            Arrays.sort(arr41);
            int[] arr42 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr42[i] = arr1[i] ? arr2[i] : arr22[i];
            }
            Arrays.sort(arr42);
            int[] arr43 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr43[i] = arr1[i] ? arr2[i] : arr23[i];
            }
            Arrays.sort(arr43);
            int[] arr44 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr44[i] = arr1[i] ? arr2[i] : arr24[i];
            }
            Arrays.sort(arr44);
            int[] arr45 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr45[i] = arr1[i] ? arr2[i] : arr25[i];
            }
            Arrays.sort(arr45);
            int[] arr46 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr46[i] = arr1[i] ? arr2[i] : arr26[i];
            }
            Arrays.sort(arr46);
            int[] arr47 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr47[i] = arr1[i] ? arr2[i] : arr27[i];
            }
            Arrays.sort(arr47);
            int[] arr48 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr48[i] = arr1[i] ? arr2[i] : arr28[i];
            }
            Arrays.sort(arr48);
            int[] arr49 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr49[i] = arr1[i] ? arr2[i] : arr29[i];
            }
            Arrays.sort(arr49);
            int[] arr50 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr50[i] = arr1[i] ? arr2[i] : arr30[i];
            }
            Arrays.sort(arr50);
            int[] arr51 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr51[i] = arr1[i] ? arr2[i] : arr31[i];
            }
            Arrays.sort(arr51);
            int[] arr52 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr52[i] = arr1[i] ? arr2[i] : arr32[i];
            }
            Arrays.sort(arr52);
            int[] arr53 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr53[i] = arr1[i] ? arr2[i] : arr33[i];
            }
            Arrays.sort(arr53);
            int[] arr54 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr54[i] = arr1[i] ? arr2[i] : arr34[i];
            }
            Arrays.sort(arr54);
            int[] arr55 = new int[arr1.length];
            for (int i = 0; i < arr1.length;
