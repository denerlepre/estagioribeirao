package trecho;

import java.util.Scanner;

public class Codigo2 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um n�mero para verificar: ");
        int numero = scanner.nextInt();
        
      
        if (verificar(numero)) {
            System.out.println(numero + " pertence � sequ�ncia");
        } else {
            System.out.println(numero + " n�o pertence � sequ�ncia");
        }
        
        scanner.close();
    }
    
    public static boolean verificar(int numero) {
        
        int primeiro = 0;
        int segundo = 1;
        
        if (numero == primeiro || numero == segundo) {
            return true;
        }
        
     
        int proximo = primeiro + segundo;
        while (proximo <= numero) {
           
            if (proximo == numero) {
                return true;
            }
            
            primeiro = segundo;
            segundo = proximo;
            proximo = primeiro + segundo;
        }
        
        return false;
    }
}


