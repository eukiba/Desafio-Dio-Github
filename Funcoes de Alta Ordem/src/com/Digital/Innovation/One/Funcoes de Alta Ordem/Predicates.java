package com.Digital.Innovation.One.Aula2;

import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Joao"));
    }
}
