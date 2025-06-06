package model;

import java.sql.Date;
import java.time.LocalDate;

public class Usuario {
    int id_usuario;
    String nome;
    Date data_nasc;
    String genero;

    public Usuario( String nome, Date data_nasc, String genero) {
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.genero = genero;
    }

    public Usuario(int id_usuario, String nome, Date data_nasc, String genero) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.genero = genero;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_nasc() {
        return this.data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
