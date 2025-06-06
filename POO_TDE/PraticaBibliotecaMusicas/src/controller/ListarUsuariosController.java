package controller;

import dao.UsuarioDAO;
import model.Usuario;
import view.ListarUsuariosView;
import java.util.ArrayList;

public class ListarUsuariosController {

    private ListarUsuariosView luv;

    public ListarUsuariosController(){

        luv = new ListarUsuariosView();
        UsuarioDAO uDAO = new UsuarioDAO();
        ArrayList<Usuario> lista = uDAO.listarUsuarios();
        luv.listarUsuarios(lista);

    }
}
