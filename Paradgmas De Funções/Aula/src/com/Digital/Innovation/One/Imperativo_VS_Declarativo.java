package com.Digital.Innovation.One;

import java.util.function.Function;

public class Imperativo_VS_Declarativo {

    //    public static void main(String[] args) { // Iperativo
//
//        System.out.println(buscarUsuario(15));
//    }
//    public static Object buscarUsuario(int idUsuario) {
//        // retona o usuario ;
//        return new Object();
//    }

    public static void main(String[] args) { // Declarativo

        Function<Integer, Object> buscarUsuario = idUsuario ->
                // busca meu usuario
                new Object();
        System.out.println();
    }
}
