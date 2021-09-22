package exercicio3;

import java.util.Scanner;

public class Cenadocrime {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int resp = 0;
		
		
		
		System.out.println("Você telefonou para a vítima? responda 1 para sim ou 2 para não");	
		if (sca.nextInt() == 1) { 
			++resp;		
		}
		System.out.println("Você esteve no local do crime? responda 1 para sim ou 2 para não");
		if (sca.nextInt() == 1 ) {
			++resp;			
		}
		System.out.println("Mora perto da vítima? responda 1 para sim ou 2 para não");	
		if (sca.nextInt() == 1) { 
			++resp;		
		}
		System.out.println("Devia para a vítima? responda 1 para sim ou 2 para não");
		if (sca.nextInt() == 1 ) {
			++resp;			
		}System.out.println("Já trabalhou com a vítima? responda 1 para sim ou 2 para não");	
		if (sca.nextInt() == 1) { 
			++resp;		
		}
		
		if(resp == 2) {
			System.out.println("Você é suspeito");
		}else if(resp == 3 || resp == 4 ){ 
			System.out.println("Você é cúmplice");			
		}else if(resp == 5 ){ 
			System.out.println("Você é o ASSASSINO");
		}else {
			System.out.println("Você é inocente.");
		}	
	}
}
