package Vendas.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaDB 
{
    public static Connection getConexao()
    {
        Connection connection = null;
        String url = "jdbc:postgresql://localhost:5432/aulajava";
        String user = "postgres";
        String password = "admin";
        try 
        {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println("Erro ao conectar com o banco");
        }
        return connection;
    }
}
