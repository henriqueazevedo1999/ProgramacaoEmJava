package aula3.models;

import aula3.controller.Categoria;
import aula3.utils.ConectaDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

public class DAOCategoria
{
    public static List<Categoria> getCategorias()
    {
        List<Categoria> categorias = new ArrayList<>();
        ResultSet rs = null;
        try 
        {
            Connection connection = ConectaDB.getConexao();
            String sql = "select * from categoria";
            PreparedStatement statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();
            while (rs.next())
            {
                Categoria categoria = new Categoria(rs.getInt("id"));
                categoria.setDescricao(rs.getString("descricao"));
                categorias.add(categoria);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAOCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categorias;
    }
    
    public static boolean salvar(Categoria categoria)
    {
        try 
        {
            Connection connection = ConectaDB.getConexao();
            String sql = "insert into categoria" +
                    "(descricao)" +
                    "values (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, categoria.getDescricao());
            
            preparedStatement.execute();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
}
