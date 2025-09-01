from math import atan2 , pi
n , * xy = map ( int , open ( 0 ).read ( ).split ( ) )
xy = list ( zip ( * [ iter ( xy ) ] * 2 ) )
for i , ( x , y ) in enumerate ( xy ) :
    d = sorted ( atan2 ( x - X , y - Y ) for j , ( X , Y ) in enumerate ( xy ) if j != i )
    d.append ( d [ 0 ] + 2 * pi )
    ans = 0
    for a , b in zip ( d , d [ 1 : ] ) :
        if b - a >= pi :
            ans = ( b - a ) - pi
    print ( ans / ( 2 * pi ) )