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

public class DAOCategoria implements DAOGenerico<Categoria, FiltroCategoria>
{
    @Override
    public boolean save(Categoria entity) {
        try 
        {
            Connection connection = ConectaDB.getConexao();
            String sql = "insert into categoria" +
                    "(descricao)" +
                    "values (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, entity.getDescricao());
            
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
    public List<Categoria> findAll() {
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

    @Override
    public List<Categoria> findByILike(FiltroCategoria filter) {
        List<Categoria> categorias = new ArrayList<>();
        ResultSet rs = null;
        try 
        {
            Connection connection = ConectaDB.getConexao();
            String sql = "select * from categoria "
                    + "where descricao ILIKE '%" + filter.getDescricao() + "%'";
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
