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

public class DAOCarro implements ICrud<Carro>
{
    private static String table = "carro";
    
    @Override
    public boolean Salvar(Carro carro)
    {
        Connection connection = ConectaDB.GetConexao();
        String sql = "insert into ? (placa, marca, modelo, cor)";
               sql += "values(?,?,?,?)";
        
        try 
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, table);
            statement.setString(2, carro.getPlaca());
            statement.setString(3, carro.getMarca());
            statement.setString(4, carro.getModelo());
            statement.setString(5, carro.getCor());
            
            return true;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAOCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        return false;
    }
    
    @Override
    public List<Carro> Ler()
    {
        List<Carro> lista = new ArrayList<>();
        return null;
    }
}
