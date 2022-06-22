package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("Digite o primeiro valor: ");
		a = sc.nextInt(); // leio a variavel a
		

		System.out.print("Digite o segundo valor: ");
		b = sc.nextInt(); // leio a variavel b
		
		System.out.println("--------------------------");
		System.out.println("-- Descobrindo o maior --");
		
		if ( a > b ) {
			System.out.println("O a � o maior");
		} else if ( a == b ) {
			System.out.println("a e b s�o iguais");
		} else {
			System.out.println("O b � o maior");
		}
		
		System.out.println("--------------------------");
		System.out.println("-- Descobrindo se o primeiro � par --");
		
		if(a%2 == 0) { // se o resto de a por 2 for zero
			System.out.println("O primeiro � par!");
		} else {
			System.out.println("O primeiro � �mpar!");
		}
		
		System.out.println("--------------------------");

		System.out.println("-- Vendo se o maior � par --");
		
		if( a > b && a%2 == 0) {
			System.out.println("O a � o maior e � par!");
		} else if ( b > a && b%2 == 0) {
			System.out.println("O b � o maior e � par!");
		} else if( a == b && a%2 == 0 ) {
			System.out.println("Os numeros s�o iguais e pares");
		} else if ( a == b && a%2 != 0 ) {
			System.out.println("Os numeros s�o iguais e �mpares");
		} else {
			System.out.println("Existe o maior e ele � �mpar");
		}
		
		System.out.println("--------------------------");
		System.out.println("-- Verificando se existe algum par --");
		
		if(a%2 == 0 || b%2 == 0) {
			System.out.println("Pelo menos um � par");
		} else {
			System.out.println("Nenhum � par");
		}
		
		System.out.println("--------------------------");
		
	}

}
