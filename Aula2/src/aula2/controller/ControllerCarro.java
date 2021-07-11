package aula2.controller;

import aula2.models.DAOCarro;
import java.util.ArrayList;
import java.util.List;

public class ControllerCarro
{
    private List<Carro> lista = new ArrayList<>();
    
    public boolean Salvar(Carro carro)
    {
        
        lista.add(carro);
        
        return DAOCarro.Salvar(carro);
    }
    
    public List<Carro> GetCarros()
    {
        return lista;
    }
}
