import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		
		double area = pi * raio * raio ;
		
		// express�o regular %.4f ->
		// um numero, flutuante, com 4 casas depois do ponto
		// print formatted -> impress�o formatada
		System.out.printf("A=%.4f\n", area);		
	}

}
