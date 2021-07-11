package aula2.models;

import aula2.controller.Carro;
import aula2.utils.ConectaDB;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOCarro
{
    private String table = "carro";
    
    public static boolean Salvar(Carro carro)
    {
        Connection connection = ConectaDB.GetConexao();
        String sql = "insert into carro (placa, marca, modelo, cor)";
               sql += "values(?,?,?,?)";
        
        try 
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, carro.getPlaca());
            statement.setString(2, carro.getMarca());
            statement.setString(3, carro.getModelo());
            statement.setString(4, carro.getCor());
            
            return true;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAOCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        return false;
    }
    
    public static List<Carro> Ler()
    {
        List<Carro> lista = new ArrayList<>();
        if (VerificaConexao())
            return lista;
        return null;
    }
    
    private static boolean VerificaConexao()
    {
        if (ConectaDB.GetConexao() != null)
        {
            System.out.println("Conectado ao DB");
            return true;
        }
        return false;
        
    }
}
