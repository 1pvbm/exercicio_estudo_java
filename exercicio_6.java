package exercicios_java_4_5_6;
import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0;

        System.out.print("Telefonou para a vítima? se sim '1', se nao'2': ");
        int resposta = scanner.nextInt();
        if (resposta == 1) {
            c++;
        }

        System.out.print("Esteve no local do crime? se sim '1', se nao'2': ");
        resposta = scanner.nextInt();
        if (resposta == 1) {
            c++;
        }
        
        System.out.print("Mora perto da vitima? se sim '1', se nao'2': ");
        resposta = scanner.nextInt();
        if (resposta == 1) {
            c++;
        }

        System.out.print("Devia para a vitima ? se sim '1', se nao'2': ");
        resposta = scanner.nextInt();
        if (resposta == 1) {
            c++;
        }

        System.out.print("Ja trabalhou com a vitima? se sim '1', se nao'2': ");
        resposta = scanner.nextInt();
        if (resposta == 1) {
            c++;
        }

        if (c < 2) {
            System.out.println("Inocente");
        } else if (c == 2) {
            System.out.println("Suspeita");
        } else if (c <= 4) {
            System.out.println("Cumplice");
        } else {
            System.out.println("Assassino");
        }
    }
}