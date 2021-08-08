package aula3.models;

import java.util.List;

public interface IDAO<T, filtroT>
{
    boolean save(T entity);
    
    List<T> findAll();
    
    List<T> findByILike(filtroT filter);
    
    List<T> getDataFromDb(String sql);

}
