package com.Digital.Innovation.One;

public class InterfaceFuncional {
    public static void main(String[] args) {
        Funcao2 funcao2 = valor -> valor ;
    }
}
@FunctionalInterface
interface Funcao2{
    String gerar(String valor);
}

