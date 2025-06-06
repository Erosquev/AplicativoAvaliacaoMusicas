package view;

import model.Musica;

import java.math.BigDecimal;
import java.util.Scanner;

public class AtualizarNotaMusicaView {

    private Scanner sc;
    private String nome;
    private String artista;
    private BigDecimal nota;

    public AtualizarNotaMusicaView(){
        this.sc = new Scanner(System.in);
    }

    public AtualizarNotaMusicaView(String nome,String artista, BigDecimal nota){
        this.nome = nome;
        this.artista = artista;
        this.nota = nota;
    }


//    Método que atualiza a nota da música
    public AtualizarNotaMusicaView atualizarNotaMusica(){
        System.out.print("\nQue música quer atualizar a nota? ");
        String nome = sc.nextLine();
        System.out.print("\nDe qual artista é a música? ");
        String artista = sc.nextLine();
        System.out.print("\nQual nota quer dar para a música? ");
        BigDecimal nota = sc.nextBigDecimal();

        return new AtualizarNotaMusicaView(nome, artista, nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }
}
