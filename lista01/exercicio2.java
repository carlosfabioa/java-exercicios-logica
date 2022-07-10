package lista01;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça um número e então mostre a mensagem 
		 * O número informado foi [número].
		 * */
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = ler.nextInt();
		
		System.out.println("O número informado foi " + numero);
		

	}


}
