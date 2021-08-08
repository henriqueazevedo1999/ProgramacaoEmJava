package aula3.models;

import aula3.controller.Categoria;
import aula3.controller.FiltroCategoria;
import aula3.utils.ConectaDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

public class DAOCategoria implements IDAO<Categoria, FiltroCategoria>
{
    private Connection connection;

    public DAOCategoria()
    {
        connection = ConectaDB.getConexao();
    }
    
    @Override
    public boolean save(Categoria categoria)
    {
        try 
        {
            String sql = "insert into categoria"
                    + " (descricao)"
                    + " values (?)";
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

    @Override
    public List<Categoria> findAll() 
    {
        String sql = " select * from categoria";
        return getDataFromDb(sql);
    }

    @Override
    public List<Categoria> findByILike(FiltroCategoria filter)
    {
        String sql = "select * from categoria"
                + " where descricao ILIKE '%" + filter.getDescricao() + "%'";
        
        return getDataFromDb(sql);
    }

    @Override
    public List<Categoria> getDataFromDb(String sql)
    {
        List<Categoria> categorias = new ArrayList<>();
        ResultSet rs;
        try 
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();
            while (rs.next())
            {
                Categoria categoria = new Categoria();
                
                categoria.setId(rs.getInt("id"));
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
}
