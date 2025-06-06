package view;

import java.util.Scanner;

public class DeletarMusicaView {
    private Scanner sc;
    String nome;
    String artista;

    public DeletarMusicaView(){
        this.sc = new Scanner(System.in);
    }

    public DeletarMusicaView(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
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

    //    Método que deleta a música
    public DeletarMusicaView deletarMusicaV(){
        System.out.println("Qual o nome da música que deseja deletar? ");
        nome = sc.nextLine();
        System.out.println("Qual o nome do artista que canta essa música? ");
        artista = sc.nextLine();

        return new DeletarMusicaView(nome, artista);
    }

}
