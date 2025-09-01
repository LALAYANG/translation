def main ( ) :
    K = int ( input ( ) )
    S = input ( )
    if len ( S ) <= K :
        return S
    return S [ : K ] + '...'