package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConexaoMySQL {
    private static ConexaoMySQL conexaoMySQL;
    private Connection conexao;

    private ConexaoMySQL(){
        try{
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/BibliotecaMusicas?useSSL=false", "root", "Petit&Cacau24");
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    public static ConexaoMySQL getConexao(){
        if (conexaoMySQL == null){
            conexaoMySQL = new ConexaoMySQL();
        }
        return conexaoMySQL;
    }

    public Connection getConnection(){
        return this.conexao;
    }
}
