import java.util.Scanner;

public class For5 {

    //Faça um algoritmo que receba duas notas de 6 alunos, calcule e mostre:
    //a) A média aritmética das duas notas de cada aluno;
    //b) Forneça a seguinte mensagem de acordo com a nota:
    //¨ REPROVADO se média é menor ou igual a 3.
    //¨ EXAME se média é acima de 3 e menor que 7.
    //¨ APROVADO maior ou igual a 7
    //c) O total de alunos aprovados.
    //d) O total de alunos de exame.
    //e) O total de alunos reprovados.
    //f) A média da classe.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int somaAprovado = 0;
        int somaExame = 0;
        int somaReprovado = 0;
        double somaMedia = 0;
        
        int contadorAprovado = 0;
        int contadorExame = 0;
        int contadorReprovado = 0;

        for (int aluno = 1; aluno <= 6; aluno++) {

            System.out.print("Digite a primeira nota do aluno " + aluno + ": ");
            double nota1 = entrada.nextDouble();

            System.out.print("Digite a segunda nota do aluno " + aluno + ": ");
            double nota2 = entrada.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.println("Média do aluno " + aluno + ": " + media);
            
            if (media <= 3) {
                System.out.println("REPROVADO");
                somaReprovado++;
                contadorReprovado++;
            } else if (media >= 7) {
                System.out.println("APROVADO");
                somaAprovado++;
                contadorAprovado++;
            } else {
                System.out.println("EXAME");
                somaExame++;
                contadorExame++;
            }

            somaMedia += media;
        }

        System.out.println("Total de alunos APROVADOS: " + contadorAprovado);
        System.out.println("Total de alunos REPROVADOS: " + contadorReprovado);
        System.out.println("Total de alunos em EXAME: " + contadorExame);

        double mediaClasse = somaMedia / 6;
        System.out.println("A média da classe é: " + mediaClasse);

        entrada.close();
    }
}
