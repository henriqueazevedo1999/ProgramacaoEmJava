package aula3.models;

import java.sql.ResultSet;
import java.util.List;

public interface DAOGenerico<T, filtroT>
{
    boolean save(T entity);
    
    List<T> findAll();
    
    List<T> findByILike(filtroT filter);

    
}
