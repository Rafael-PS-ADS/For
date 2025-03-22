import java.util.Scanner;

public class For6 {

    //Em uma eleição presidencial, existem quatro candidatos.
    //- Os votos são informados através de um código:
    //¨ 1, 2, 3 ou 4 - Voto para o respectivo candidato
    //¨ 5 - Voto nulo
    //¨ 6 - Voto em branco
    //- Faça um algoritmo que leia o voto de 10 eleitores.
    //- Calcule e mostre:
    //¨ a) O total de votos para cada candidato;
    //¨ b) O total de votos nulos;
    //¨ c) O total de votos em branco;
    //¨ d) O percentual dos votos brancos e nulos.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;

        for (int eleitor = 1; eleitor <= 10; eleitor++) {
            System.out.println("Eleitor " + eleitor + ", digite seu voto:");
            System.out.println("Digite 1 para votar no Candidato 1");
            System.out.println("Digite 2 para votar no Candidato 2");
            System.out.println("Digite 3 para votar no Candidato 3");
            System.out.println("Digite 4 para votar no Candidato 4");
            System.out.println("Digite 5 para votar nulo");
            System.out.println("Digite 6 para votar em branco");

            int voto = entrada.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 4:
                    votosCandidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Opção inválida! O seu voto não será considerado!");
                    break;
            }
        }

        System.out.println("");
        System.out.println("Resultado da eleição:");
        System.out.println("Votos para o Candidato 1: " + votosCandidato1);
        System.out.println("Votos para o Candidato 2: " + votosCandidato2);
        System.out.println("Votos para o Candidato 3: " + votosCandidato3);
        System.out.println("Votos para o Candidato 4: " + votosCandidato4);
        System.out.println("Votos nulos: " + votosNulos);
        System.out.println("Votos em branco: " + votosBrancos);

        int totalVotos = votosCandidato1 + votosCandidato2 + votosCandidato3 + votosCandidato4 + votosNulos + votosBrancos;

        double percentual1 = (votosCandidato1 * 100.0) / totalVotos;
        double percentual2 = (votosCandidato2 * 100.0) / totalVotos;
        double percentual3 = (votosCandidato3 * 100.0) / totalVotos;
        double percentual4 = (votosCandidato4 * 100.0) / totalVotos;
        double percentualBrancos = (votosBrancos * 100.0) / totalVotos;
        double percentualNulos = (votosNulos * 100.0) / totalVotos;

        System.out.println("");
        System.out.println("Percentual de votos no Candidato 1: " + percentual1 + "%");
        System.out.println("Percentual de votos no Candidato 2: " + percentual2 + "%");
        System.out.println("Percentual de votos no Candidato 3: " + percentual3 + "%");
        System.out.println("Percentual de votos no Candidato 4 " + percentual4 + "%");
        System.out.println("Percentual de votos em branco: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");

        entrada.close();
    }
}
