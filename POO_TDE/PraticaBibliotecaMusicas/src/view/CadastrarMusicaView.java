package view;

import model.Musica;

import java.math.BigDecimal;
import java.util.Scanner;

public class CadastrarMusicaView {

    private Scanner sc;

    public CadastrarMusicaView(){
        this.sc = new Scanner(System.in);
    }

    public Musica cadastrarMusica(){
        System.out.print("\nNome música: ");
        String nome = sc.nextLine();
        System.out.print("\nNome Artista: ");
        String artista = sc.nextLine();
        System.out.print("\nDuração música: ");
        BigDecimal duracao = sc.nextBigDecimal();
        System.out.print("\nNota música: ");
        BigDecimal nota = sc.nextBigDecimal();

        return new Musica(nome, artista, duracao, nota);
    }
}
