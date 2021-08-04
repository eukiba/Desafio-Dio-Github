package com.Digital.Innovation.One;

import java.util.Arrays;

public class ComposicaoDeFuncoes {
    public static void main(String[] args) {  // Forma Funcional
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));

//        for (int i = 0; i < valores.length; i++) { // Forma Imperativa
//            int valor = 0;
//            if (valores[i] % 2 == 0) {
//                valor = valores[i] * 2;
//
//                if (valor != 0) {
//                    System.out.println(valor);
//                }
//            }
//        }
    }
}
