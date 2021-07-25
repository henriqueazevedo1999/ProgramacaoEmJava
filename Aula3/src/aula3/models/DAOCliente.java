package aula3.models;

import aula3.controller.Cliente;
import aula3.controller.Contato;
import aula3.controller.Endereco;
import aula3.controller.Estados;
import aula3.controller.FiltroCliente;
import aula3.utils.ConectaDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DAOCliente
{
    public static List<Cliente> getClientes(FiltroCliente filtroCliente)
    {
        List<Cliente> clientes = new ArrayList<>();
        ResultSet rs = null;
        try 
        {
            String sql;
            Connection connection = ConectaDB.getConexao();
            sql = "select * from cliente "
                + "where nome ILIKE '%" + filtroCliente.getNome()+ "%'"
                + " and cpf ILIKE '%" + filtroCliente.getCpf() + "%'"
                + " and fone LIKE '%" + filtroCliente.getFiltroContato().getFone() + "%'"
                + " and email ILIKE '%" + filtroCliente.getFiltroContato().getEmail()+ "%'"
                + " and rua ILIKE '%" + filtroCliente.getFiltroEndereco().getRua() + "%'"
                + " and bairro ILIKE '%" + filtroCliente.getFiltroEndereco().getBairro() + "%'"
                + " and cep LIKE '%" + filtroCliente.getFiltroEndereco().getCep() + "%'"
                + " and cidade ILIKE '%" + filtroCliente.getFiltroEndereco().getCidade() + "%'";
                   
            if (!filtroCliente.getFiltroEndereco().getEstado().isEmpty())
                sql += " and uf = '" + filtroCliente.getFiltroEndereco().getEstado() + "'";
            
            PreparedStatement statement = connection.prepareStatement(sql);
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
            Logger.getLogger(DAOCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }
    
    public static boolean salvar (Cliente cliente)
    {
        try 
        {
            Connection connection = ConectaDB.getConexao();
            String sql = "insert into cliente" +
                        "(nome, cpf, fone, email, rua, numero, bairro, cep, cidade, uf)" +
                        "values(?,?,?,?,?,?,?,?,?,?)";
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
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
        
        return true;
    }
}
