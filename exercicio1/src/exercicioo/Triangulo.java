package exercicioo;

import java.util.Scanner;


public class Triangulo {

	public static void main(String[] args) {
	int lado1, lado2, lado3;
	int opcao = 1;
		
	while (opcao == 1) {
		
		
	Scanner s = new Scanner(System.in);
	System.out.println("Valor do primeiro lado: ");
	lado1 = s.nextInt();
	
	System.out.println("~~~~~~~~~~~~~~~~~~");
	System.out.println("Valor do segundo lado: ");
	
	lado2 = s.nextInt();
	System.out.println("~~~~~~~~~~~~~~~~~~");
	System.out.println("Valor do terceiro lado: ");
	
	lado3 = s.nextInt();
	System.out.println("~~~~~~~~~~~~~~~~~~");
	
	if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("Tri�ngulo Equil�tero ");
				
			}else  if ((lado1 == lado2) || (lado1 == lado3)) {
				System.out.println("Tri�ngulo Is�celes ");
					
				}else
					System.out.println("Tri�ngulo Escaleno ");
			}else 
				System.out.println("N�o � um Tri�ngulo!");
				
	
				System.out.println("~~~~~~~~~~~~~~~~~");
				System.out.println("Deseja continuar? 1 = Sim, 2 = n�o.");
				opcao = s.nextInt();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
	}
				System.out.println("Tchauzinho!");	
				
	}
				
}


