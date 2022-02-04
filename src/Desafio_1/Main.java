package Desafio_1;

import java.util.Scanner;

public class Main {

//    Crie um programa que leia um valor inteiro (este número tem que conter 4 dígitos).
//    A saída é mostrar a quantidade de dígitos “pares”. Exemplo.: Digamos que a entrada foi 3257.
//    A resposta será 1 Regras:
//    a) A entrada deve estar entre 1000 e 9999
//    b) Se o usuário digitar 3 dígitos ou menos, o Programa avisa que tem que conter 4 dígitos
//    e continuar a programação até a resposta final.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;
        int resultado1;
        int resto1;
        int resultado2;
        int resto2;
        int resultado3;
        int resto3;
        int resultado4;
        int total = 0;

        while (true) {
            int number = sc.nextInt();
            if((number < 1000) || (number > 9999)) {
                System.out.println("O numero de entrada deve ser maior ou igual a 1000, e, menor ou igual a 9999");

            } else {
                while (true) {
                    if ((number >= 1000) || (number <= 9999)) {
                        resultado1 = number / 1000;
                        resto1 = number % 1000;
                        if (resultado1 % 2 == 0) {
                            total += 1;
                        }

                        resultado2 = resto1 / 100;
                        resto2 = resto1 % 100;
                        if (resultado2 % 2 == 0) {
                            total += 1;
                        }

                        resultado3 = resto2 / 10;
                        resto3 = resto2 % 10;
                        if (resultado3 % 2 == 0) {
                            total += 1;
                        }

                        resultado4 = resto3;
                        if (resultado4 % 2 == 0) {
                            total += 1;
                        }

                    }
                    System.out.println(total);
                    break;

                }
            }
        }
    }

}
