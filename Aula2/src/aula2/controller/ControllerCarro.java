package aula2.controller;

import java.util.ArrayList;
import java.util.List;

public class ControllerCarro
{
    private List<Carro> lista = new ArrayList<>();
    
    public boolean Salvar(Carro carro)
    {
        lista.add(carro);
        return true;
    }
    
    public List<Carro> GetCarros()
    {
        return lista;
    }
}
