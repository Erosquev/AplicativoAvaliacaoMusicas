package model;

import java.math.BigDecimal;

public class Musica {

    private String nome;
    private String artista;
    private BigDecimal duracao;
    private BigDecimal nota;
    private int id_musica;

    public Musica(String nome, String artista, BigDecimal duracao, BigDecimal nota) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
        this.nota = nota;
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

    public BigDecimal getDuracao() {
        return duracao;
    }

    public void setDuracao(BigDecimal duracao) {
        this.duracao = duracao;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }

    public int getId_musica() {
        return id_musica;
    }

    public void setId_musica(int id_musica) {
        this.id_musica = id_musica;
    }
}
