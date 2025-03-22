import java.util.Scanner;

public class For7 {

    //Faça um algoritmo que receba a idade, a altura e o peso de 10 pessoas, calcule e mostre:
    //a) A quantidade de pessoas maiores de 50 anos.
    //b) A média das alturas das pessoas com idade entre 10 e 20 anos.
    //c) A porcentagem de pessoas com peso inferior a 40 quilos.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int mais50 = 0;
        double somaAlturas = 0;
        int alturaMedia = 0;
        int pesoMenor40 = 0;

        for (int pessoa = 1; pessoa <= 10; pessoa++) {
            System.out.println("Pessoa " + pessoa + ":");

            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();

            System.out.print("Digite a altura: ");
            double altura = entrada.nextDouble();

            System.out.print("Digite o peso: ");
            double peso = entrada.nextDouble();

            if (idade > 50) {
                mais50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                alturaMedia++;
            }

            if (peso < 40) {
                pesoMenor40++;
            }
        }

        System.out.println("");
        System.out.println("Resultados:");
        System.out.println("");

        System.out.println("A quantidade de pessoas com mais de 50 anos é de: " + mais50);

        if (alturaMedia > 0) {
            double mediaAlturas = somaAlturas / alturaMedia;
            System.out.println("A média das alturas das pessoas entre 10 e 20 anos é de: " + mediaAlturas);
        } else {
            System.out.println("Não tem pessoas entre 10 e 20 anos.");
        }

        double porcentagemPesoMenor40 = (pesoMenor40 * 100.0) / 10;
        System.out.println("A porcentagem de pessoas com peso inferior a 40 quilos é de: " + porcentagemPesoMenor40 + "%");

        entrada.close();
    }
}
