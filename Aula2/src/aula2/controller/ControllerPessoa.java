package aula2.controller;

import java.util.ArrayList;
import java.util.List;

public class ControllerPessoa 
{
    private List<Pessoa> lista = new ArrayList<>();
    
    public boolean SalvaPessoa(Pessoa pessoa)
    {
        lista.add(pessoa);
        return true;
    }
    
    public List<Pessoa> GetPessoas()
    {
        return lista;
    }
}
