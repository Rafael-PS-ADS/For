import java.util.Scanner;

public class For1{

    //Faça um programa que imprima a seguinte sequência:
    //– 100, 99, 98, . . . 1.

    public static void main(String[]args){
        int num;

        for (num = 100; num >= 0; num--){
            System.out.print(num + " ");
        }
    }
}