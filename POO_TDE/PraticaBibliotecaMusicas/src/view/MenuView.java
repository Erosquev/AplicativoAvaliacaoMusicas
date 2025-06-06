package view;

import java.util.Scanner;

public class MenuView {

    private Scanner sc;

    public MenuView(){
        this.sc = new Scanner(System.in);

    }

    public int opcoesMenu(){
        System.out.println("*** MENU ***");
        System.out.println("[1] - Cadastrar música");
        System.out.println("[2] - Atualizar música");
        System.out.println("[3] - Deletar música");
        System.out.println("[4] - Cadastrar usuário");
        System.out.println("[5] - Listar usuários");
        System.out.println("[6] - Listar músicas de usuário");
        System.out.println("[9] - Sair");
        System.out.print("O que quer fazer? ");
        return sc.nextInt();
    }

    public void opcaoInvalida(){
        System.out.println("Opção inválida!!!");
    }
}
