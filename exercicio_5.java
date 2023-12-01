package exercicios_java_4_5_6;
import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite F ou M: ");
		String letra = entrada.next().toUpperCase();
		
		if (letra.equals("F")) {
			System.out.println("F = Feminino");
		} else if (letra.equals("M")) {
			System.out.println("M = Masculino");
		}else {
			System.out.println("Letra invalida, escreva apenas 'f' ou 'm'. ");
		}
		
	}

}
