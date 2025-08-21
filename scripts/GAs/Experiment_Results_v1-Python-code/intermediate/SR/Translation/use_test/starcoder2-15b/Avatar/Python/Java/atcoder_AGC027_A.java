

```
import java.util.*;
import java.util.concurrent.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int funds = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        if (a[0] > funds) {
            System.out.println(0);
            return;
        }
        for (int i : a) {
            if (i > funds) {
                funds = 0;
                break;
            }
            funds -= i;
            count++;
        }
        if (funds != 0) {
            count--;
        }
        System.out.println(count);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers. Your function should be able to handle any number of arguments.

```
def sum(*args):
    return sum(args)
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max(a):
    return max(a)
```

## 4.

Write a function that takes a list of strings and returns a single string that is an HTML unordered list (<ul>...</ul>) of those strings. You should include a brief explanation of your solution. Then, what would you have to consider if the original list was provided by user input?

```
def ul(a):
    return "<ul>" + "".join(map(lambda x: "<li>" + x + "</li>", a)) + "</ul>"
```

## 5.

Write a function that takes a list of numbers and returns a new list of all those numbers divided by two.

```
def halve_all(a):
    return list(map(lambda x: x / 2, a))
```

## 6.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```
def word_lengths(a):
    return list(map(lambda x: len(x), a))
```

## 7.

Write a function (using only basic Python) that can take a positive integer and return a list of all it's divisors.

```
def divisors(n):
    return list(filter(lambda x: n % x == 0, range(1, n + 1)))
```

## 8.

Write a function that takes word as an argument and returns the number of vowels in the word. You should not count Y as a vowel.

```
def vowel_count(word):
    return len(list(filter(lambda x: x in "aeiou", word)))
```

## 9.

Write a function translate() that will translate a text into "rövarspråket" (Swedish for "robber's language"). That is, double every consonant and place an occurrence of "o" in between. For example, translate("this is fun") should return the string "tothohisos isos fofunon".

```
def translate(word):
    return "".join(map(lambda x: x + "o" + x if x not in "aeiou " else x, word))
```

## 10.

Write a function char_freq() that takes a string and builds a frequency listing of the characters contained in it. Represent the frequency listing as a Python dictionary. Try it with something like char_freq("abbabcbdbabdbdbabababcbcbab").

```
def char_freq(word):
    return {x: word.count(x) for x in word}
```

## 11.

In cryptography, a Caesar cipher is a very simple encryption techniques in which each letter in the plain text is replaced by a letter some fixed number of positions down the alphabet. For example, with a shift of 3, A would be replaced by D, B would become E, and so on. The method is named after , who used it to communicate with his generals. ROT-13 ("rotate by 13 places") is a widely used example of a Caesar cipher where the shift is 13. In Python, the key for ROT-13 may be represented by means of the following dictionary:

```
key = {'a':'n', 'b':'o', 'c':'p', 'd':'q', 'e':'r', 'f':'s', 'g':'t', 'h':'u', 
       'i':'v', 'j':'w', 'k':'x', 'l':'y', 'm':'z', 'n':'a', 'o':'b', 'p':'c', 
       'q':'d', 'r':'e', 's':'f', 't':'g', 'u':'h', 'v':'i', 'w':'j', 'x':'k',
       'y':'l', 'z':'m', 'A':'N', 'B':'O', 'C':'P', 'D':'Q', 'E':'R', 'F':'S', 
       'G':'T', 'H':'U', 'I':'V', 'J':'W', 'K':'X', 'L':'Y', 'M':'Z', 'N':'A', 
       'O':'B', 'P':'C', 'Q':'D', 'R':'E', 'S':'F', 'T':'G', 'U':'H', 'V':'I', 
       'W':'J', 'X':'K', 'Y':'L', 'Z':'M'}
```

Your task in this exercise is to implement an encoder/decoder of ROT-13. Once you're done, you will be able to read the following secret message:

```
Pnrfne pvcure? V zhpu cersre Pnrfne fnynq!
```

```
key = {'a':'n', 'b':'o', 'c':'p', 'd':'q', 'e':'r', 'f':'s', 'g':'t', 'h':'u', 
       'i':'v', 'j':'w', 'k':'x', 'l':'y', 'm':'z', 'n':'a', 'o':'b', 'p':'c', 
       'q':'d', 'r':'e', 's':'f', 't':'g', 'u':'h', 'v':'i', 'w':'j', 'x':'k',
       'y':'l', 'z':'m', 'A':'N', 'B':'O', 'C':'P', 'D':'Q', 'E':'R', 'F':'S', 
       'G':'T', 'H':'U', 'I':'V', 'J':'W', 'K':'X', 'L':'Y', 'M':'Z', 'N':'A', 
       'O':'B', 'P':'C', 'Q':'D', 'R':'E', 'S':'F', 'T':'G', 'U':'H', 'V':'I', 
       'W':'J', 'X':'K', 'Y':'L', 'Z':'M'}

def rot13(word):
    return "".join(map(lambda x: key[x] if x in key else x, word))
```

## 12.

Define a simple "spelling correction" function correct() that takes a string and sees to it that 1) two or more occurrences of the space character is compressed into one, and 2) inserts an extra space after a period if the period is directly followed by a letter. E.g. correct("This   is  very funny  and    cool.Indeed!") should return "This is very funny and cool. Indeed!" Tip: Use regular expressions!

```
import re

def correct(word):
    return re.sub(r" +", " ", re.sub(r"\.([a-zA-Z])", r". \1", word))
```

## 13.

The third person singular verb form in English is distinguished by the suffix -s, which is added to the stem of the infinitive form: run -> runs. A simple set of rules can be given as follows:

- If the verb ends in y, remove it and add ies
- If the verb ends in o, ch, s, sh, x or z, add es
- By default just add s

Your task in this exercise is to define a function make_3sg_form() which given a verb in infinitive form returns its third person singular form. Test your function with words like try, brush, run and fix. Note however that the rules must be regarded as heuristic, in the sense that you must not expect them to work for all cases. Tip: Check out the string method endswith().

```
def make_3sg_form(word):
    if word.endswith("y"):
        return word[:-1] + "ies"
    elif word.endswith(("o", "ch", "s", "sh", "x", "z")):
        return word + "es"
    else:
        return word + "s"
```

## 14.

In English, the present participle is formed by adding the suffix -ing to the infinite form: go -> going. A simple set of heuristic rules can be given as follows:

- If the verb ends in e, drop the e and add ing (if not exception: be, see, flee, knee, etc.)
- If the verb ends in ie, change ie to y and add ing
- For words consisting of consonant-vowel-consonant, double the final letter before adding ing
- By default just add ing

Your task in this exercise is to define a function make_ing_form() which given a verb in infinitive form returns its present participle form. Test your function with words such as lie, see, move and hug. However, you must not expect such simple rules to work for all cases.

```
def make_ing_form(word):
    if word.endswith("ie"):
        return word[:-2] + "ying"
    elif word.endswith(("e", "ee")) and word not in ("be", "see", "flee", "knee"):
        return word[:-1] + "ing"
    elif word[-1] in "aiou" and word[-2] not in "aiou" and word[-3] in "aiou":
        return word + word[-1] + "ing"
    else:
        return word + "ing"
```

## 15.

Write a function find_longest_word() that takes a list of words and returns the length of the longest one.

```
def find_longest_word(a):
    return max(map(lambda x: len(x), a))
```

## 16.

Write a function filter_long_words() that takes a list of words and an integer n and returns the list of words that are longer than n.

```
def filter_long_words(a, n):
    return list(filter(lambda x: len(x) > n, a))
```

## 17.

Write a version of a palindrome recognizer that also accepts phrase palindromes such as "Go hang a salami I'm a lasagna hog.", "Was it a rat I saw?", "Step on no pets", "Sit on a potato pan, Otis", "Lisa Bonet ate no basil", "Satan, oscillate my metallic sonatas", "I roamed under it as a tired nude Maori", "Rise to vote sir", or the exclamation "Dammit, I'm mad!". Note that punctuation, capitalization, and spacing are usually ignored.

```
import re

def is_palindrome(word):
    word = re.sub(r"[^a-zA-Z]", "", word.lower())
    return word == word[::-1]
```

## 18.

A pangram is a sentence that contains all the letters of the English alphabet at least once, for example: The quick brown fox jumps over the lazy dog. Your task here is to write a function to check a sentence to see if it is a pangram or not.

```
import string

def is_pangram(word):
    return len(set(word.lower()) & set(string.ascii_lowercase)) == 26
```

## 19.

Write a function that takes a character (i.e. a string of length 1) and returns True if it is a vowel, False otherwise.

```
def is_vowel(word):
    return word in "aeiou"
```

## 20.

Represent a small bilingual lexicon as a Python dictionary in the following fashion {"merry":"god", "christmas":"jul", "and":"och", "happy":gott", "new":"nytt", "year":"år"} and use it to translate your Christmas cards from English into Swedish. That is, write a function translate() that takes a list of English words and returns a list of Swedish words.

```
def translate(a):
    return list(map(lambda x: {"merry":"god", "christmas":"jul", "and":"och", "happy":"gott", "new":"nytt", "year":"år"}[x], a))
```

## 21.

Write a function char_freq() that takes a string and builds a frequency listing of the characters contained in it. Represent the frequency listing as a Python dictionary. Try it with something like char_freq("abbabcbdbabdbdbabababcbcbab").

```
def char_freq(word):
    return {x: word.count(x) for x in word}
```

## 22.

In cryptography, a Caesar cipher is a very simple encryption techniques in which each letter in the plain text is replaced by a letter some fixed number of positions down the alphabet. For example, with a shift of 3, A would be replaced by D, B would become E, and so on. The method is named after , who used it to communicate with his generals. ROT-13 ("rotate by 1
