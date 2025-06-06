package view;

import model.Usuario;

import java.util.ArrayList;

public class ListarUsuariosView {

    public void listarUsuarios(ArrayList<Usuario> lista){

        System.out.println("\n*** LISTA DE USUÁRIOS ***");
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Nome: " + lista.get(i).getNome());
            System.out.println("Data Nascimento: " + lista.get(i).getData_nasc());
            System.out.print("\n");
        }

    }
}
