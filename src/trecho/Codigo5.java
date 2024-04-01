package trecho;

import java.util.Scanner;

public class Codigo5 {

	public static void main(String[] args) {
		
		Scanner leitor  = new Scanner(System.in);
		System.out.print("digite a String = ");
		String palavra = leitor.next();
		String novaPalavra = "";
		
		for(int i = palavra.length() - 1; i >= 0; i--) {
			novaPalavra = novaPalavra + Character.toString(palavra.charAt(i));
		}
		System.out.println("String invertida = " + novaPalavra);
	}

}
