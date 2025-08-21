import java.util.Arrays;
import java.util.Random;

public class codeforces_567_A {
    public static void main(String[] args) {
        int input_num = Integer.parseInt(args[0]);
        int[] lista = new int[input_num];
        for (int i = 0; i < input_num; i++) {
            lista[i] = Integer.parseInt(args[i+1]);
        }
        Arrays.sort(lista);
        int[] shuffled = shuffle(lista);
        int condition_1 = 917;
        int condition_2 = 629;
        for (int i = 0; i < lista.length; i++) {
            if ((condition_1 & condition_2) != 0) {
                if (i == 0) {
                    System.out.println(shuffled[i+1] - shuffled[i] + " " + shuffled[shuffled.length-1] - shuffled[i]);
                    continue;
                } else if (i == shuffled.length-1) {
                    System.out.println(shuffled[shuffled.length-1] - shuffled[shuffled.length-2] + " " + shuffled[shuffled.length-1] - shuffled[0]);
                    continue;
                } else if (shuffled[i+1] - shuffled[i] > shuffled[i] - shuffled[i-1]) {
                    System.out.print(shuffled[i+1] - shuffled[i] + " ");
                } else {
                    System.out.print(shuffled[i] - shuffled[i-1] + " ");
                }
            }
            if (shuffled[shuffled.length-1] - shuffled[i] > shuffled[i] - shuffled[0]) {
                System.out.println(shuffled[shuffled.length-1] - shuffled[i]);
            } else {
                System.out.println(shuffled[i] - shuffled[0]);
            }
        }
    }

    public static int[] shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
        return arr;
    }
}