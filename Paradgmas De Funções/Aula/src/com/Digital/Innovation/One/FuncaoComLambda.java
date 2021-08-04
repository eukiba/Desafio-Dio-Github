package com.Digital.Innovation.One;

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPrifixoSenhorNaString = valor -> "Sr. "+valor;
        System.out.println(colocarPrifixoSenhorNaString.gerar("Joao"));
    }
}
