package Desafio_2;

import java.util.Scanner;

public class Main {
//    Crie um programa cujo usuário digite um número(multiplicando), o início e o fim de um intervalo(multiplicadores).
//    Calcule o resultado(produto) das multiplicações entre o multiplicando e os multiplicadores que estão entre o
//    intervalo e exiba a operação realizada:
//            “multiplicando x multiplicador = produto”.
//

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Multiplicando: ");
            int multiplicando = sc.nextInt();
            if (multiplicando < 0 || multiplicando > 5000) {
                System.out.println("O multiplicando não pode ser menor que 0 ou maior que 5000. Programa finalizado.");
                break;
            }
            System.out.println("Início do intervalo: ");
            int intervalo = sc.nextInt();
            if (intervalo < 0 || intervalo > 5000) {
                System.out.println("O intervalo não pode ser menor que 0 ou maior que 5000. Programa finalizado.");
                break;
            }
            System.out.println("Fim do intervalo: ");
            int finalDoIntervalo = sc.nextInt();
            if (finalDoIntervalo < 0 || finalDoIntervalo > 5000) {
                System.out.println("O fim do intervalo não pode ser menor que 0 ou maior que 5000. Programa finalizado.");
                break;
            } else if((finalDoIntervalo - intervalo) > 10){
                System.out.println("O intervalo entre inicio e fim não pode ser maior que 10. Programa finalizado.");
                break;
            } else if(finalDoIntervalo < intervalo) {
                System.out.println("O final do intervalo não pode ser menor que o inicio. Programa finalizado.");
                break;
            }

            for (int i = intervalo; i <= finalDoIntervalo; i++) {
                System.out.println(multiplicando + " x " + i + " = " + (multiplicando * i));
            }
            break;
        }
    }
}
