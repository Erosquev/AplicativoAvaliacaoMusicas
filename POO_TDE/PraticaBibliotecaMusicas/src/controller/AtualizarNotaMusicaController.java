package controller;

import dao.MusicaDAO;
import model.Musica;
import view.AtualizarNotaMusicaView;
import view.CadastrarMusicaView;

public class AtualizarNotaMusicaController {
    private AtualizarNotaMusicaView anmv;

    public AtualizarNotaMusicaController(){
        anmv = new AtualizarNotaMusicaView();
        AtualizarNotaMusicaView atualizarMusica = anmv.atualizarNotaMusica();
        MusicaDAO mDAO = new MusicaDAO();
        mDAO.atualizarNotaMusica(atualizarMusica);

    }

}
