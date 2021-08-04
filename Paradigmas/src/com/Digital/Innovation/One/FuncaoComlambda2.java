package com.Digital.Innovation.One;

public class FuncaoComlambda2 {
    public static void main(String[] args) {
        Funcao1 funcao1 = valor -> {
            System.out.println(valor);
            System.out.println(valor);
            // No caso de String
            // return valor;
        };
        funcao1.gerar("Joao");
        // No caso de String
        // System.out.println(" Joao");
    }
}

interface Funcao1 {
    void gerar(String valor);
}
//interface Funcao1 {
//    String gerar(String valor);
//}
