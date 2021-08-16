package Vendas.models;

import Vendas.utils.IDAO;
import Vendas.controller.Cliente;
import Vendas.controller.Contato;
import Vendas.controller.Endereco;
import Vendas.controller.FiltroCliente;
import Vendas.utils.ConectaDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOCliente implements IDAO<Cliente, FiltroCliente>
{
    private Connection connection;
    
    public DAOCliente() 
    {
        connection = ConectaDB.getConexao();
    }
    
    @Override
    public boolean insert (Cliente cliente)
    {
        try 
        {
            String sql = "insert into cliente"
                    + " (nome, cpf, fone, email, rua, numero, bairro, cep, cidade, uf)"
                    + " values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCpf());
            statement.setString(3, cliente.getContato().getFone());
            statement.setString(4, cliente.getContato().getEmail());
            statement.setString(5, cliente.getEndereco().getRua());
            statement.setInt(6, cliente.getEndereco().getNumero());
            statement.setString(7, cliente.getEndereco().getBairro());
            statement.setString(8, cliente.getEndereco().getCep());
            statement.setString(9, cliente.getEndereco().getCidade());
            statement.setString(10, cliente.getEndereco().getEstado());
            
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
    public List<Cliente> getAll()
    {
        String sql = "select * from cliente";
        return getDataFromDb(sql);
    }

    @Override
    public List<Cliente> findByILike(FiltroCliente filter)
    {
        String sql = "select * from cliente"
                + " where nome ILIKE '%" + filter.getNome()+ "%'"
                + " and cpf ILIKE '%" + filter.getCpf() + "%'"
                + " and fone LIKE '%" + filter.getFiltroContato().getFone() + "%'"
                + " and email ILIKE '%" + filter.getFiltroContato().getEmail()+ "%'"
                + " and rua ILIKE '%" + filter.getFiltroEndereco().getRua() + "%'"
                + " and bairro ILIKE '%" + filter.getFiltroEndereco().getBairro() + "%'"
                + " and cep LIKE '%" + filter.getFiltroEndereco().getCep() + "%'"
                + " and cidade ILIKE '%" + filter.getFiltroEndereco().getCidade() + "%'";

        if (!filter.getFiltroEndereco().getEstado().isEmpty())
            sql += " and uf = '" + filter.getFiltroEndereco().getEstado() + "'";
        
        return getDataFromDb(sql);
    }

    @Override
    public Cliente getById(int id)
    {
        String sql = "select * from cliente where id = '" + id + "'";
        return getDataFromDb(sql).get(0);
    }

    @Override
    public List<Cliente> getDataFromDb(String sql) 
    {
        List<Cliente> clientes = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs;
            rs = statement.executeQuery();
            while (rs.next())
            {
                Cliente cliente = new Cliente(rs.getInt("id"));
                Endereco endereco = new Endereco();
                Contato contato = new Contato();

                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));

                contato.setFone(rs.getString("fone"));
                contato.setEmail(rs.getString("email"));
                cliente.setContato(contato);

                endereco.setRua(rs.getString("rua"));
                endereco.setNumero(rs.getInt("numero"));
                endereco.setBairro(rs.getString("bairro"));
                endereco.setCep(rs.getString("cep"));
                endereco.setCidade(rs.getString("cidade"));
                endereco.setEstado(rs.getString("uf"));
                cliente.setEndereco(endereco);

                clientes.add(cliente);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        
        return clientes; 
    }

    @Override
    public boolean update(Cliente cliente) 
    {
        try 
        {
            String sql = "update cliente"
                    + " set nome = ?, cpf = ?, fone = ?, email = ?, rua = ?, numero = ?, bairro = ?, cep = ?, cidade = ?, uf = ?"
                    + " where id = '" + cliente.getId() + "'";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCpf());
            statement.setString(3, cliente.getContato().getFone());
            statement.setString(4, cliente.getContato().getEmail());
            statement.setString(5, cliente.getEndereco().getRua());
            statement.setInt(6, cliente.getEndereco().getNumero());
            statement.setString(7, cliente.getEndereco().getBairro());
            statement.setString(8, cliente.getEndereco().getCep());
            statement.setString(9, cliente.getEndereco().getCidade());
            statement.setString(10, cliente.getEndereco().getEstado());

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
            String sql = "delete from cliente where id = '" + id + "'";
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
