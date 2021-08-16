package Vendas.utils;

import java.util.List;

public interface IDAO<T, filtroT>
{
    public boolean insert(T entity);
    public boolean update(T entity);
    public boolean delete(int id);
    public T getById(int id);
    public List<T> getAll();
    public List<T> findByILike(filtroT filter);
    public List<T> getDataFromDb(String sql);
}
