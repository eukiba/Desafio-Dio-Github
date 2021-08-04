package com.Digital.Innovation.One.FatorialRecursivo;


public class FatorialRecursivo {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial( int value ) { // 5 * 4 * 3 * 2 * 1 = 120
        if ( value == 1 ) {
            return value;
        } else {
            return value * fatorial((value - 1));
        }
    }
}
