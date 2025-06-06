package controller;

import view.MenuView;

public class MenuController {

    private MenuView mv;

    public MenuController(){
        mv = new MenuView();
        int opcao = 0;

        while(opcao != 9){
            opcao = mv.opcoesMenu();
            if(opcao == 1){
                new CadastrarMusicaController();
            }
            else if(opcao == 2){
                new AtualizarNotaMusicaController();
            }
            else if(opcao == 3){
                new DeletarMusicaController();
            }
            else if(opcao == 4){
                new CadastrarUsuarioController();
            }
            else if (opcao == 5){
                new ListarUsuariosController();
            }
            else if(opcao == 9){}
            else{mv.opcaoInvalida();}
        }
    }
}
