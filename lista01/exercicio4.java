package lista01;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		/*
		 Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		 */
		
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("Entre com o primeiro número: ");
		 double num1 = ler.nextDouble();
		 
		 System.out.println("Entre com o segundo número: ");
		 double num2 = ler.nextDouble();
		 
		 System.out.println("Entre com o segundo número: ");
		 double num3 = ler.nextDouble();
		 
		 System.out.println("Entre com o segundo número: ");
		 double num4 = ler.nextDouble();
		 
		 double media = (num1 + num2 + num3 + num4) / 4;
		 
		 System.out.println("A média das nota é: " +  media );

	}

}
