package Vendas.models;

import Vendas.utils.IDAO;
import Vendas.controller.FiltroProduto;
import Vendas.controller.Produto;
import Vendas.utils.ConectaDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOProduto implements IDAO<Produto, FiltroProduto>
{
    Connection connection;

    public DAOProduto() 
    {
       connection = ConectaDB.getConexao(); 
    }
    
    @Override
    public boolean insert(Produto produto) 
    {
        try 
        {
            String sql = "insert into produto" +
                        " (descricao, preco, estoque, idcategoria)" +
                        " values(?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, produto.getDescricao());
            statement.setFloat(2, produto.getPreco());
            statement.setFloat(3, produto.getEstoque());
            statement.setInt(4, produto.getCategoria().getId());
            
            statement.execute();
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
        
        return true;
    }

    @Override
    public List<Produto> getAll() 
    {
        String sql;
        sql = "select * from produto";
        return getDataFromDb(sql);
    }

    @Override
    public List<Produto> findByILike(FiltroProduto filter) 
    {
        String sql;
        sql = "select * from produto"
            + " where descricao ILIKE '%" + filter.getDescricao() + "%'";
        
        if (filter.getCategoria() != null)
            sql += " and idcategoria = '" + filter.getCategoria().getId() + "'";
        
        return getDataFromDb(sql);
    }

    @Override
    public Produto getById(int id) {
        String sql = "Select * from Produto where id = '" + id + "'";
        List<Produto> listaProdutos = getDataFromDb(sql);
        if (listaProdutos.size() > 0)
            return listaProdutos.get(0);
        else
            return null;
    }
    
    @Override
    public List<Produto> getDataFromDb(String sql) 
    {
        List<Produto> produtos = new ArrayList<>();
        ResultSet rs = null;
        try 
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();
            
            DAOCategoria daoCategoria = new DAOCategoria();
            while (rs.next())
            {
                Produto produto = new Produto(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setEstoque(rs.getFloat("estoque"));
                
                int idxCategoria = rs.getInt("idcategoria");
                
                produto.setCategoria(daoCategoria.getAll().get(idxCategoria - 1));
                produtos.add(produto);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return produtos;
    }

    @Override
    public boolean update(Produto entity) 
    {
        try 
        {
            String sql = "update produto" +
                        " set descricao = ?, preco = ?, estoque = ?, idcategoria = ?" +
                        " where id = '" + entity.getId() + "'";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, entity.getDescricao());
            statement.setFloat(2, entity.getPreco());
            statement.setFloat(3, entity.getEstoque());
            statement.setInt(4, entity.getCategoria().getId());
            
            statement.execute();
        } 
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
        
        return true;
    }

    @Override
    public boolean delete(int id) 
    {
        try 
        {
            String sql = "delete from produto where id = '" + id + "'";
            connection.prepareStatement(sql).execute();
        } 
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
        
        return true;
    }
}
