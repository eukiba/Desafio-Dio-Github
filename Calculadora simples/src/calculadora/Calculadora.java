package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a , b ;
		
		System.out.println("Digite o primeiro valor:");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor:");
		b = scan.nextInt();
		
		float adicao = adicao (a,b);
		float subtracao = subtracao (a,b);
		float multplicacao = multplicacao (a,b);
		float divisao =  divisao (a,b);
		
		System.out.println ("Adi��o " + adicao);
		System.out.println ("Subtra��o " + subtracao);
		System.out.println ("Multiplica��o " + multplicacao);
		System.out.println ("Divis�o " + divisao);
	}
	
	public static float adicao(float a,float b) {
		return a + b ;
	}
	public static float subtracao(float a, float b) {
		return a - b ;
	}
	public static float multplicacao (float a, float b) {
		return a * b ;
	}
	public static float divisao (float a, float b) {
		return a / b ;
	}

}
