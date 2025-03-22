import java.util.Scanner;

public class For4 {
    
    //Faça um algoritmo que receba a idade e a altura de 10 pessoas:
    //– calcule e mostre a média das alturas daquelas com mais de 50 anos.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int pessoas;
        double somaAlturas = 0;
        int contador = 0;
        
        for (pessoas = 1; pessoas <=10 ; pessoas++) {
            System.out.println("Pessoa " + pessoas + ":");

            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();

            System.out.print("Digite a altura: ");
            double altura = entrada.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                contador++;
            }
        }

        if (contador > 0) {
            double media = somaAlturas / contador;
            System.out.println("A média de altura das pessoas com mais de 50 anos é: " + media);
        } else {
            System.out.println("Não há pessoas com mais de 50 anos.");
        }

        entrada.close();
    }
}
