package aula2.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaDB 
{
    public static Connection GetConexao()
    {
        Connection connnection = null;
        String url = "jdbc:postgresql://localhost:5432/aulajava";
        String user = "postgres";
        String password = "123";
        try 
        {
            Class.forName("orgpostgresql.Driver");
            connnection = DriverManager.getConnection(url, user, password);
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println("Erro ao conectar com o banco");
        }
        return connnection;
    }
}
