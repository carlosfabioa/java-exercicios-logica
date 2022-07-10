package lista01;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		/*
		 Faça um Programa que peça dois números e imprima a soma.
		 * */
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o primeiro número: ");
		int num1 = ler.nextInt();
		System.out.println("Entre com o segundo número: ");
		int num2 = ler.nextInt();
		
		int soma =  num1 + num2;
		
		System.out.println("A soma do número " + num1 + " com o numero " + num2 + " é: " + soma);

	}

}
