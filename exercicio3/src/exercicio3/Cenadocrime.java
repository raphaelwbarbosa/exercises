package exercicio3;

import java.util.Scanner;

public class Cenadocrime {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int resp = 0;
		
		
		
		System.out.println("Voc� telefonou para a v�tima? responda 1 para sim ou 2 para n�o");	
		if (sca.nextInt() == 1) { 
			++resp;		
		}
		System.out.println("Voc� esteve no local do crime? responda 1 para sim ou 2 para n�o");
		if (sca.nextInt() == 1 ) {
			++resp;			
		}
		System.out.println("Mora perto da v�tima? responda 1 para sim ou 2 para n�o");	
		if (sca.nextInt() == 1) { 
			++resp;		
		}
		System.out.println("Devia para a v�tima? responda 1 para sim ou 2 para n�o");
		if (sca.nextInt() == 1 ) {
			++resp;			
		}System.out.println("J� trabalhou com a v�tima? responda 1 para sim ou 2 para n�o");	
		if (sca.nextInt() == 1) { 
			++resp;		
		}
		
		if(resp == 2) {
			System.out.println("Voc� � suspeito");
		}else if(resp == 3 || resp == 4 ){ 
			System.out.println("Voc� � c�mplice");			
		}else if(resp == 5 ){ 
			System.out.println("Voc� � o ASSASSINO");
		}else {
			System.out.println("Voc� � inocente.");
		}	
	}
}
