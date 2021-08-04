package com.Digital.Innovation.One;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificarSeEMaior =
                (parametro, valorComposicao) -> parametro > valorComposicao;

        System.out.println(verificarSeEMaior.test(13, 12));
        System.out.println(verificarSeEMaior.test(13, 12));
    }
}
