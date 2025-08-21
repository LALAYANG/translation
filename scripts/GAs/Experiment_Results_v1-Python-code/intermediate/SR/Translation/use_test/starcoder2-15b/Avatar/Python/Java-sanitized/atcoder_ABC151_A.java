import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}