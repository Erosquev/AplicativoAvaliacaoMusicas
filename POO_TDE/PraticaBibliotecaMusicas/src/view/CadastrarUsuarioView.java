package view;

import model.Musica;
import model.Usuario;

import java.sql.Date;
import java.time.LocalDate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static sun.security.util.KnownOIDs.Data;

public class CadastrarUsuarioView {

    private Scanner sc;

    public CadastrarUsuarioView(){
        this.sc = new Scanner(System.in);
    }

    public Usuario cadastrarUsuario(){
        System.out.print("\nNome usuário: ");
        String nome = sc.nextLine();
        System.out.print("\nData nascimento usuário (DD/MM/AAAA): ");
        String data_nasc_str = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data_nasc_ld = LocalDate.parse(data_nasc_str, formatter);
        Date data_nasc_d = Date.valueOf(data_nasc_ld);
        System.out.print("\nGênero Usuário: ");
        String genero = sc.nextLine();

        return new Usuario(nome, data_nasc_d, genero);
    }
}
