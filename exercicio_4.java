package exercicios_java_4_5_6;
import java.util.Scanner;
public class exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double nota_1 = entrada.nextDouble();
		System.out.println("Digite outro numero:");
		double nota_2 = entrada.nextDouble();
		double media = (nota_1 + nota_2)/2;
		System.out.print("Sua media:" + media );
		}
		
		
}
