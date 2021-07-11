package aula2.models;

import java.util.List;

public interface ICrud<T>
{
    public boolean Salvar(T objeto);
    public List<T> Ler();
}
