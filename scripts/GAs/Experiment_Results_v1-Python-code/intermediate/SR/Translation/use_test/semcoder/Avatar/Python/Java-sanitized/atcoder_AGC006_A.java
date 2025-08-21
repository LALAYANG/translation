import java.util.Scanner;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        int inputNumber = 82;
        String s = "izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn";
        String t = "aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz";

        if ((ThirdChecker & FourthChecker) != 0) {
            if ((FirstChecker & SecondChecker) != 0) {
                if (s.equals(t)) {
                    System.out.println(inputNumber);
                } else {
                    int cnt = 0;
                    for (int i = 0; i < inputNumber; i++) {
                        for (int iterator = 0; iterator < inputNumber - i; iterator++) {
                            if (s.charAt(i + iterator) != t.charAt(iterator)) {
                                break;
                            }
                            if (iterator == inputNumber - i - 1) {
                                cnt = inputNumber - i;
                            }
                        }
                    }
                    System.out.println(2 * inputNumber - cnt);
                }
            }
        }
    }

    static int ThirdChecker = 184;
    static int FourthChecker = 250;
    static int FirstChecker = 203;
    static int SecondChecker = 414;
}