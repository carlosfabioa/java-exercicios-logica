package lista01;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		/* 
		 5.	Faça um Programa que converta metros para centímetros.
		 * */ 
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com a medida em metros: ");
		double metros = ler.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.printf("%.2f em metros é: %.0f centrimetros", metros, centimetros);
		
		
	}

}
