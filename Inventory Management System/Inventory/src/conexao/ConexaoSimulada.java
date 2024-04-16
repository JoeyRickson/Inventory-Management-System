package conexao;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

//Dados de conexao com banco
public class ConexaoSimulada {
    private static final String url ="URL";
    private static final String usuario = "User";
    private static final String senha = "Password";
// Método para obter uma conexão com o banco de dados
    public static Connection getConexao(){
        try {
            return DriverManager.getConnection(url,usuario,senha);

        }catch(SQLException e){
            e.printStackTrace();
            return null; //Retorna null se falhar
    }
}
}