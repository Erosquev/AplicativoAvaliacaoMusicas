package controller;

import dao.MusicaDAO;
import model.Musica;
import view.CadastrarMusicaView;

public class CadastrarMusicaController {

    private CadastrarMusicaView cmv;

    public CadastrarMusicaController(){
        cmv = new CadastrarMusicaView();
        Musica m = cmv.cadastrarMusica();
        MusicaDAO mDAO = new MusicaDAO();
        mDAO.cadastrarMusica(m);

    }
}
