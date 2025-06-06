package dao;

import model.Musica;
import view.AtualizarNotaMusicaView;
import view.DeletarMusicaView;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MusicaDAO {

    private Connection conexao;
    private String query;
    private PreparedStatement ps;

    public MusicaDAO(){
        conexao = ConexaoMySQL.getConexao().getConnection();
    }

    public void cadastrarMusica(Musica m){

        query = "INSERT INTO musica (nome, artista, duracao, nota) VALUES (?,?,?,?)";

        try{
            ps = conexao.prepareStatement(query);
            ps.setString(1, m.getNome());
            ps.setString(2, m.getArtista());
            ps.setBigDecimal(3, m.getDuracao());
            ps.setBigDecimal(4, m.getNota());
            ps.executeUpdate();
            ps.close();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    public void atualizarNotaMusica(AtualizarNotaMusicaView anmv){

        query = "UPDATE musica SET nota = ? WHERE nome = ? AND artista = ?";

        try{
            ps = conexao.prepareStatement(query);
            ps.setBigDecimal(1, anmv.getNota() );
            ps.setString(2, anmv.getNome());
            ps.setString(3, anmv.getArtista());
            ps.executeUpdate();
            ps.close();
        }
        catch(SQLException ex){
            ex.printStackTrace();

        }
    }

    public void deletarMusica(DeletarMusicaView dmv){

        query = "DELETE FROM musica WHERE nome = ? AND artista = ?";
        try{
            ps = conexao.prepareStatement(query);

            ps.setString(1, dmv.getNome());
            ps.setString(2, dmv.getArtista());
            ps.executeUpdate();
            ps.close();

        }
        catch(SQLException ex){
            ex.printStackTrace();

        }
    }
}

