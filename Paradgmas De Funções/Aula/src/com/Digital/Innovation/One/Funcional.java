package com.Digital.Innovation.One;

import java.util.function.UnaryOperator;

public class Funcional {
    public static void main(String[] args) {
        UnaryOperator<Integer> calculaValorVezesTrinta = valor -> valor * 3;
        int valor = 10;
        System.out.println("O resultado é ::" + calculaValorVezesTrinta.apply(10));
    }
}
