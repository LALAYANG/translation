
[ENG]
You are an expert Java programmer and assistant
<</ENG>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```
[/ENG]

[PL]
Jesteś eksperckim programistą Java i asystentem
<</PL>>

Przetłumacz poniższy kod Pythona na Java i zawiń swoją rozwiązanie pomiędzy ```java i ```.
Przykładowy test:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```
[/PL]

[DE]
Du bist ein erfahrener Java-Programmierer und Assistent
<</DE>>

Übersetze den folgenden Python-Code in Java und umschließe deine Lösung mit ```java und ```.
Ein Beispieltest ist unten angegeben:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```
[/DE]

[RU]
Вы - опытный программист Java и ассистент
<</RU>>

Переведите следующий код Python на Java и заключите ваше решение в ```java и ```.
Пример теста:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```
[/RU]

[TR]
Sen Java uzmanı ve yardımcısın
<</TR>>

Aşağıdaki Python kodunu Java'ya çevirin ve çözümünüzü ```java ve ``` içinde sarmalayın.
Bir örnek test aşağıda verilmiştir:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```
[/TR]

[ES]
Usted es un experto en programación Java y asistente
<</ES>>

Traduce el siguiente código de Python a Java y envuelva tu solución entre ```java y ```.
Un ejemplo de prueba se proporciona a continuación:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```
[/ES]

[IT]
Sei un esperto di programmazione Java e assistente
<</IT>>

Traduci il seguente codice Python in Java e racchiudi la tua soluzione tra ```java e ```.
Un esempio di testo è fornito di seguito:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```
[/IT]

[PT]
Você é um programador Java experiente e assistente
<</PT>>

Traduza o seguinte código Python para Java e envolva sua solução entre ```java e ```.
Um exemplo de teste é fornecido abaixo:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```
[/PT]

[NL]
Je bent een ervaren Java-programmeur en assistent
<</NL>>

Vertaal de volgende Python-code naar Java en omhul je oplossing tussen ```java en ```.
Een voorbeeldtest wordt hieronder gegeven:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```
[/NL]

[HU]
Te vagy egy Java-szakértő és segítő
<</HU>>

Átírd a következő Python-kódot Java-ra, és csomagold be a megoldást a ```java és ``` között.
Példa teszt:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```
[/HU]

[RO]
Ești un programator Java expert și asistent
<</RO>>

Traducerea următoarei coduri Python în Java și încapsulați soluția dumneavoastră între ```java și ```.
Un exemplu de test este oferit mai jos:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```
[/RO]

[BR]
Você é um programador Java experiente e assistente
<</BR>>

Traduza o seguinte código Python para Java e envolva sua solução entre ```java e ```.
Um exemplo de teste é fornecido abaixo:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```
[/BR]

[FI]
Olet Java-kehittäjä ja apuhenkilö
<</FI>>

K
