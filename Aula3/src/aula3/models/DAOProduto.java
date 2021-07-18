package aula3.models;

import aula3.controller.Produto;
import aula3.utils.ConectaDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOProduto// implements ICrud<Carro>
{
    public static List<Produto> getProdutos()
    {
        List<Produto> produtos = new ArrayList<>();
        ResultSet rs = null;
        try 
        {
            Connection connection = ConectaDB.getConexao();
            String sql = "select * from produto";
            PreparedStatement statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();
            while (rs.next())
            {
                Produto produto = new Produto(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setEstoque(rs.getFloat("estoque"));
                
                int idxCategoria = rs.getInt("idcategoria");
                
                produto.setCategoria(DAOCategoria.getCategorias().get(idxCategoria));
                produtos.add(produto);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAOCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produtos;
    }
    
    public static boolean salvar (Produto produto)
    {
        try 
        {
            Connection connection = ConectaDB.getConexao();
            String sql = "insert into produto" +
                        "(descricao, preco, estoque, idcategoria)" +
                        "values(?,?,?,?)";
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
}
