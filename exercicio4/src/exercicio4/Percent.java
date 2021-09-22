package exercicio4;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Percent {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("00.00");
		
		double valorAlcool =  5.06;
		double valorADesc =  4.98;
		double valorAMD =  4.80;
		double valorGaso =  6.65;
		double valorGDesc =  6.45;
		double valorGMD =  6.31;
		
		int op;
		double litros;
		
		System.out.println("Digite qual combustível deseja abastecer. \n 1 - Álcool \n 2 - Gasolina");
		op = s.nextInt();
		
		if (op == 1) {
			System.out.println("Quantos litros de álcool deseja abastecer?");
			litros = s.nextDouble();
			System.out.println("O valor do abastecimento foi: R$ "+ deci.format(litros * valorAlcool));
		if (litros <= 20) {
			System.out.println("O valor com 3% de desconto é: R$ " + deci.format(litros * valorADesc));
		}else if (litros >= 20) {
			System.out.println("O valor com 5% de desconto é: R$ " + deci.format(litros * valorAMD));
		}
		}
		if (op == 2) {
			System.out.println("Quantos litros de gasolina deseja abastecer?");
			litros = s.nextInt();
			System.out.println("O valor do abastecimento foi: R$ " + deci.format(litros * valorGaso));
		if (litros <= 20) {
			System.out.println("O valor com 4% de desconto é: R$ " + deci.format(litros * valorGDesc));
		
		}else if(litros >= 20) {
			System.out.println("O valor com 6% de desconto é: R$ " + deci.format(litros * valorGMD));
		}
		}
	
	
	}	
	
}