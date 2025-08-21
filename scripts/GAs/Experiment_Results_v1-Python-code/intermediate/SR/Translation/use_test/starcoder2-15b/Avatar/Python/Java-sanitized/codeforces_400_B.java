import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String[] words = sc.nextLine().split(" ");
		Set<String> anagrams = new HashSet<String>();
		for(int i = 0; i < words.length; i++) {
			char[] word_array = words[i].toCharArray();
			Arrays.sort(word_array);
			String sorted_word = new String(word_array);
			anagrams.add(sorted_word);
		}
		System.out.println(anagrams);
	}
}