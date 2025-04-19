import java.util.Scanner;

public class Exemplo2{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int idade,acumuladorIdades = 0;
        int cont;

        for(cont=0;cont < 5; cont++){
            System.out.print("Digite a sua idade:");
            idade = entrada.nextInt();
            acumuladorIdades += idade;
        }

        System.out.println("A soma das idades é de:" + acumuladorIdades);
        entrada.close();
    }
}