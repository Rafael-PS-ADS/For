import java.util.Scanner;

public class For2{

    //Faça um algoritmo que apresente na tela os quadrados dos 	números inteiros de 15 a 100.

    public static void main(String[]args){

        int num;
        int quadrado = 0;

        for(num = 15;num <= 100;num++){
            quadrado = num * num;
            System.out.println("O quadrado de " + num + " é " + quadrado);
        }
    }
}