package controller;

import dao.MusicaDAO;
import view.DeletarMusicaView;

public class DeletarMusicaController {

    private DeletarMusicaView dmv;

    public DeletarMusicaController(){
        dmv = new DeletarMusicaView();
        DeletarMusicaView deletarMusica = dmv.deletarMusicaV();
        MusicaDAO mDAO = new MusicaDAO();
        mDAO.deletarMusica(deletarMusica);
    }
}
