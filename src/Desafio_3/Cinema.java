package Desafio_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {

    public String nome;
    public Filme endereco;
    public ArrayList<Filme> filmesEmCartaz = new ArrayList<>();

    public Cinema(String nome, Filme endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void adicionarFilme(Filme filme) {
        this.filmesEmCartaz.add(filme);
        filmesEmCartaz.listIterator();
    }

    public void removerFilme(Filme filme) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tem certeza que deseja remover filme? S - para sim ou N - para não");
        String decisao = String.valueOf(sc.hasNext());
        if (decisao == "N") {
            System.out.println("Cancelando operação...");
        } else if (decisao == "S") {
            this.filmesEmCartaz.remove(filme);
        }


    }

    public void listarFilmes() {
        filmesEmCartaz.iterator();
    }

}
