package aula3.models;

import aula3.controller.Carro;
import aula3.controller.FiltroCarro;
import aula3.utils.ConectaDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOCarro implements IDAO<Carro, FiltroCarro>
{
    Connection connection;

    public DAOCarro() 
    {
       connection = ConectaDB.getConexao(); 
    }
    
    @Override
    public boolean save(Carro carro) 
    {
        try 
        {
            String sql = "insert into carro"
                    + " (marca, modelo, placa, cor, capacidade_tanque)"
                    + " values(?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, carro.getMarca());
            preparedStatement.setString(2, carro.getModelo());
            preparedStatement.setString(3, carro.getPlaca());
            preparedStatement.setString(4, carro.getCor());
            preparedStatement.setInt(5, carro.getCapacidadeTanque());
            
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
    public List<Carro> findAll() 
    {
        String sql = "select * from carro";
        return getDataFromDb(sql);
    }

    @Override
    public List<Carro> findByILike(FiltroCarro filter) 
    {
        String sql = "select * from carro"
                + " where marca ILIKE '%" + filter.getMarca() + "%'"
                + " and modelo ILIKE '%" + filter.getModelo() + "%'"
                + " and placa LIKE '%" + filter.getPlaca() + "%'"
                + " and cor ILIKE '%" + filter.getCor() + "%'";

        return getDataFromDb(sql);
    }

    @Override
    public List<Carro> getDataFromDb(String sql) 
    {
        List<Carro> carros = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs;
            rs = statement.executeQuery();
            while (rs.next())
            {
                Carro carro = new Carro(rs.getInt("id"));

                carro.setMarca(rs.getString("marca"));
                carro.setModelo(rs.getString("modelo"));
                carro.setPlaca(rs.getString("placa"));
                carro.setCor(rs.getString("cor"));
                carro.setCapacidadeTanque(rs.getInt("capacidade_tanque"));
                
                carros.add(carro);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAOCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return carros; 
    }
}
