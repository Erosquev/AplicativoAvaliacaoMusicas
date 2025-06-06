package dao;

import model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {

    private Connection conexao;
    private String query;
    private PreparedStatement ps;

    public UsuarioDAO(){
        conexao = ConexaoMySQL.getConexao().getConnection();
    }

    public void cadastrarUsuario(Usuario u){
        query = "INSERT INTO usuario (nome_usuario, data_nasc, genero_usuario) VALUES (?,?,?)";

        try{
            ps = conexao.prepareStatement(query);
            ps.setString(1, u.getNome());
            ps.setDate(2, u.getData_nasc());
            ps.setString(3, u.getGenero());
            ps.executeUpdate();
            ps.close();

        }
        catch(SQLException ex){
            ex.printStackTrace();
        }

    }

    public ArrayList<Usuario> listarUsuarios(){
        ArrayList<Usuario> lista = new ArrayList<>();
        query = "SELECT * FROM usuario";

        try{
            ps = conexao.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Usuario u = new Usuario(rs.getInt("id_usuario"), rs.getString("nome_usuario"), rs.getDate("data_nasc"), rs.getString("genero_usuario"));
                lista.add(u);
            }
            ps.close();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }

        return lista;
    }

}
