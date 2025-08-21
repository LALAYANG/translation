
[ENG]
You are an expert Java programmer and assistant
<</ENG>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
1 3 5 7 9 8 6 4 2 0

Expected output:
9


```
def main_function ( ) :
    n = int ( input ( ) )
    a = [ int ( i ) for i in input ( ).split ( " " ) ]
    current_level = 0
    counter = 0
    counter_turns = - 1
    while counter < len ( a ) :
        counter_turns += 1
        for i in range ( len ( a ) ) :
            if a [ i ] != - 1 and a [ i ] <= counter :
                counter += 1
                a [ i ] = - 1
        a.reverse ( )
    print ( counter_turns )
main_function ( )


```
[/ENG]

[/JP]

[ENG]

[/ENG]

[/RUS]

[ENG]

[/ENG]

[/ZH-TW]

[ENG]

[/ENG]

[/ZH-CN]

[ENG]

[/ENG]

[/DE]

[ENG]

[/ENG]

[/FR]

[ENG]

[/ENG]

[/ES]

[ENG]

[/ENG]

[/IT]

[RU]

[/RU]

[/PT]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

[/HU]

[/EO]

[/CA]

[/RO]

[/JA]

[/KO]

[/VI]

[/HI]

[/PT-BR]

[/ID]

[/GR]

[/NL]

[/BG]

[/TR]

[/PL]

[/TH]

[/SV]

[/UK]

